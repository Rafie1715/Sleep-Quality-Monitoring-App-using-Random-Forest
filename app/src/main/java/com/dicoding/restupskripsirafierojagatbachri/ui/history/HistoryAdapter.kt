package com.dicoding.restupskripsirafierojagatbachri.ui.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.restupskripsirafierojagatbachri.databinding.ItemHistoryBinding

class HistoryAdapter(private val historyList: List<SleepHistory>) :
    RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemHistoryBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = historyList[position]

        // Set Text
        holder.binding.tvItemDate.text = item.date
        holder.binding.tvItemTime.text = item.timeRange
        holder.binding.tvItemDuration.text = item.duration
        holder.binding.tvItemQuality.text = item.quality

        // Set Warna Indikator & Teks Kualitas
        holder.binding.viewStatusIndicator.setBackgroundColor(holder.itemView.context.getColor(item.colorStatus))
        holder.binding.tvItemQuality.setTextColor(holder.itemView.context.getColor(item.colorStatus))
    }

    override fun getItemCount() = historyList.size
}