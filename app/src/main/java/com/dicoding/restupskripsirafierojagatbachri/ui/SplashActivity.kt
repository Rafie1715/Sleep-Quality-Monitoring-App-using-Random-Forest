package com.dicoding.restupskripsirafierojagatbachri.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.dicoding.restupskripsirafierojagatbachri.ui.main.MainActivity
import com.dicoding.restupskripsirafierojagatbachri.ui.auth.LoginActivity
import com.dicoding.restupskripsirafierojagatbachri.ui.onboarding.OnboardingActivity
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)

        splashScreen.setKeepOnScreenCondition {
            true
        }

        val sharedPref = getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
        val hasSeenOnboarding = sharedPref.getBoolean("HasSeenOnboarding", false)
        val currentUser = firebaseAuth.currentUser

        if (!hasSeenOnboarding) {
            startActivity(Intent(this, OnboardingActivity::class.java))
        } else if (currentUser != null) {
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}