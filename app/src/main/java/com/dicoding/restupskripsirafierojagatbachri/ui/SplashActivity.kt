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
        // 1. Pasang Splash Screen API (Wajib sebelum super.onCreate)
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)

        // 2. Tahan Splash Screen tetap muncul sampai kita selesai cek login
        splashScreen.setKeepOnScreenCondition {
            true // Tahan sebentar...
        }

        val sharedPref = getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
        val hasSeenOnboarding = sharedPref.getBoolean("HasSeenOnboarding", false)
        val currentUser = firebaseAuth.currentUser

        if (!hasSeenOnboarding) {
            // 1. User Baru Install -> Ke Onboarding
            startActivity(Intent(this, OnboardingActivity::class.java))
        } else if (currentUser != null) {
            // 2. User Lama & Sudah Login -> Ke Home
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            // 3. User Lama tapi Belum Login -> Ke Login
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}