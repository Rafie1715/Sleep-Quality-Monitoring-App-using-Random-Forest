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
        val message = intent.getStringExtra("EXTRA_MESSAGE")
        showAlarmNotification(context, message)
    }

    private fun showAlarmNotification(context: Context, message: String?) {
        val channelId = "sleep_reminder_channel"
        val channelName = "Pengingat Tidur"
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val intent = Intent(context, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            context, 0, intent,
            PendingIntent.FLAG_IMMUTABLE
        )

        val displayMessage = message ?: "Jauhkan HP-mu, matikan lampu, dan bersiaplah istirahat agar besok lebih fokus kuliah."
        val title = if (message != null) "🚨 Rencana Pemulihan Medis" else "Waktunya Bersiap Tidur! 🌙"

        val builder = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.ic_alarm)
            .setContentTitle(title)
            .setContentText(displayMessage)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .setStyle(NotificationCompat.BigTextStyle().bigText(displayMessage))

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel =
                NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH)
            builder.setChannelId(channelId)
            notificationManager.createNotificationChannel(channel)
        }

        notificationManager.notify(101, builder.build())
    }
}