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
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@AndroidEntryPoint
class SleepTrackerActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySleepTrackerBinding
    private lateinit var sharedPref: SharedPreferences

    private val viewModel: TrackerViewModel by viewModels()

    private var isSleeping = false
    private var sleepStartTime: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi ViewBinding untuk Activity
        binding = ActivitySleepTrackerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol Back di pojok atas (opsional, jika ingin kembali ke MainActivity)
        // supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Inisialisasi SharedPreferences
        sharedPref = getSharedPreferences("SleepTrackerPref", Context.MODE_PRIVATE)

        // Cek status tidur saat halaman dibuka
        checkSleepStatus()

        // Aksi ketika tombol raksasa ditekan
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
                    // Opsional: Kamu bisa menampilkan ProgressBar di sini
                    binding.btnToggleSleep.isEnabled = false
                    Toast.makeText(this, "Menyimpan data...", Toast.LENGTH_SHORT).show()
                }
                is Resource.Success -> {
                    binding.btnToggleSleep.isEnabled = true
                    Toast.makeText(this, result.data, Toast.LENGTH_LONG).show()

                    // Tutup halaman setelah sukses disimpan
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
        // Ambil data waktu tidur yang tersimpan (default 0 kalau belum tidur)
        sleepStartTime = sharedPref.getLong("START_TIME", 0L)
        isSleeping = sleepStartTime != 0L

        updateUI()
    }

    private fun startSleep() {
        // Catat waktu sekarang (dalam milidetik)
        sleepStartTime = System.currentTimeMillis()

        // Simpan ke SharedPreferences agar aman meskipun aplikasi ditutup / HP mati
        sharedPref.edit().putLong("START_TIME", sleepStartTime).apply()
        isSleeping = true

        updateUI()
        Toast.makeText(this, "Selamat tidur! 🌙", Toast.LENGTH_SHORT).show()
    }

    private fun stopSleep() {
        // 1. Ambil waktu bangun (sekarang)
        val wakeUpTime = System.currentTimeMillis()

        // 2. Hitung durasi (Selisih waktu bangun dan tidur)
        val durationMillis = wakeUpTime - sleepStartTime
        val durationMinutes = (durationMillis / (1000 * 60)).toInt() // Konversi ke menit

        // 3. Reset SharedPreferences karena sudah bangun
        sharedPref.edit().putLong("START_TIME", 0L).apply()
        isSleeping = false
        updateUI()

        // 4. Panggil Bottom Sheet Morning Survey!
        showMorningSurvey(sleepStartTime, wakeUpTime, durationMinutes)
    }

    private fun showMorningSurvey(sleepTime: Long, wakeTime: Long, durationMins: Int) {
        val bottomSheet = MorningSurveyBottomSheet()

        // Tangkap data dari Bottom Sheet saat tombol "SIMPAN" ditekan
        bottomSheet.onSubmitListener = { latency, disturbances, habits, mood ->

            // Format tanggal hari ini (contoh: "10 Mar 2026")
            val sdf = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
            val currentDate = sdf.format(Date(wakeTime))

            // Bungkus semua data ke dalam Model Class yang sudah kita buat
            val sleepRecord = SleepRecord(
                date = currentDate,
                sleep_time = sleepTime,
                wake_time = wakeTime,
                duration_minutes = durationMins,
                sleep_latency = latency,
                disturbances = disturbances,
                habits = habits,
                mood = mood
                // Catatan: user_id, sleep_quality, dan recommendation
                // akan diisi di ViewModel/Repository nanti
            )

            viewModel.saveSleepRecord(sleepRecord)
        }

        // Di Activity, kita menggunakan supportFragmentManager (bukan parentFragmentManager)
        bottomSheet.show(supportFragmentManager, "MorningSurveyBottomSheet")
    }

    private fun updateUI() {
        if (isSleeping) {
            binding.tvGreeting.text = "Ssst... Sedang Tidur"
            binding.tvSubtitle.text = "Aplikasi sedang merekam waktu tidurmu."
            binding.tvTrackerStatus.text = "Tidur dimulai pada: ${formatTime(sleepStartTime)}"

            binding.btnToggleSleep.text = "BANGUN\nTIDUR"
            binding.btnToggleSleep.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#FF7043"))
        } else {
            binding.tvGreeting.text = "Siap untuk beristirahat?"
            binding.tvSubtitle.text = "Pastikan lingkungan tidurmu nyaman."
            binding.tvTrackerStatus.text = "Belum ada aktivitas tidur direkam"

            binding.btnToggleSleep.text = "MULAI\nTIDUR"
            binding.btnToggleSleep.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#4CAF50"))
        }
    }

    private fun formatTime(timeInMillis: Long): String {
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        return sdf.format(Date(timeInMillis))
    }
}