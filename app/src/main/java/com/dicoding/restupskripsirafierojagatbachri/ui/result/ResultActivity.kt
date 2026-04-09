package com.dicoding.restupskripsirafierojagatbachri.ui.result

import android.os.Build
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityResultBinding
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
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
        }

        binding.btnBack.setOnClickListener { finish() }
    }

    private fun displayResult(record: SleepRecord) {
        binding.tvDateDetail.text = record.date

        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        binding.tvTimeRange.text = "${sdf.format(Date(record.sleep_time))} - ${sdf.format(Date(record.wake_time))}"

        val hours = record.duration_minutes / 60
        val mins = record.duration_minutes % 60
        binding.tvDurationDetail.text = "${hours}j ${mins}m"

        binding.tvQualityDetail.text = record.sleep_quality.ifEmpty { "Menunggu Analisis AI" }

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
