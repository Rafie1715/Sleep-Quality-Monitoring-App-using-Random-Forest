package com.dicoding.restupskripsirafierojagatbachri.ui.calculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivitySksCalculatorBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class SksCalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySksCalculatorBinding
    private lateinit var adapter: SleepCycleAdapter // Kamu perlu buat adapter sederhana

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySksCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInfoTheory.setOnClickListener {
            val infoBottomSheet = SksInfoBottomSheet()
            infoBottomSheet.show(supportFragmentManager, "SksInfoBottomSheet")
        }

        setupUI()
    }

    private fun setupUI() {
        // Tampilkan waktu sekarang
        val now = Calendar.getInstance()
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        binding.tvCurrentTime.text = "Sekarang (${sdf.format(now.time)})"

        binding.btnCalculate.setOnClickListener {
            val suggestions = generateSleepCycles(now)

            // Menyusun daftar menjadi vertikal
            binding.rvCycles.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)

            // Memasang adapter ke RecyclerView
            binding.rvCycles.adapter = SleepCycleAdapter(suggestions)

            binding.tvLabelResult.visibility = View.VISIBLE
        }
    }

    private fun generateSleepCycles(now: Calendar): List<SleepCycle> {
        val cycles = mutableListOf<SleepCycle>()
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())

        // Tambahkan 15 menit waktu tertidur
        val baseTime = now.clone() as Calendar
        baseTime.add(Calendar.MINUTE, 15)

        val tags = listOf("Power Nap", "Mode Survival", "Cukup", "Bugar", "Tidur Ideal", "Sangat Segar")
        val colors = listOf("#FF7043", "#FF9800", "#FFEB3B", "#4CAF50", "#2196F3", "#9C27B0")

        for (i in 1..6) {
            baseTime.add(Calendar.MINUTE, 90) // Tambah 1 siklus
            val timeString = sdf.format(baseTime.time)
            val durationHours = i * 1.5

            cycles.add(SleepCycle(
                wakeUpTime = timeString,
                durationText = "$durationHours Jam ($i Siklus)",
                tag = tags[i-1],
                tagColor = colors[i-1]
            ))
        }
        return cycles
    }
}