package com.dicoding.restupskripsirafierojagatbachri.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.dicoding.restupskripsirafierojagatbachri.data.repository.TrackerRepository
import com.dicoding.restupskripsirafierojagatbachri.databinding.FragmentProfileBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.auth.LoginActivity
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var firebaseAuth: FirebaseAuth

    @Inject
    lateinit var trackerRepository: TrackerRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val user = firebaseAuth.currentUser

        if (user != null) {
            binding.tvNameProfile.text = user.displayName ?: "Mahasiswa"
            binding.tvEmailProfile.text = user.email
            fetchStats()
        }

        binding.menuEditProfile.setOnClickListener {
            startActivity(Intent(requireContext(), EditProfileActivity::class.java))
        }

        binding.menuSettings.setOnClickListener {
            startActivity(Intent(requireContext(), SettingsActivity::class.java))
        }

        binding.menuHelp.setOnClickListener {
            startActivity(Intent(requireContext(), HelpActivity::class.java))
        }

        binding.btnLogoutLayout.setOnClickListener {
            showLogoutConfirmationDialog()
        }
    }

    private fun showLogoutConfirmationDialog() {
        androidx.appcompat.app.AlertDialog.Builder(requireContext())
            .setTitle("Logout")
            .setMessage("Apakah Anda yakin ingin keluar dari aplikasi?")
            .setPositiveButton("Ya") { _, _ ->
                firebaseAuth.signOut()
                val intent = Intent(requireActivity(), LoginActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }
            .setNegativeButton("Tidak", null)
            .show()
    }

    private fun fetchStats() {
        lifecycleScope.launch {
            trackerRepository.getAllSleepRecords().collect { resource ->
                if (resource is Resource.Success) {
                    val records = resource.data
                    if (records.isNotEmpty()) {
                        val totalSessions = records.size
                        val avgDuration = records.map { it.duration_minutes }.average()
                        val lastQuality = records.first().sleep_quality

                        binding.tvTotalSessions.text = totalSessions.toString()
                        binding.tvAvgDuration.text = "${(avgDuration / 60).toInt()}j"
                        binding.tvLastQuality.text = lastQuality
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}