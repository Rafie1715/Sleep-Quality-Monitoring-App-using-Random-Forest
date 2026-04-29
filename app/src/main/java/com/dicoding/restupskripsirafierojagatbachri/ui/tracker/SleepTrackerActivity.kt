package com.dicoding.restupskripsirafierojagatbachri.ui.tracker

import android.app.NotificationManager
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.ColorStateList
import android.os.Bundle
import android.provider.Settings
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
import com.dicoding.restupskripsirafierojagatbachri.ui.calculator.SksCalculatorActivity
import com.dicoding.restupskripsirafierojagatbachri.ui.result.ResultActivity
import com.dicoding.restupskripsirafierojagatbachri.utils.SleepQualityClassifier

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

        sharedPref = getSharedPreferences("SleepTrackerPref", MODE_PRIVATE)

        checkSleepStatus()

        binding.btnToggleSleep.setOnClickListener {
            if (isSleeping) {
                stopSleep()
            } else {
                startSleep()
            }
        }

        if (!isNotificationPolicyAccessGranted()) {
            Toast.makeText(this, "Fitur Jangan Ganggu belum diaktifkan", Toast.LENGTH_SHORT).show()
        }

        binding.btnOpenSks.setOnClickListener {
            val intent = Intent(this, SksCalculatorActivity::class.java)
            startActivity(intent)
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
                    Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra("EXTRA_SLEEP_RECORD", result.data)
                    startActivity(intent)
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
        if (!isNotificationPolicyAccessGranted()) {
            requestDndPermission()
            return
        }

        setDndMode(true)

        sleepStartTime = System.currentTimeMillis()
        sharedPref.edit { putLong("START_TIME", sleepStartTime) }
        isSleeping = true

        updateUI()
        Toast.makeText(this, "Selamat tidur! Mode Jangan Ganggu aktif. 🌙", Toast.LENGTH_SHORT).show()
    }

    private fun stopSleep() {
        setDndMode(false)

        val wakeUpTime = System.currentTimeMillis()
        val durationMillis = wakeUpTime - sleepStartTime
        val durationMinutes = (durationMillis / (1000 * 60)).toInt()

        sharedPref.edit { putLong("START_TIME", 0L) }
        isSleeping = false
        updateUI()

        showMorningSurvey(sleepStartTime, wakeUpTime, durationMinutes)
    }

    private fun isNotificationPolicyAccessGranted(): Boolean {
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        return notificationManager.isNotificationPolicyAccessGranted
    }

    private fun requestDndPermission() {
        androidx.appcompat.app.AlertDialog.Builder(this)
            .setTitle("Izin Jangan Ganggu")
            .setMessage("Aplikasi memerlukan izin 'Jangan Ganggu' agar dapat membisukan notifikasi secara otomatis saat kamu tidur. Izinkan di halaman berikutnya?")
            .setPositiveButton("Buka Pengaturan") { _, _ ->
                val intent = Intent(Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS)
                startActivity(intent)
            }
            .setNegativeButton("Batal", null)
            .show()
    }

    private fun setDndMode(enabled: Boolean) {
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        if (isNotificationPolicyAccessGranted()) {
            if (enabled) {
                notificationManager.setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_PRIORITY)
            } else {
                notificationManager.setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_ALL)
            }
        }
    }

    private fun showMorningSurvey(sleepTime: Long, wakeTime: Long, durationMins: Int) {
        val bottomSheet = MorningSurveyBottomSheet()

        bottomSheet.onSubmitListener = { latency, isStressed, hasCaffeine, highScreenTime, freqAwake, badTemp, mood ->
            val sdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
            val currentDate = sdf.format(Date(wakeTime))

            val features = DoubleArray(13)

            features[0] = durationMins.toDouble()
            features[1] = if (isStressed) 1.0 else 0.0
            features[2] = if (hasCaffeine) 1.0 else 0.0
            features[3] = if (highScreenTime) 1.0 else 0.0
            features[4] = if (freqAwake) 1.0 else 0.0
            features[5] = if (badTemp) 1.0 else 0.0

            val latLower = latency.lowercase()
            features[6] = if (latLower.contains("15") && latLower.contains("30")) 1.0 else 0.0
            features[7] = if (latLower.contains("30") && latLower.contains("60")) 1.0 else 0.0
            features[8] = if (latLower.contains("<") || latLower.contains("kurang")) 1.0 else 0.0
            features[9] = if (latLower.contains(">") || latLower.contains("lebih")) 1.0 else 0.0

            val moodLower = mood.lowercase()
            features[10] = if (moodLower.contains("baik") || moodLower.contains("bugar")) 1.0 else 0.0
            features[11] = if (moodLower.contains("buruk") || moodLower.contains("lelah")) 1.0 else 0.0
            features[12] = if (moodLower.contains("cukup") || moodLower.contains("biasa")) 1.0 else 0.0

            if (features[10] == 0.0 && features[11] == 0.0 && features[12] == 0.0) {
                features[12] = 1.0
            }

            val finalClassification: String

            if (durationMins < 180) {
                finalClassification = "Buruk"
            } else {
                val aiScores = SleepQualityClassifier.score(features)
                var maxIndex = 0
                for (i in aiScores.indices) {
                    if (aiScores[i] > aiScores[maxIndex]) {
                        maxIndex = i
                    }
                }
                finalClassification = when (maxIndex) {
                    0 -> "Baik"
                    1 -> "Buruk"
                    2 -> "Cukup"
                    else -> "Cukup"
                }
            }

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
                wake_up_mood = mood,
                sleep_quality = finalClassification
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