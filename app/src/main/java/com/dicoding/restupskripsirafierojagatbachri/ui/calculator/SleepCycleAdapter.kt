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

class SleepCycleAdapter(private val cycles: List<SleepCycle>) :
    RecyclerView.Adapter<SleepCycleAdapter.CycleViewHolder>() {

    // 1. Inisialisasi View dari item_sleep_cycle.xml
    inner class CycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvWakeTime: TextView = itemView.findViewById(R.id.tvWakeTime)
        val tvDuration: TextView = itemView.findViewById(R.id.tvDuration)
        val chipTag: Chip = itemView.findViewById(R.id.chipTag)
    }

    // 2. Memasukkan layout XML ke dalam Adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sleep_cycle, parent, false)
        return CycleViewHolder(view)
    }

    // 3. Menghubungkan Data (SleepCycle) ke UI (ViewHolder)
    override fun onBindViewHolder(holder: CycleViewHolder, position: Int) {
        val cycle = cycles[position]

        // Set teks untuk jam bangun dan durasi
        holder.tvWakeTime.text = cycle.wakeUpTime
        holder.tvDuration.text = cycle.durationText
        holder.chipTag.text = cycle.tag

        // Set warna dinamis untuk Chip berdasarkan data tagColor
        try {
            val baseColor = cycle.tagColor.toColorInt()

            // Set warna teks Chip menjadi warna solid
            holder.chipTag.setTextColor(baseColor)

            // Set warna background Chip menjadi transparan 20% (alpha = 51)
            val alphaColor = Color.argb(
                51,
                Color.red(baseColor),
                Color.green(baseColor),
                Color.blue(baseColor)
            )
            holder.chipTag.chipBackgroundColor = ColorStateList.valueOf(alphaColor)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    // 4. Menentukan jumlah item yang akan ditampilkan
    override fun getItemCount(): Int {
        return cycles.size
    }
}