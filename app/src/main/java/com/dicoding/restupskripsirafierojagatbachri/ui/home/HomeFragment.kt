package com.dicoding.restupskripsirafierojagatbachri.ui.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.FragmentHomeBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.reminder.ReminderActivity
import com.dicoding.restupskripsirafierojagatbachri.ui.tracker.SleepTrackerActivity
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Logika Sapaan Berdasarkan Jam
        val calendar = java.util.Calendar.getInstance()
        val hour = calendar.get(java.util.Calendar.HOUR_OF_DAY)

        val greeting = when (hour) {
            in 0..10 -> "Selamat Pagi,"   // 00:00 - 10:59
            in 11..14 -> "Selamat Siang," // 11:00 - 14:59
            in 15..18 -> "Selamat Sore,"  // 15:00 - 18:59
            else -> "Selamat Malam,"      // 19:00 - 23:59
        }

        binding.tvGreeting.text = greeting

        // 2. Tampilkan Nama User (Kode lama)
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            val name = user.displayName ?: user.email
            binding.tvUserName.text = name
        }

        // 2. Aksi Tombol FAB (Mulai Tracking)
        binding.fabSleepTrack.setOnClickListener {
            val intent = Intent(requireContext(), SleepTrackerActivity::class.java)
            startActivity(intent)
        }

        // 1. Aksi Klik Kartu Reminder
        binding.cardReminderHome.setOnClickListener {
            startActivity(Intent(requireContext(), ReminderActivity::class.java))
        }

        // 2. Update Teks Jam (Panggil juga di onResume agar real-time update)
        updateReminderText()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onResume() {
        super.onResume()
        updateReminderText()
    }

    private fun updateReminderText() {
        val sharedPref = requireContext().getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
        val isActive = sharedPref.getBoolean("ReminderActive", false)
        val hour = sharedPref.getInt("ReminderHour", 22)
        val minute = sharedPref.getInt("ReminderMinute", 0)

        if (isActive) {
            val timeString = String.format("%02d:%02d", hour, minute)
            binding.tvReminderTimeHome.text = "Dijadwalkan: $timeString"
            binding.tvReminderTimeHome.setTextColor(requireContext().getColor(R.color.sleep_primary))
        } else {
            binding.tvReminderTimeHome.text = "Pengingat non-aktif"
            binding.tvReminderTimeHome.setTextColor(requireContext().getColor(android.R.color.darker_gray))
        }
    }
}