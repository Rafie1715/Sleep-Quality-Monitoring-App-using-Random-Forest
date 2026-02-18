package com.dicoding.restupskripsirafierojagatbachri.ui.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityOnboardingBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.auth.LoginActivity
import androidx.core.content.edit

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetStarted.setOnClickListener {
            // Simpan status bahwa user sudah pernah lihat onboarding
            val sharedPref = getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
            sharedPref.edit {
                putBoolean("HasSeenOnboarding", true)
            }

            // Pindah ke Login
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}