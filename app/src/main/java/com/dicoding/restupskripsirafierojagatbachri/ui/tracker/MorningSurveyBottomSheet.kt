package com.dicoding.restupskripsirafierojagatbachri.ui.tracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.dicoding.restupskripsirafierojagatbachri.databinding.BottomSheetMorningSurveyBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.card.MaterialCardView

class MorningSurveyBottomSheet : BottomSheetDialogFragment() {

    private var _binding: BottomSheetMorningSurveyBinding? = null
    private val binding get() = _binding!!

    // Variabel untuk menyimpan pilihan Mood sementara
    private var selectedMood: String = ""

    var onSubmitListener: ((latency: String, disturbances: List<String>, habits: List<String>, mood: String) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetMorningSurveyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupCardClicks()

        binding.btnSaveSurvey.setOnClickListener {
            collectDataAndSubmit()
        }
    }

    private fun setupCardClicks() {
        // --- Multi Select Cards (Gangguan & Kebiasaan) ---
        // Fungsi helper untuk toggle status checked pada kartu
        val toggleCard = View.OnClickListener { view ->
            if (view is MaterialCardView) {
                view.isChecked = !view.isChecked
            }
        }

        binding.cardDistWake.setOnClickListener(toggleCard)
        binding.cardDistPhysic.setOnClickListener(toggleCard)
        binding.cardHabitBad.setOnClickListener(toggleCard)

        // --- Single Select Cards (Mood Emoji) ---
        binding.cardMoodBad.setOnClickListener {
            updateMoodSelection("Lelah", binding.cardMoodBad)
        }
        binding.cardMoodNeutral.setOnClickListener {
            updateMoodSelection("Biasa", binding.cardMoodNeutral)
        }
        binding.cardMoodGood.setOnClickListener {
            updateMoodSelection("Bugar", binding.cardMoodGood)
        }
    }

    // Helper untuk memastikan hanya 1 kartu mood yang terpilih
    private fun updateMoodSelection(mood: String, selectedCard: MaterialCardView) {
        selectedMood = mood
        // Reset semua kartu mood jadi tidak terpilih
        binding.cardMoodBad.isChecked = false
        binding.cardMoodNeutral.isChecked = false
        binding.cardMoodGood.isChecked = false
        // Set kartu yang diklik jadi terpilih
        selectedCard.isChecked = true
    }


    private fun collectDataAndSubmit() {
        // 1. Ambil Data Latency (Dari ChipGroup)
        // ChipGroup otomatis menangani single selection
        val latencyId = binding.cgLatency.checkedChipId
        val latencyStr = when (latencyId) {
            binding.chipLat15.id -> "<15m"
            binding.chipLat30.id -> "15-30m"
            binding.chipLat60.id -> "30-60m"
            binding.chipLatMore.id -> ">60m"
            else -> "" // Seharusnya tidak terjadi karena selectionRequired=true
        }

        // 2 & 3. Ambil Data Disturbances & Habits (Dari Kartu yang di-check)
        val disturbances = mutableListOf<String>()
        val habits = mutableListOf<String>()

        if (binding.cardDistWake.isChecked) disturbances.add("Sering Terbangun")
        if (binding.cardDistPhysic.isChecked) disturbances.add("Fisik (Suhu/Toilet)")
        // Saya gabung habit jadi satu parameter di UI baru biar simpel
        if (binding.cardHabitBad.isChecked) habits.add("Screen/Kafein")

        // Validasi Mood
        if (selectedMood.isEmpty()) {
            Toast.makeText(requireContext(), "Bagaimana perasaanmu pagi ini? Pilih salah satu emoji.", Toast.LENGTH_SHORT).show()
            return
        }

        // 4. Kirim data
        onSubmitListener?.invoke(latencyStr, disturbances, habits, selectedMood)

        dismiss()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}