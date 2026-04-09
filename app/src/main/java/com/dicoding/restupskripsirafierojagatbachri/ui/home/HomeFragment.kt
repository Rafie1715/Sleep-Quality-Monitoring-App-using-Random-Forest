package com.dicoding.restupskripsirafierojagatbachri.ui.home

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.databinding.FragmentHomeBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.tracker.SleepTrackerActivity
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
import androidx.core.graphics.toColorInt
import com.dicoding.restupskripsirafierojagatbachri.ui.reminder.ReminderActivity

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var auth: FirebaseAuth

    private val viewModel: HomeViewModel by viewModels()

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

        viewModel.fetchLatestSleep()
        viewModel.fetchWeeklySleep()
        observeData()
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
    }

    private fun observeData() {
        viewModel.latestSleep.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Resource.Loading -> {
                    binding.tvSleepDuration.text = "Memuat..."
                    binding.tvSleepQuality.text = "..."
                }
                is Resource.Success -> {
                    val record = result.data
                    if (record != null) {
                        val hours = record.duration_minutes / 60
                        val mins = record.duration_minutes % 60
                        binding.tvSleepDuration.text = "${hours}j ${mins}m"

                        val quality = record.sleep_quality.ifEmpty {
                            "Menunggu Analisis AI"
                        }
                        binding.tvSleepQuality.text = quality
                    } else {
                        binding.tvSleepDuration.text = "0j 0m"
                        binding.tvSleepQuality.text = "Belum Ada Data"
                    }
                }
                is Resource.Error -> {
                    Toast.makeText(requireContext(), "Gagal memuat data: ${result.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }

        viewModel.weeklySleep.observe(viewLifecycleOwner) { result ->
            if (result is Resource.Success) {
                val records = result.data ?: emptyList()
                setupChart(records)
            }
        }
    }

    private fun setupChart(records: List<SleepRecord>) {
        if (records.isEmpty()) {
            binding.barChart.clear()
            return
        }

        val entries = ArrayList<BarEntry>()
        val labels = ArrayList<String>()

        records.forEachIndexed { index, record ->
            val hours = record.duration_minutes / 60f
            entries.add(BarEntry(index.toFloat(), hours))

            labels.add(record.date.take(6))
        }

        val dataSet = BarDataSet(entries, "Durasi Tidur (Jam)")
        dataSet.color = "#4CAF50".toColorInt()
        dataSet.valueTextColor = Color.BLACK
        dataSet.valueTextSize = 12f

        val barData = BarData(dataSet)
        binding.barChart.data = barData

        val xAxis = binding.barChart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.valueFormatter = IndexAxisValueFormatter(labels)
        xAxis.granularity = 1f
        xAxis.setDrawGridLines(false)

        binding.barChart.axisRight.isEnabled = false
        binding.barChart.axisLeft.axisMinimum = 0f

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
