package com.dicoding.restupskripsirafierojagatbachri.ui.reminder

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityReminderBinding

class ReminderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReminderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReminderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)

        // 1. Load Data Lama (Kalau ada)
        val savedHour = sharedPref.getInt("ReminderHour", 22) // Default jam 22
        val savedMinute = sharedPref.getInt("ReminderMinute", 0)
        val isActive = sharedPref.getBoolean("ReminderActive", false)

        binding.timePicker.hour = savedHour
        binding.timePicker.minute = savedMinute
        binding.switchReminder.isChecked = isActive

        // 2. Tombol Back
        binding.btnBackReminder.setOnClickListener { finish() }

        // 3. Tombol Simpan
        binding.btnSaveReminder.setOnClickListener {
            val hour = binding.timePicker.hour
            val minute = binding.timePicker.minute
            val switchState = binding.switchReminder.isChecked

            // Simpan ke SharedPreferences
            with(sharedPref.edit()) {
                putInt("ReminderHour", hour)
                putInt("ReminderMinute", minute)
                putBoolean("ReminderActive", switchState)
                apply()
            }

            val pesan = if (switchState) "Pengingat diatur jam $hour:$minute" else "Pengingat dimatikan"
            Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show()

            // Tutup activity agar kembali ke Home dan text terupdate
            finish()
        }
    }
}