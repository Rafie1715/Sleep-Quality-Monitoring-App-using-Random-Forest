package com.dicoding.restupskripsirafierojagatbachri.ui.history

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.FragmentHistoryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HistoryFragment : Fragment(R.layout.fragment_history) {

    private lateinit var binding: FragmentHistoryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHistoryBinding.bind(view)

        // 1. Data Dummy (Pura-pura data dari Database)
        val dummyData = listOf(
            SleepHistory("12 Feb", "23:00 - 06:30", "7j 30m", "Baik", android.R.color.holo_green_dark),
            SleepHistory("11 Feb", "01:00 - 05:00", "4j 0m", "Buruk", android.R.color.holo_red_dark),
            SleepHistory("10 Feb", "22:30 - 06:00", "7j 30m", "Baik", android.R.color.holo_green_dark),
            SleepHistory("09 Feb", "00:00 - 06:00", "6j 0m", "Cukup", android.R.color.holo_orange_dark),
            SleepHistory("08 Feb", "02:00 - 09:00", "7j 0m", "Buruk", android.R.color.holo_red_dark)
        )

        // 2. Setup RecyclerView
        setupRecyclerView(dummyData)

        // 3. Handle Empty State (Kalau data kosong)
        if (dummyData.isEmpty()) {
            binding.rvHistory.visibility = View.GONE
            binding.tvEmptyHistory.visibility = View.VISIBLE
        } else {
            binding.rvHistory.visibility = View.VISIBLE
            binding.tvEmptyHistory.visibility = View.GONE
        }
    }

    private fun setupRecyclerView(data: List<SleepHistory>) {
        val historyAdapter = HistoryAdapter(data)
        binding.rvHistory.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = historyAdapter
            setHasFixedSize(true)
        }
    }
}