package com.dicoding.restupskripsirafierojagatbachri.ui.result

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityResultBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Ambil data durasi
        val durationSeconds = intent.getLongExtra("EXTRA_DURATION_SECONDS", 0)

        // 2. Format jadi Jam & Menit
        val hours = durationSeconds / 3600
        val minutes = (durationSeconds % 3600) / 60

        binding.tvResultDuration.text = "$hours Jam $minutes Menit"

        // 3. Tombol Balik
        binding.btnBackHome.setOnClickListener {
            finish() // Kembali ke Home
        }
    }
}