package com.dicoding.restupskripsirafierojagatbachri.ui.main

import android.content.Intent
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
import com.dicoding.restupskripsirafierojagatbachri.ui.tracker.SleepTrackerActivity
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

        ViewCompat.setOnApplyWindowInsetsListener(binding.navView) { v, insets ->
            v.setPadding(0, 0, 0, 0)
            insets
        }

        binding.btnTrackerCenter.setOnClickListener {
            val intent = Intent(this, SleepTrackerActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(binding.navViewContainer) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            
            v.updateLayoutParams<MarginLayoutParams> {
                val margin24 = (24 * resources.displayMetrics.density).toInt()
                val margin20 = (20 * resources.displayMetrics.density).toInt()
                bottomMargin = systemBars.bottom + margin24
                leftMargin = margin20
                rightMargin = margin20
            }
            
            binding.btnTrackerCenter.updateLayoutParams<MarginLayoutParams> {
                val margin24 = (24 * resources.displayMetrics.density).toInt()
                bottomMargin = systemBars.bottom + margin24
            }
            
            insets
        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.navigation_home, R.id.navigation_history,
                R.id.navigation_education, R.id.navigation_profile -> {
                    binding.navViewContainer.visibility = View.VISIBLE
                    binding.btnTrackerCenter.visibility = View.VISIBLE
                }
                else -> {
                    binding.navViewContainer.visibility = View.GONE
                    binding.btnTrackerCenter.visibility = View.GONE
                }
            }
        }
    }
}