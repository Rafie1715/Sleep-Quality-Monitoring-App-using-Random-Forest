package com.dicoding.restupskripsirafierojagatbachri.ui.onboarding

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
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

        setupAction()
        playAnimation()
    }

    private fun setupAction() {
        binding.btnGetStarted.setOnClickListener {
            val sharedPref = getSharedPreferences("AppPrefs", MODE_PRIVATE)
            sharedPref.edit {
                putBoolean("HasSeenOnboarding", true)
            }

            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }

    private fun playAnimation() {
        ObjectAnimator.ofFloat(binding.ivOnboarding, View.TRANSLATION_Y, -30f, 30f).apply {
            duration = 3000
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }.start()

        val title = ObjectAnimator.ofFloat(binding.tvTitle, View.ALPHA, 1f).setDuration(500)
        val desc = ObjectAnimator.ofFloat(binding.tvDescription, View.ALPHA, 1f).setDuration(500)
        val btn = ObjectAnimator.ofFloat(binding.btnGetStarted, View.ALPHA, 1f).setDuration(500)

        AnimatorSet().apply {
            playSequentially(title, desc, btn)
            start()
        }
    }
}