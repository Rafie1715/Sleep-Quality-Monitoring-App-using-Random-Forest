package com.dicoding.restupskripsirafierojagatbachri.ui.reminder

import android.Manifest
import android.app.PendingIntent
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import android.app.AlarmManager
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityReminderBinding
import java.util.Calendar
import java.util.Locale

class ReminderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReminderBinding
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReminderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPref = getSharedPreferences("ReminderPref", Context.MODE_PRIVATE)

        val isReminderOn = sharedPref.getBoolean("REMINDER_STATUS", false)
        val savedHour = sharedPref.getInt("REMINDER_HOUR", 22)
        val savedMinute = sharedPref.getInt("REMINDER_MINUTE", 0)

        binding.switchReminder.isChecked = isReminderOn

        binding.timePicker.hour = savedHour
        binding.timePicker.minute = savedMinute

        binding.btnBackReminder.setOnClickListener { finish() }

        binding.btnSaveReminder.setOnClickListener {

            val selectedHour: Int = binding.timePicker.hour
            val selectedMinute: Int = binding.timePicker.minute

            val isActive = binding.switchReminder.isChecked

            sharedPref.edit().apply {
                putBoolean("REMINDER_STATUS", isActive)
                putInt("REMINDER_HOUR", selectedHour)
                putInt("REMINDER_MINUTE", selectedMinute)
                putString("REMINDER_TIME_STRING", String.format(Locale.getDefault(), "%02d:%02d", selectedHour, selectedMinute))
                apply()
            }

            if (isActive) {
                setAlarm(selectedHour, selectedMinute)
                Toast.makeText(this, "Pengingat diaktifkan untuk jam ${String.format(Locale.getDefault(), "%02d:%02d", selectedHour, selectedMinute)}", Toast.LENGTH_SHORT).show()
            } else {
                cancelAlarm()
                Toast.makeText(this, "Pengingat dimatikan", Toast.LENGTH_SHORT).show()
            }

            checkPermissions()

            finish()
        }
    }

    private fun checkPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            if (!alarmManager.canScheduleExactAlarms()) {
                val intent = Intent(Settings.ACTION_REQUEST_SCHEDULE_EXACT_ALARM)
                startActivity(intent)
                Toast.makeText(this, "Mohon izinkan aplikasi memasang alarm", Toast.LENGTH_LONG).show()
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.POST_NOTIFICATIONS), 102)
            }
        }
    }

    private fun setAlarm(hour: Int, minute: Int) {
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)

        val pendingIntent = PendingIntent.getBroadcast(
            this, 101, intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, hour)
            set(Calendar.MINUTE, minute)
            set(Calendar.SECOND, 0)
        }

        if (calendar.timeInMillis <= System.currentTimeMillis()) {
            calendar.add(Calendar.DATE, 1)
        }

        try {
            alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
        } catch (e: SecurityException) {
            Toast.makeText(this, "Izin alarm tidak diberikan oleh sistem", Toast.LENGTH_SHORT).show()
        }
    }

    private fun cancelAlarm() {
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(
            this, 101, intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        alarmManager.cancel(pendingIntent)
    }
}