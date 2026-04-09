package com.dicoding.restupskripsirafierojagatbachri.ui.education

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Article(
    var id: String = "",
    val title: String = "",
    val desc: String = "",
    val category: String = "",
    val content: String = "",
    val read_time: String = "",
    val image_url: String = "",
    val source_url: String = ""
) : Parcelable {
    constructor() : this("", "", "", "", "", "", "", "")
}