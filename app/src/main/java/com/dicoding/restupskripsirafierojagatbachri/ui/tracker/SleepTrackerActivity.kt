package com.dicoding.restupskripsirafierojagatbachri.ui.tracker

import android.content.Context
import android.content.SharedPreferences
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivitySleepTrackerBinding
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import com.dicoding.restupskripsirafierojagatbachri.utils.SleepRecommendationEngine
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import androidx.core.content.edit
import androidx.core.graphics.toColorInt

@AndroidEntryPoint
class SleepTrackerActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySleepTrackerBinding
    private lateinit var sharedPref: SharedPreferences

    private val viewModel: TrackerViewModel by viewModels()

    private var isSleeping = false
    private var sleepStartTime: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySleepTrackerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        sharedPref = getSharedPreferences("SleepTrackerPref", Context.MODE_PRIVATE)

        checkSleepStatus()

        binding.btnToggleSleep.setOnClickListener {
            if (isSleeping) {
                stopSleep()
            } else {
                startSleep()
            }
        }

        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.saveStatus.observe(this) { result ->
            when (result) {
                is Resource.Loading -> {
                    binding.btnToggleSleep.isEnabled = false
                    Toast.makeText(this, "Menyimpan data...", Toast.LENGTH_SHORT).show()
                }
                is Resource.Success -> {
                    binding.btnToggleSleep.isEnabled = true
                    Toast.makeText(this, result.data, Toast.LENGTH_LONG).show()

                    finish()
                }
                is Resource.Error -> {
                    binding.btnToggleSleep.isEnabled = true
                    Toast.makeText(this, "Gagal: ${result.message}", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun checkSleepStatus() {
        sleepStartTime = sharedPref.getLong("START_TIME", 0L)
        isSleeping = sleepStartTime != 0L

        updateUI()
    }

    private fun startSleep() {
        sleepStartTime = System.currentTimeMillis()

        sharedPref.edit { putLong("START_TIME", sleepStartTime) }
        isSleeping = true

        updateUI()
        Toast.makeText(this, "Selamat tidur! 🌙", Toast.LENGTH_SHORT).show()
    }

    private fun stopSleep() {
        val wakeUpTime = System.currentTimeMillis()

        val durationMillis = wakeUpTime - sleepStartTime
        val durationMinutes = (durationMillis / (1000 * 60)).toInt()

        sharedPref.edit { putLong("START_TIME", 0L) }
        isSleeping = false
        updateUI()

        showMorningSurvey(sleepStartTime, wakeUpTime, durationMinutes)
    }

    private fun showMorningSurvey(sleepTime: Long, wakeTime: Long, durationMins: Int) {
        val bottomSheet = MorningSurveyBottomSheet()

        bottomSheet.onSubmitListener = { latency, isStressed, hasCaffeine, highScreenTime, freqAwake, badTemp, mood ->

            val sdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
            val currentDate = sdf.format(Date(wakeTime))

            val sleepRecord = SleepRecord(
                date = currentDate,
                sleep_time = sleepTime,
                wake_time = wakeTime,
                duration_minutes = durationMins,
                sleep_latency = latency,
                is_stressed = isStressed,
                has_caffeine = hasCaffeine,
                high_screen_time = highScreenTime,
                frequent_awakenings = freqAwake,
                bad_temperature = badTemp,
                wake_up_mood = mood
            )

            val saran = SleepRecommendationEngine.generateRecommendation(sleepRecord)
            sleepRecord.recommendation = saran

            viewModel.saveSleepRecord(sleepRecord)
        }

        bottomSheet.show(supportFragmentManager, "MorningSurveyBottomSheet")
    }

    private fun updateUI() {
        if (isSleeping) {
            binding.tvGreeting.text = "Ssst... Sedang Tidur"
            binding.tvSubtitle.text = "Aplikasi sedang merekam waktu tidurmu."
            binding.tvTrackerStatus.text = "Tidur dimulai pada: ${formatTime(sleepStartTime)}"

            binding.btnToggleSleep.text = "BANGUN\nTIDUR"
            binding.btnToggleSleep.backgroundTintList = ColorStateList.valueOf("#FF7043".toColorInt())
        } else {
            binding.tvGreeting.text = "Siap untuk beristirahat?"
            binding.tvSubtitle.text = "Pastikan lingkungan tidurmu nyaman."
            binding.tvTrackerStatus.text = "Belum ada aktivitas tidur direkam"

            binding.btnToggleSleep.text = "MULAI\nTIDUR"
            binding.btnToggleSleep.backgroundTintList = ColorStateList.valueOf("#4CAF50".toColorInt())
        }
    }

    private fun formatTime(timeInMillis: Long): String {
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        return sdf.format(Date(timeInMillis))
    }
}