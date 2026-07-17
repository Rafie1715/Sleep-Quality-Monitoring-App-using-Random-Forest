package com.dicoding.restupskripsirafierojagatbachri.ui.home

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.graphics.toColorInt
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.databinding.FragmentHomeBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.reminder.ReminderActivity
import com.dicoding.restupskripsirafierojagatbachri.ui.tracker.SleepTrackerActivity
import com.dicoding.restupskripsirafierojagatbachri.ui.profile.EditProfileActivity
import com.bumptech.glide.Glide
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import java.util.Calendar
import javax.inject.Inject
import androidx.core.content.edit
import com.dicoding.restupskripsirafierojagatbachri.ui.calculator.SleepDebtDetailActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.slider.Slider

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var auth: FirebaseAuth

    private val viewModel: HomeViewModel by viewModels()

    private var currentSleepDebt = 0
    private var weeklyRecords: List<SleepRecord> = emptyList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupGreeting()
        setupUser()

        binding.cardSleepTrackerHome.setOnClickListener {
            val intent = Intent(requireContext(), SleepTrackerActivity::class.java)
            startActivity(intent)
        }

        binding.cardReminderHome.setOnClickListener {
            val intent = Intent(requireContext(), ReminderActivity::class.java)
            startActivity(intent)
        }

        binding.cardSetTarget.setOnClickListener {
            showSetTargetDialog()
        }

        binding.ivProfile.setOnClickListener {
            val intent = Intent(requireContext(), EditProfileActivity::class.java)
            startActivity(intent)
        }

        binding.tvSleepDebtStatus.setOnClickListener { openDebtDetail() }
        binding.ivDebtStatus.setOnClickListener { openDebtDetail() }

        setupThemeToggle()

        viewModel.fetchLatestSleep()
        viewModel.fetchWeeklySleep()
        updateReminderStatus()
        observeData()
        playAnimation()
    }

    private fun playAnimation() {
        binding.viewHeader.alpha = 0f
        binding.tvGreeting.alpha = 0f
        binding.tvUserName.alpha = 0f
        binding.ivProfile.alpha = 0f
        binding.ivThemeToggle.alpha = 0f
        binding.cardSleepSummary.alpha = 0f
        binding.tvLabelChart.alpha = 0f
        binding.cardChartPlaceholder.alpha = 0f
        binding.cardSleepTrackerHome.alpha = 0f
        binding.cardSetTarget.alpha = 0f
        binding.cardReminderHome.alpha = 0f

        val header = ObjectAnimator.ofFloat(binding.viewHeader, View.ALPHA, 1f).setDuration(400)
        val greeting = ObjectAnimator.ofFloat(binding.tvGreeting, View.ALPHA, 1f).setDuration(300)
        val name = ObjectAnimator.ofFloat(binding.tvUserName, View.ALPHA, 1f).setDuration(300)
        val profile = ObjectAnimator.ofFloat(binding.ivProfile, View.ALPHA, 1f).setDuration(300)
        val toggle = ObjectAnimator.ofFloat(binding.ivThemeToggle, View.ALPHA, 1f).setDuration(300)

        val summary = ObjectAnimator.ofFloat(binding.cardSleepSummary, View.ALPHA, 1f).setDuration(400)
        val summarySlide = ObjectAnimator.ofFloat(binding.cardSleepSummary, View.TRANSLATION_Y, 50f, 0f).setDuration(400)

        val labelChart = ObjectAnimator.ofFloat(binding.tvLabelChart, View.ALPHA, 1f).setDuration(300)
        val chart = ObjectAnimator.ofFloat(binding.cardChartPlaceholder, View.ALPHA, 1f).setDuration(400)
        val chartSlide = ObjectAnimator.ofFloat(binding.cardChartPlaceholder, View.TRANSLATION_Y, 50f, 0f).setDuration(400)

        val tracker = ObjectAnimator.ofFloat(binding.cardSleepTrackerHome, View.ALPHA, 1f).setDuration(300)
        val trackerSlide = ObjectAnimator.ofFloat(binding.cardSleepTrackerHome, View.TRANSLATION_Y, 30f, 0f).setDuration(300)

        val target = ObjectAnimator.ofFloat(binding.cardSetTarget, View.ALPHA, 1f).setDuration(300)
        val targetSlide = ObjectAnimator.ofFloat(binding.cardSetTarget, View.TRANSLATION_Y, 30f, 0f).setDuration(300)

        val reminder = ObjectAnimator.ofFloat(binding.cardReminderHome, View.ALPHA, 1f).setDuration(300)
        val reminderSlide = ObjectAnimator.ofFloat(binding.cardReminderHome, View.TRANSLATION_Y, 30f, 0f).setDuration(300)

        AnimatorSet().apply {
            playSequentially(
                header,
                AnimatorSet().apply { playTogether(greeting, name, profile, toggle) },
                AnimatorSet().apply { playTogether(summary, summarySlide) },
                labelChart,
                AnimatorSet().apply { playTogether(chart, chartSlide) },
                AnimatorSet().apply { playTogether(tracker, trackerSlide) },
                AnimatorSet().apply { playTogether(target, targetSlide) },
                AnimatorSet().apply { playTogether(reminder, reminderSlide) }
            )
            start()
        }
    }

    private fun updateReminderStatus() {
        val sharedPref = requireActivity().getSharedPreferences("ReminderPref", Context.MODE_PRIVATE)
        val isReminderOn = sharedPref.getBoolean("REMINDER_STATUS", false)
        val timeString = sharedPref.getString("REMINDER_TIME_STRING", null)

        if (isReminderOn && timeString != null) {
            binding.tvReminderTimeHome.text = timeString
        } else {
            binding.tvReminderTimeHome.text = getString(R.string.belum_diatur)
        }
    }

    private fun setupThemeToggle() {
        val sharedPref = requireActivity().getSharedPreferences("Settings", Context.MODE_PRIVATE)
        val savedMode = sharedPref.getInt("theme_mode", AppCompatDelegate.MODE_NIGHT_YES)

        updateThemeIcon(savedMode)

        binding.ivThemeToggle.setOnClickListener {
            val nextMode = if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                AppCompatDelegate.MODE_NIGHT_NO
            } else {
                AppCompatDelegate.MODE_NIGHT_YES
            }
            AppCompatDelegate.setDefaultNightMode(nextMode)
            updateThemeIcon(nextMode)

            sharedPref.edit { putInt("theme_mode", nextMode) }
        }
    }

    private fun updateThemeIcon(mode: Int) {
        if (mode == AppCompatDelegate.MODE_NIGHT_YES) {
            binding.ivThemeToggle.setImageResource(R.drawable.ic_sun)
        } else {
            binding.ivThemeToggle.setImageResource(R.drawable.ic_moon)
        }
    }

    private fun setupGreeting() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)

        val greeting = when (hour) {
            in 5..10 -> "Selamat Pagi,"
            in 11..14 -> "Selamat Siang,"
            in 15..18 -> "Selamat Sore,"
            else -> "Selamat Malam,"
        }
        binding.tvGreeting.text = greeting
    }

    private fun setupUser() {
        val user = auth.currentUser
        binding.tvUserName.text = user?.displayName ?: "Pengguna"

        if (user?.photoUrl != null) {
            binding.ivProfile.setPadding(0, 0, 0, 0)
            binding.ivProfile.imageTintList = null
            Glide.with(this)
                .load(user.photoUrl)
                .placeholder(R.drawable.ic_person)
                .error(R.drawable.ic_person)
                .circleCrop()
                .into(binding.ivProfile)
        } else {
            binding.ivProfile.setImageResource(R.drawable.ic_person)
            binding.ivProfile.imageTintList = android.content.res.ColorStateList.valueOf(Color.WHITE)
            binding.ivProfile.setPadding(24, 24, 24, 24)
        }
    }

    private fun observeData() {
        viewModel.latestSleep.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Resource.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.tvSleepDuration.text = getString(R.string.memuat)
                    binding.tvSleepQuality.text = "..."
                }
                is Resource.Success -> {
                    binding.progressBar.visibility = View.GONE
                    val record = result.data
                    if (record != null) {
                        val hours = record.duration_minutes / 60
                        val mins = record.duration_minutes % 60
                        binding.tvSleepDuration.text = getString(R.string.sleep_duration_format, hours, mins)

                        val quality = record.sleep_quality.ifEmpty {
                            getString(R.string.menunggu_analisis_ai)
                        }
                        binding.tvSleepQuality.text = quality

                        calculateSleepDebt(hours)

                    } else {
                        binding.tvSleepDuration.text = getString(R.string.zero_duration)
                        binding.tvSleepQuality.text = getString(R.string.belum_ada_data)
                        calculateSleepDebt(0)
                    }
                }
                is Resource.Error -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(requireContext(), "Gagal memuat data: ${result.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }

        viewModel.weeklySleep.observe(viewLifecycleOwner) { result ->
            if (result is Resource.Success) {
                weeklyRecords = result.data
                setupChart(weeklyRecords)
                calculateSleepStreak(weeklyRecords)
            }
        }
    }

    private fun calculateSleepStreak(records: List<SleepRecord>) {
        val sharedPref = requireActivity().getSharedPreferences("RestUP_Prefs", Context.MODE_PRIVATE)
        val targetHours = sharedPref.getInt("SLEEP_TARGET", 7)
        
        var streak = 0
        for (record in records.reversed()) {
            if (record.duration_minutes >= targetHours * 60) {
                streak++
            } else {
                break
            }
        }
        
        binding.tvStreakCount.text = "$streak Hari Streak"
        if (streak > 0) {
            binding.cardStreak.visibility = View.VISIBLE
        } else {
            binding.cardStreak.visibility = View.GONE
        }
    }



    private fun calculateSleepDebt(lastSleepHours: Int) {
        val sharedPref = requireActivity().getSharedPreferences("RestUP_Prefs", Context.MODE_PRIVATE)
        val targetHours = sharedPref.getInt("SLEEP_TARGET", 7)

        currentSleepDebt = targetHours - lastSleepHours

        binding.tvTargetDisplay.text = getString(R.string.target_display_format, targetHours)

        when {
            currentSleepDebt > 0 -> {
                binding.tvSleepDebtStatus.text = getString(R.string.sleep_debt_format, currentSleepDebt)
                binding.tvSleepDebtStatus.setTextColor("#D32F2F".toColorInt())
                binding.ivDebtStatus.setImageResource(R.drawable.ic_warning)
                binding.ivDebtStatus.setColorFilter("#D32F2F".toColorInt())
                binding.cardSleepDebt.setCardBackgroundColor("#FFF0F0".toColorInt())
                binding.cardSleepDebt.strokeColor = "#FFCDD2".toColorInt()
            }
            currentSleepDebt < 0 -> {
                val over = currentSleepDebt * -1
                binding.tvSleepDebtStatus.text = getString(R.string.sleep_over_format, over)
                binding.tvSleepDebtStatus.setTextColor("#E65100".toColorInt())
                binding.ivDebtStatus.setImageResource(R.drawable.ic_info)
                binding.ivDebtStatus.setColorFilter("#E65100".toColorInt())
                binding.cardSleepDebt.setCardBackgroundColor("#FFF8E1".toColorInt())
                binding.cardSleepDebt.strokeColor = "#FFE082".toColorInt()
            }
            else -> {
                binding.tvSleepDebtStatus.text = getString(R.string.target_reached)
                binding.tvSleepDebtStatus.setTextColor("#2E7D32".toColorInt())
                binding.ivDebtStatus.setImageResource(R.drawable.ic_check_circle)
                binding.ivDebtStatus.setColorFilter("#2E7D32".toColorInt())
                binding.cardSleepDebt.setCardBackgroundColor("#E8F5E9".toColorInt())
                binding.cardSleepDebt.strokeColor = "#C8E6C9".toColorInt()
            }
        }
    }

    private fun openDebtDetail() {
        val intent = Intent(requireContext(), SleepDebtDetailActivity::class.java)
        intent.putExtra("EXTRA_DEBT_HOURS", currentSleepDebt)
        startActivity(intent)
    }

    private fun showSetTargetDialog() {
        val bottomSheet = BottomSheetDialog(requireContext())
        val view = layoutInflater.inflate(R.layout.bottom_sheet_target, null, false)
        bottomSheet.setContentView(view)

        val slider = view.findViewById<Slider>(R.id.slider_target)
        val tvValue = view.findViewById<TextView>(R.id.tv_slider_value)
        val btnSave = view.findViewById<Button>(R.id.btn_save_target)

        val sharedPref = requireActivity().getSharedPreferences("RestUP_Prefs", Context.MODE_PRIVATE)
        val currentTarget = sharedPref.getInt("SLEEP_TARGET", 7)

        slider.value = currentTarget.toFloat()
        tvValue.text = getString(R.string.hours_unit_format, currentTarget)

        slider.addOnChangeListener { _, value, _ ->
            tvValue.text = getString(R.string.hours_unit_format, value.toInt())
        }

        btnSave.setOnClickListener {
            val newTarget = slider.value.toInt()
            sharedPref.edit { putInt("SLEEP_TARGET", newTarget) }

            viewModel.fetchLatestSleep()
            bottomSheet.dismiss()
        }

        bottomSheet.show()
    }

    private fun setupChart(records: List<SleepRecord>) {
        if (records.isEmpty()) {
            binding.barChart.clear()
            binding.layoutEmptyChart.root.visibility = View.VISIBLE
            
            val density = resources.displayMetrics.density
            val size = (80 * density).toInt()
            binding.layoutEmptyChart.ivEmpty.layoutParams.width = size
            binding.layoutEmptyChart.ivEmpty.layoutParams.height = size
            
            binding.layoutEmptyChart.tvEmptyTitle.textSize = 14f
            binding.layoutEmptyChart.tvEmptyDesc.text = getString(R.string.belum_ada_riwayat_mingguan)
            return
        }

        binding.layoutEmptyChart.root.visibility = View.GONE
        val entries = ArrayList<BarEntry>()
        val labels = ArrayList<String>()

        records.forEachIndexed { index, record ->
            val hours = record.duration_minutes / 60f
            entries.add(BarEntry(index.toFloat(), hours))
            labels.add(record.date.take(5))
        }

        val isDarkMode = (resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK) == android.content.res.Configuration.UI_MODE_NIGHT_YES
        val textColor = if (isDarkMode) Color.WHITE else Color.BLACK

        val dataSet = BarDataSet(entries, "Durasi Tidur (Jam)")
        dataSet.color = "#4CAF50".toColorInt()
        dataSet.valueTextColor = textColor
        dataSet.valueTextSize = 10f

        val barData = BarData(dataSet)
        binding.barChart.data = barData

        val xAxis = binding.barChart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.valueFormatter = IndexAxisValueFormatter(labels)
        xAxis.granularity = 1f
        xAxis.setDrawGridLines(false)
        xAxis.textColor = textColor

        binding.barChart.axisRight.isEnabled = false
        binding.barChart.axisLeft.axisMinimum = 0f
        binding.barChart.axisLeft.textColor = textColor
        binding.barChart.legend.textColor = textColor

        binding.barChart.description.isEnabled = false
        binding.barChart.animateY(1000)

        binding.barChart.invalidate()
    }

    override fun onResume() {
        super.onResume()
        viewModel.fetchLatestSleep()
        viewModel.fetchWeeklySleep()
        updateReminderStatus()
        setupGreeting()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}