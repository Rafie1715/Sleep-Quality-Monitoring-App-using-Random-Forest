package com.dicoding.restupskripsirafierojagatbachri.ui.tracker

import android.os.Bundle
import android.view.HapticFeedbackConstants
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.OvershootInterpolator
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
        mood: String,
        journal: String
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
                animateCardSelection(view, view.isChecked)
            }
        }

        binding.cardDistWake.setOnClickListener(toggleCard)
        binding.cardDistPhysic.setOnClickListener(toggleCard)
        binding.cardHabitBad.setOnClickListener(toggleCard)

        binding.cardMoodBad.setOnClickListener { updateMoodSelection("Lelah", binding.cardMoodBad) }
        binding.cardMoodNeutral.setOnClickListener { updateMoodSelection("Biasa", binding.cardMoodNeutral) }
        binding.cardMoodGood.setOnClickListener { updateMoodSelection("Bugar", binding.cardMoodGood) }
    }

    private fun updateMoodSelection(mood: String, selectedCard: MaterialCardView) {
        if (selectedMood == mood) return

        selectedMood = mood
        
        listOf(binding.cardMoodBad, binding.cardMoodNeutral, binding.cardMoodGood).forEach { card ->
            if (card != selectedCard && card.isChecked) {
                card.isChecked = false
                animateCardSelection(card, false)
            }
        }
        
        selectedCard.isChecked = true
        animateCardSelection(selectedCard, true)
    }

    private fun animateCardSelection(card: MaterialCardView, isChecked: Boolean) {
        val scale = if (isChecked) 1.05f else 1.0f
        val stroke = if (isChecked) dpToPx(2) else dpToPx(1)
        
        card.animate()
            .scaleX(scale)
            .scaleY(scale)
            .setDuration(200)
            .setInterpolator(OvershootInterpolator())
            .start()
        
        card.strokeWidth = stroke
        
        if (isChecked) {
            card.performHapticFeedback(HapticFeedbackConstants.CONTEXT_CLICK)
        }
    }

    private fun dpToPx(dp: Int): Int {
        return (dp * resources.displayMetrics.density).toInt()
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

        val journalText = binding.etJournal.text.toString().trim()

        val stressKeywords = listOf(
            "stres", "stress", "tugas", "deadline", "ujian", "skripsi", "cemas",
            "khawatir", "banyak pikiran", "pusing", "overthink", "sedih", "takut"
        )
        val isStressedInferred = stressKeywords.any { journalText.lowercase().contains(it) }

        onSubmitListener?.invoke(
            latencyStr,
            isStressedInferred,
            badHabits,
            badHabits,
            freqAwakenings,
            badTemp,
            selectedMood,
            journalText
        )

        dismiss()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}