package com.dicoding.restupskripsirafierojagatbachri.ui.profile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityHelpBinding
import androidx.core.net.toUri

class HelpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackHelp.setOnClickListener { finish() }

        binding.btnContactSupport.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = "mailto:support@restup.com".toUri() // Ganti dengan emailmu
                putExtra(Intent.EXTRA_SUBJECT, "Bantuan Aplikasi RestUP")
            }
            startActivity(intent)
        }
    }
}