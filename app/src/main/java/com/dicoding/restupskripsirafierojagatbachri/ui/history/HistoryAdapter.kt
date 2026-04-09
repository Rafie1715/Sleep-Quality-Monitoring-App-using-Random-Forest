package com.dicoding.restupskripsirafierojagatbachri.ui.history

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.databinding.ItemHistoryBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import androidx.core.graphics.toColorInt

class HistoryAdapter (private val onItemClick: (SleepRecord) -> Unit) : ListAdapter<SleepRecord, HistoryAdapter.HistoryViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val binding = ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val record = getItem(position)
        holder.bind(record)
        holder.itemView.setOnClickListener { onItemClick(record) }
    }

    class HistoryViewHolder(private val binding: ItemHistoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(record: SleepRecord) {

            binding.tvItemDate.text = record.date

            val sdfTime = SimpleDateFormat("HH:mm", Locale.getDefault())
            val startTimeStr = sdfTime.format(Date(record.sleep_time))
            val wakeTimeStr = sdfTime.format(Date(record.wake_time))
            binding.tvItemTime.text = "$startTimeStr - $wakeTimeStr"

            val hours = record.duration_minutes / 60
            val mins = record.duration_minutes % 60
            binding.tvItemDuration.text = "${hours}j ${mins}m"

            val quality = record.sleep_quality.ifEmpty {
                "Menunggu AI"
            }
            binding.tvItemQuality.text = quality

            when (quality) {
                "Baik" -> {
                    binding.viewStatusIndicator.setBackgroundColor("#4CAF50".toColorInt()) // Hijau
                    binding.tvItemQuality.setTextColor("#4CAF50".toColorInt())
                }
                "Cukup" -> {
                    binding.viewStatusIndicator.setBackgroundColor("#FFC107".toColorInt()) // Kuning
                    binding.tvItemQuality.setTextColor("#FFC107".toColorInt())
                }
                "Buruk" -> {
                    binding.viewStatusIndicator.setBackgroundColor("#F44336".toColorInt()) // Merah
                    binding.tvItemQuality.setTextColor("#F44336".toColorInt())
                }
                else -> {
                    binding.viewStatusIndicator.setBackgroundColor(Color.LTGRAY)
                    binding.tvItemQuality.setTextColor(Color.GRAY)
                }
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<SleepRecord>() {
            override fun areItemsTheSame(oldItem: SleepRecord, newItem: SleepRecord): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: SleepRecord, newItem: SleepRecord): Boolean {
                return oldItem == newItem
            }
        }
    }
}