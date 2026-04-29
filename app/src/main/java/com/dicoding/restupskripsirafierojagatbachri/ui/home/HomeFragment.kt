package com.dicoding.restupskripsirafierojagatbachri.ui.home

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
import com.dicoding.restupskripsirafierojagatbachri.ui.chat.ChatActivity
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

        binding.fabSleepTrack.setOnClickListener {
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

        binding.cardRestbotHome.setOnClickListener {
            val intent = Intent(requireContext(), ChatActivity::class.java)
            startActivity(intent)
        }

        binding.ivProfile.setOnClickListener {
            val intent = Intent(requireContext(), EditProfileActivity::class.java)
            startActivity(intent)
        }

        // #PERUBAHAN: Klik Status Utang Tidur membuka Rencana Pemulihan
        binding.tvSleepDebtStatus.setOnClickListener { openDebtDetail() }
        binding.ivDebtStatus.setOnClickListener { openDebtDetail() }

        setupThemeToggle()

        viewModel.fetchLatestSleep()
        viewModel.fetchWeeklySleep()
        observeData()
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
                    binding.tvSleepDuration.text = "Memuat..."
                    binding.tvSleepQuality.text = "..."
                }
                is Resource.Success -> {
                    binding.progressBar.visibility = View.GONE
                    val record = result.data
                    if (record != null) {
                        val hours = record.duration_minutes / 60
                        val mins = record.duration_minutes % 60
                        binding.tvSleepDuration.text = "${hours}j ${mins}m"

                        val quality = record.sleep_quality.ifEmpty {
                            "Menunggu Analisis AI"
                        }
                        binding.tvSleepQuality.text = quality

                        calculateSleepDebt(hours)

                    } else {
                        binding.tvSleepDuration.text = "0j 0m"
                        binding.tvSleepQuality.text = "Belum Ada Data"
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
                val records = result.data
                setupChart(records)
            }
        }
    }

    private fun calculateSleepDebt(lastSleepHours: Int) {
        val sharedPref = requireActivity().getSharedPreferences("RestUP_Prefs", Context.MODE_PRIVATE)
        val targetHours = sharedPref.getInt("SLEEP_TARGET", 7)

        currentSleepDebt = targetHours - lastSleepHours

        binding.tvTargetDisplay.text = "Target: $targetHours Jam"

        when {
            currentSleepDebt > 0 -> {
                // Keadaan: Kurang Tidur (Debt)
                binding.tvSleepDebtStatus.text = "Tidurmu kurang dari $currentSleepDebt Jam"
                binding.tvSleepDebtStatus.setTextColor("#D32F2F".toColorInt())
                binding.ivDebtStatus.setImageResource(R.drawable.ic_warning)
                binding.ivDebtStatus.setColorFilter("#D32F2F".toColorInt())
                binding.cardSleepDebt.setCardBackgroundColor("#FFF0F0".toColorInt())
                binding.cardSleepDebt.strokeColor = "#FFCDD2".toColorInt()
            }
            currentSleepDebt < 0 -> {
                // Keadaan: Kelebihan Tidur (Over)
                val over = currentSleepDebt * -1
                binding.tvSleepDebtStatus.text = "Kelebihan tidur $over Jam"
                binding.tvSleepDebtStatus.setTextColor("#E65100".toColorInt())
                binding.ivDebtStatus.setImageResource(R.drawable.ic_info)
                binding.ivDebtStatus.setColorFilter("#E65100".toColorInt())
                binding.cardSleepDebt.setCardBackgroundColor("#FFF8E1".toColorInt())
                binding.cardSleepDebt.strokeColor = "#FFE082".toColorInt()
            }
            else -> {
                // Keadaan: Target Tercapai (Success)
                binding.tvSleepDebtStatus.text = "Target tidur tercapai! ✨"
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
        val view = layoutInflater.inflate(R.layout.bottom_sheet_target, null)
        bottomSheet.setContentView(view)

        val slider = view.findViewById<Slider>(R.id.slider_target)
        val tvValue = view.findViewById<TextView>(R.id.tv_slider_value)
        val btnSave = view.findViewById<Button>(R.id.btn_save_target)

        val sharedPref = requireActivity().getSharedPreferences("RestUP_Prefs", Context.MODE_PRIVATE)
        val currentTarget = sharedPref.getInt("SLEEP_TARGET", 7)

        slider.value = currentTarget.toFloat()
        tvValue.text = "$currentTarget Jam"

        slider.addOnChangeListener { _, value, _ ->
            tvValue.text = "${value.toInt()} Jam"
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
        setupGreeting()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}