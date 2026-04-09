package com.dicoding.restupskripsirafierojagatbachri.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SleepRecord(
    var id: String = "",
    var user_id: String = "",
    var date: String = "",
    var sleep_time: Long = 0L,
    var wake_time: Long = 0L,
    var duration_minutes: Int = 0,

    var sleep_latency: String = "",
    var is_stressed: Boolean = false,
    var has_caffeine: Boolean = false,
    var high_screen_time: Boolean = false,
    var frequent_awakenings: Boolean = false,
    var bad_temperature: Boolean = false,

    var wake_up_mood: String = "",
    var sleep_quality: String = "",
    var recommendation: String = ""
) : Parcelable