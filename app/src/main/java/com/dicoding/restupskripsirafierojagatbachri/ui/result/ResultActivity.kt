package com.dicoding.restupskripsirafierojagatbachri.ui.result

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityResultBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.chat.ChatActivity
import com.dicoding.restupskripsirafierojagatbachri.ui.reminder.AlarmReceiver
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@AndroidEntryPoint
class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sleepRecord = intent.getParcelableExtra<SleepRecord>("EXTRA_SLEEP_RECORD")

        if (sleepRecord != null) {
            displayResult(sleepRecord)
            setupChatBot(sleepRecord)
        }

        binding.btnBack.setOnClickListener { finish() }
    }

    private fun setupChatBot(record: SleepRecord) {
        binding.cardRestbot.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            intent.putExtra("EXTRA_SLEEP_RECORD", record)
            startActivity(intent)
        }
    }

    private fun scheduleRecoveryAlarm() {
        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java).apply {
            putExtra(
                "EXTRA_MESSAGE",
                "Sesi Pemulihan Medis: Kamu butuh tidur lebih awal malam ini (pukul 21:00) untuk memulihkan kondisi tubuh dari defisit tidur ekstrem."
            )
        }

        val pendingIntent = PendingIntent.getBroadcast(
            this, 102, intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 21)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
        }

        if (calendar.timeInMillis <= System.currentTimeMillis()) {
            calendar.add(Calendar.DATE, 1)
        }

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                if (alarmManager.canScheduleExactAlarms()) {
                    alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
                } else {
                    alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
                }
            } else {
                alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
            }

            Toast.makeText(
                this,
                "Rencana pemulihan diaktifkan. Pengingat tidur diset pukul 21:00.",
                Toast.LENGTH_LONG
            ).show()
        } catch (e: Exception) {
            Toast.makeText(this, "Gagal menjadwalkan alarm: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun displayResult(record: SleepRecord) {
        binding.tvDateDetail.text = record.date

        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        binding.tvTimeRange.text = "${sdf.format(Date(record.sleep_time))} - ${sdf.format(Date(record.wake_time))}"

        val hours = record.duration_minutes / 60
        val mins = record.duration_minutes % 60
        binding.tvDurationDetail.text = "${hours}j ${mins}m"

        binding.tvQualityDetail.text = record.sleep_quality.ifEmpty { "Menunggu Analisis AI" }

        if (record.sleep_quality.equals("Buruk", ignoreCase = true)) {
            binding.btnMedicalRecovery.visibility = View.VISIBLE
            binding.btnMedicalRecovery.setOnClickListener {
                scheduleRecoveryAlarm()
            }
        } else {
            binding.btnMedicalRecovery.visibility = View.GONE
        }

        if (record.recommendation.isNotEmpty()) {
            binding.tvRecommendationDetail.text = HtmlCompat.fromHtml(
                record.recommendation,
                HtmlCompat.FROM_HTML_MODE_COMPACT
            )
            binding.tvRecommendationDetail.movementMethod = LinkMovementMethod.getInstance()
        } else {
            binding.tvRecommendationDetail.text = "Belum ada saran untuk catatan ini."
        }
    }
}
