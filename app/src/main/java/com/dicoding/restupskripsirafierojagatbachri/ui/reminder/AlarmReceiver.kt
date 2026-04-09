package com.dicoding.restupskripsirafierojagatbachri.ui.reminder

import android.app.NotificationChannel
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.app.NotificationManager
import android.app.PendingIntent
import android.os.Build
import androidx.core.app.NotificationCompat
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.ui.main.MainActivity

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        showAlarmNotification(context)
    }

    private fun showAlarmNotification(context: Context) {
        val channelId = "sleep_reminder_channel"
        val channelName = "Pengingat Tidur"
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val intent = Intent(context, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            context, 0, intent,
            PendingIntent.FLAG_IMMUTABLE
        )

        val builder = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.ic_alarm)
            .setContentTitle("Waktunya Bersiap Tidur! 🌙")
            .setContentText("Jauhkan HP-mu, matikan lampu, dan bersiaplah istirahat agar besok lebih fokus kuliah.")
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel =
                NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH)
            builder.setChannelId(channelId)
            notificationManager.createNotificationChannel(channel)
        }

        notificationManager.notify(101, builder.build())
    }
}