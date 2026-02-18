package com.dicoding.restupskripsirafierojagatbachri.ui.tracker

import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.provider.Settings
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivitySleepTrackerBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.result.ResultActivity
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale

@AndroidEntryPoint
class SleepTrackerActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySleepTrackerBinding

    // Variabel Timer
    private var startTime = 0L
    private var timeInSeconds = 0L
    private var isRunning = false
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var notificationManager: NotificationManager
    private var isDndActive = false

    // Runnable yang dijalankan berulang-ulang setiap detik
    private val timerRunnable = object : Runnable {
        override fun run() {
            if (isRunning) {
                val millis = SystemClock.uptimeMillis() - startTime
                timeInSeconds = millis / 1000

                // Update UI: Detik -> Jam:Menit:Detik
                val hours = timeInSeconds / 3600
                val minutes = (timeInSeconds % 3600) / 60
                val secs = timeInSeconds % 60

                val timeString = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, secs)
                binding.tvTimer.text = timeString

                // Ulangi lagi 1 detik kemudian
                handler.postDelayed(this, 1000)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySleepTrackerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi Notification Manager
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Cek status awal DND (Siapa tahu user sudah set DND dari luar)
        checkCurrentDndState()

        // Tombol DND ditekan
        binding.btnDndToggle.setOnClickListener {
            toggleDndMode()
        }

        // 1. Mulai Timer Otomatis saat halaman dibuka
        startTimer()

        // 2. Tombol STOP / BANGUN
        binding.btnStopSleep.setOnClickListener {
            stopTimer()
            disableDndMode()
            goToResultPage()
        }
    }

    // Fungsi Cek & Ubah DND
    private fun toggleDndMode() {
        // 1. Cek Izin Dulu
        if (notificationManager.isNotificationPolicyAccessGranted) {
            // Punya Izin -> Toggle ON/OFF
            if (isDndActive) {
                disableDndMode()
            } else {
                enableDndMode()
            }
        } else {
            // Belum Punya Izin -> Buka Settings
            Toast.makeText(this, "Izinkan akses 'Jangan Ganggu' untuk fitur ini", Toast.LENGTH_LONG).show()
            val intent = Intent(Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS)
            startActivity(intent)
        }
    }

    private fun enableDndMode() {
        // Set ke Mode: Interruption Filter None (Hening Total) atau Priority
        try {
            notificationManager.setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_PRIORITY)
            isDndActive = true
            updateDndIcon()
            Toast.makeText(this, "Mode Jangan Ganggu: AKTIF", Toast.LENGTH_SHORT).show()
        } catch (e: SecurityException) {
            // Jaga-jaga kalau izin dicabut tiba-tiba
        }
    }

    private fun disableDndMode() {
        // Set ke Mode: Interruption Filter All (Semua Notif Masuk)
        try {
            // Hanya matikan jika kita yang mengaktifkan (opsional)
            notificationManager.setInterruptionFilter(NotificationManager.INTERRUPTION_FILTER_ALL)
            isDndActive = false
            updateDndIcon()
            Toast.makeText(this, "Mode Jangan Ganggu: NON-AKTIF", Toast.LENGTH_SHORT).show()
        } catch (e: SecurityException) {
            // Ignore
        }
    }

    private fun checkCurrentDndState() {
        // Cek apakah HP sedang DND saat aplikasi dibuka
        val filter = notificationManager.currentInterruptionFilter
        isDndActive = (filter == NotificationManager.INTERRUPTION_FILTER_NONE ||
                filter == NotificationManager.INTERRUPTION_FILTER_PRIORITY ||
                filter == NotificationManager.INTERRUPTION_FILTER_ALARMS)
        updateDndIcon()
    }

    private fun updateDndIcon() {
        if (isDndActive) {
            // Ganti warna icon jadi Aktif (misal: Putih/Kuning)
            binding.btnDndToggle.setColorFilter(getColor(R.color.white)) // Atau warna accent
        } else {
            // Ganti warna icon jadi Mati (misal: Abu-abu)
            binding.btnDndToggle.setColorFilter(getColor(android.R.color.darker_gray))
        }
    }

    private fun startTimer() {
        startTime = SystemClock.uptimeMillis()
        isRunning = true

        binding.tvTimer.animate()
            .alpha(0.7f)
            .setDuration(1000)
            .withEndAction {
                binding.tvTimer.animate().alpha(1.0f).setDuration(1000).start()
            }
            .start()

        handler.postDelayed(timerRunnable, 0)
    }

    private fun stopTimer() {
        isRunning = false
        handler.removeCallbacks(timerRunnable)
    }

    private fun goToResultPage() {
        // Kirim data durasi tidur ke halaman hasil
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("EXTRA_DURATION_SECONDS", timeInSeconds)
        startActivity(intent)
        finish() // Tutup halaman tracker agar tidak bisa di-back
    }

    override fun onResume() {
        super.onResume()
        checkCurrentDndState()
    }
}