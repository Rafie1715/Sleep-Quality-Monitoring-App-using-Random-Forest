package com.dicoding.restupskripsirafierojagatbachri.ui.calculator

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivitySleepDebtDetailBinding
import androidx.core.graphics.toColorInt

class SleepDebtDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySleepDebtDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySleepDebtDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sleepDebt = intent.getIntExtra("EXTRA_DEBT_HOURS", 0)

        binding.toolbar.setNavigationOnClickListener { finish() }

        if (sleepDebt > 0) {
            binding.tvTotalDebt.text = "$sleepDebt Jam"
            binding.tvTotalDebt.setTextColor("#FF5252".toColorInt())
        } else {
            binding.tvTotalDebt.text = "Tidak Ada"
            binding.tvTotalDebt.setTextColor("#4CAF50".toColorInt())
            binding.btnSetBedtime.isEnabled = false
        }

        binding.tvRecoveryAdvice.text = generateRecoveryPlan(sleepDebt)

        binding.btnSetBedtime.setOnClickListener {
            val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                putExtra(AlarmClock.EXTRA_HOUR, 22)
                putExtra(AlarmClock.EXTRA_MINUTES, 0)
                putExtra(AlarmClock.EXTRA_MESSAGE, "Waktunya Nyicil Utang Tidur!")
                putExtra(AlarmClock.EXTRA_SKIP_UI, false)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "Aplikasi Alarm tidak ditemukan", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun generateRecoveryPlan(debt: Int): String {
        return when {
            debt <= 0 -> "Bagus! Tidak ada utang tidur."
            debt in 1..2 -> "Utang tidur ringan. Tidurlah 30-60 menit lebih awal besok."
            debt in 3..5 -> "Utang tidur sedang. Tambahkan 1 jam tidur per malam selama 3 hari ke depan."
            else -> "Utang tidur parah! Bahaya Microsleep. Cicil tidurmu 2 jam lebih lama saat Weekend."
        }
    }
}