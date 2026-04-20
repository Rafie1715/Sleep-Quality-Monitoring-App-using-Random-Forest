package com.dicoding.restupskripsirafierojagatbachri.ui.calculator

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivitySksCalculatorBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.tracker.SleepTrackerActivity
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class SksCalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySksCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySksCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        val now = Calendar.getInstance()
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        binding.tvCurrentTime.text = "Sekarang (${sdf.format(now.time)})"

        binding.btnInfoTheory.setOnClickListener {
            val infoBottomSheet = SksInfoBottomSheet()
            infoBottomSheet.show(supportFragmentManager, "SksInfoBottomSheet")
        }

        binding.btnCalculate.setOnClickListener {
            val suggestions = generateSleepCycles(now)

            binding.rvCycles.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)

            binding.rvCycles.adapter = SleepCycleAdapter(suggestions) { selectedCycle ->
                showActionDialog(selectedCycle)
            }

            binding.tvLabelResult.visibility = View.VISIBLE
        }
    }

    private fun showActionDialog(cycle: SleepCycle) {
        val options = arrayOf("Atur Alarm Jam ${cycle.wakeUpTime}", "Mulai Pelacakan Tidur Sekarang")

        AlertDialog.Builder(this)
            .setTitle("Pilih Aksi Selanjutnya")
            .setItems(options) { _, which ->
                when (which) {
                    0 -> setSystemAlarm(cycle.hourOfDay, cycle.minuteOfHour)
                    1 -> startSleepTracker()
                }
            }
            .show()
    }

    private fun setSystemAlarm(hour: Int, minute: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, minute)
            putExtra(AlarmClock.EXTRA_MESSAGE, "Alarm RestUP (Bangun Akhir Siklus)")
            putExtra(AlarmClock.EXTRA_SKIP_UI, false)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "Tidak ada aplikasi Alarm yang terinstal", Toast.LENGTH_SHORT).show()
        }
    }

    private fun startSleepTracker() {
        val intent = Intent(this, SleepTrackerActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun generateSleepCycles(now: Calendar): List<SleepCycle> {
        val cycles = mutableListOf<SleepCycle>()
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())

        val baseTime = now.clone() as Calendar
        baseTime.add(Calendar.MINUTE, 15)

        val tags = listOf("Power Nap", "Mode Survival", "Cukup", "Bugar", "Tidur Ideal", "Sangat Segar")
        val colors = listOf("#FF7043", "#FF9800", "#FFEB3B", "#4CAF50", "#2196F3", "#9C27B0")

        for (i in 1..6) {
            baseTime.add(Calendar.MINUTE, 90)
            val timeString = sdf.format(baseTime.time)
            val durationHours = i * 1.5

            val hour = baseTime.get(Calendar.HOUR_OF_DAY)
            val minute = baseTime.get(Calendar.MINUTE)

            cycles.add(SleepCycle(
                wakeUpTime = timeString,
                durationText = "$durationHours Jam ($i Siklus)",
                tag = tags[i-1],
                tagColor = colors[i-1],
                hourOfDay = hour,
                minuteOfHour = minute
            ))
        }
        return cycles
    }
}