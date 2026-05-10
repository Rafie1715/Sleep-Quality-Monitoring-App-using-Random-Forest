package com.dicoding.restupskripsirafierojagatbachri.ui.main

import android.os.Bundle
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        val navController = navHostFragment.navController

        binding.navView.setupWithNavController(navController)

        ViewCompat.setOnApplyWindowInsetsListener(binding.navViewContainer) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.updateLayoutParams<MarginLayoutParams> {
                val margin8 = (8 * resources.displayMetrics.density).toInt()
                val margin20 = (20 * resources.displayMetrics.density).toInt()
                bottomMargin = systemBars.bottom + margin8
                leftMargin = margin20
                rightMargin = margin20
            }
            insets
        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.navigation_home, R.id.navigation_history,
                R.id.navigation_education, R.id.navigation_profile -> {
                    binding.navView.visibility = View.VISIBLE
                }
                else -> {
                    // Kalau nanti ada halaman detail, navbar bisa disembunyikan
                    // binding.navView.visibility = View.GONE
                }
            }
        }
    }
}