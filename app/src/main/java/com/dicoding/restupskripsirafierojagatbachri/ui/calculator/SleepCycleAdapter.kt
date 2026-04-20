package com.dicoding.restupskripsirafierojagatbachri.ui.calculator

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.restupskripsirafierojagatbachri.R
import com.google.android.material.chip.Chip
import androidx.core.graphics.toColorInt
import com.google.android.material.card.MaterialCardView

class SleepCycleAdapter(
    private val cycles: List<SleepCycle>,
    private val onItemClick: (SleepCycle) -> Unit
) : RecyclerView.Adapter<SleepCycleAdapter.CycleViewHolder>() {

    class CycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvWakeTime: TextView = itemView.findViewById(R.id.tvWakeTime)
        val tvDuration: TextView = itemView.findViewById(R.id.tvDuration)
        val chipTag: Chip = itemView.findViewById(R.id.chipTag)
        val cardView: MaterialCardView = itemView as MaterialCardView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sleep_cycle, parent, false)
        return CycleViewHolder(view)
    }

    override fun onBindViewHolder(holder: CycleViewHolder, position: Int) {
        val cycle = cycles[position]

        holder.tvWakeTime.text = cycle.wakeUpTime
        holder.tvDuration.text = cycle.durationText
        holder.chipTag.text = cycle.tag

        try {
            val baseColor = cycle.tagColor.toColorInt()
            holder.chipTag.setTextColor(baseColor)
            val alphaColor = Color.argb(51, Color.red(baseColor), Color.green(baseColor), Color.blue(baseColor))
            holder.chipTag.chipBackgroundColor = ColorStateList.valueOf(alphaColor)
        } catch (e: Exception) { e.printStackTrace() }

        holder.cardView.setOnClickListener {
            onItemClick(cycle)
        }
    }

    override fun getItemCount(): Int = cycles.size
}