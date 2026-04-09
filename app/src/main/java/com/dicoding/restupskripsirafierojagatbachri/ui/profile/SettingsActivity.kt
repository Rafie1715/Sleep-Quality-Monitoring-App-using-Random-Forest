package com.dicoding.restupskripsirafierojagatbachri.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivitySettingsBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.reminder.ReminderActivity

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackSettings.setOnClickListener { finish() }

        binding.cardReminderSetting.setOnClickListener {
            startActivity(Intent(this, ReminderActivity::class.java))
        }
    }
}