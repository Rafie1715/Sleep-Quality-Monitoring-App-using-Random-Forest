package com.dicoding.restupskripsirafierojagatbachri.ui.history

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
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
        playAnimation()

        viewModel.fetchSleepHistory()
    }

    private fun playAnimation() {
        binding.viewHeader.alpha = 0f
        binding.tvTitleHistory.alpha = 0f
        binding.rvHistory.alpha = 0f

        val header = ObjectAnimator.ofFloat(binding.viewHeader, View.ALPHA, 1f).setDuration(400)
        val title = ObjectAnimator.ofFloat(binding.tvTitleHistory, View.ALPHA, 1f).setDuration(400)
        val list = ObjectAnimator.ofFloat(binding.rvHistory, View.ALPHA, 1f).setDuration(400)
        val listSlide = ObjectAnimator.ofFloat(binding.rvHistory, View.TRANSLATION_Y, 50f, 0f).setDuration(400)

        AnimatorSet().apply {
            playSequentially(header, title, AnimatorSet().apply { playTogether(list, listSlide) })
            start()
        }
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
                    binding.layoutSkeleton.root.visibility = View.VISIBLE
                    binding.layoutEmptyHistory.root.visibility = View.GONE
                    binding.rvHistory.visibility = View.GONE
                }
                is Resource.Success -> {
                    binding.layoutSkeleton.root.visibility = View.GONE
                    binding.rvHistory.visibility = View.VISIBLE
                    val records = result.data
                    if (records.isEmpty()) {
                        binding.layoutEmptyHistory.root.visibility = View.VISIBLE
                        binding.layoutEmptyHistory.tvEmptyTitle.text = getString(com.dicoding.restupskripsirafierojagatbachri.R.string.riwayat_tidur)
                        binding.layoutEmptyHistory.tvEmptyDesc.text = getString(com.dicoding.restupskripsirafierojagatbachri.R.string.mulai_tracking_tidur_desc)
                    } else {
                        binding.layoutEmptyHistory.root.visibility = View.GONE
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