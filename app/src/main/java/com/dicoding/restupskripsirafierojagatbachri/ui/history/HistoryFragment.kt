package com.dicoding.restupskripsirafierojagatbachri.ui.history

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.FragmentHistoryBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.result.ResultActivity
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HistoryFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HistoryViewModel by viewModels()
    private lateinit var historyAdapter: HistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        observeData()

        viewModel.fetchSleepHistory()
    }

    private fun setupRecyclerView() {
        historyAdapter = HistoryAdapter { record ->
            val intent = Intent(requireContext(), ResultActivity::class.java)
            intent.putExtra("EXTRA_SLEEP_RECORD", record)
            startActivity(intent)
        }

        binding.rvHistory.apply {
            adapter = historyAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun observeData() {
        viewModel.historyList.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Resource.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.tvEmptyHistory.visibility = View.GONE
                }
                is Resource.Success -> {
                    binding.progressBar.visibility = View.GONE
                    val records = result.data ?: emptyList()
                    if (records.isEmpty()) {
                        binding.tvEmptyHistory.visibility = View.VISIBLE
                    } else {
                        binding.tvEmptyHistory.visibility = View.GONE
                    }
                    historyAdapter.submitList(records)
                }
                is Resource.Error -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(requireContext(), "Gagal memuat riwayat: ${result.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}