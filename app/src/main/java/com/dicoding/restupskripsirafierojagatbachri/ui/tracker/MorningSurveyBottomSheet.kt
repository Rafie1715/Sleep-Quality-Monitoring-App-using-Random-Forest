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

    private var selectedMood: String = ""

    var onSubmitListener: ((
        latency: String,
        isStressed: Boolean,
        hasCaffeine: Boolean,
        highScreenTime: Boolean,
        frequentAwakenings: Boolean,
        badTemperature: Boolean,
        mood: String
    ) -> Unit)? = null

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
        binding.btnSaveSurvey.setOnClickListener { collectDataAndSubmit() }
    }

    private fun setupCardClicks() {
        val toggleCard = View.OnClickListener { view ->
            if (view is MaterialCardView) {
                view.isChecked = !view.isChecked
            }
        }

        binding.cardDistWake.setOnClickListener(toggleCard)
        binding.cardDistPhysic.setOnClickListener(toggleCard)
        binding.cardHabitBad.setOnClickListener(toggleCard)

        binding.cardMoodBad.setOnClickListener { updateMoodSelection("Buruk", binding.cardMoodBad) }
        binding.cardMoodNeutral.setOnClickListener { updateMoodSelection("Cukup", binding.cardMoodNeutral) }
        binding.cardMoodGood.setOnClickListener { updateMoodSelection("Baik", binding.cardMoodGood) }
    }

    private fun updateMoodSelection(mood: String, selectedCard: MaterialCardView) {
        selectedMood = mood
        binding.cardMoodBad.isChecked = false
        binding.cardMoodNeutral.isChecked = false
        binding.cardMoodGood.isChecked = false
        selectedCard.isChecked = true
    }

    private fun collectDataAndSubmit() {
        val latencyId = binding.cgLatency.checkedChipId
        val latencyStr = when (latencyId) {
            binding.chipLat15.id -> "<15 menit"
            binding.chipLat30.id -> "15-30 menit"
            binding.chipLat60.id -> "30-60 menit"
            binding.chipLatMore.id -> ">60 menit"
            else -> ""
        }

        if (selectedMood.isEmpty()) {
            Toast.makeText(requireContext(), "Bagaimana perasaanmu pagi ini? Pilih salah satu emoji.", Toast.LENGTH_SHORT).show()
            return
        }

        val freqAwakenings = binding.cardDistWake.isChecked
        val badTemp = binding.cardDistPhysic.isChecked
        val badHabits = binding.cardHabitBad.isChecked

        val isStressed = false

        onSubmitListener?.invoke(
            latencyStr,
            isStressed,
            badHabits,
            badHabits,
            freqAwakenings,
            badTemp,
            selectedMood
        )

        dismiss()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}