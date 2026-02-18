package com.dicoding.restupskripsirafierojagatbachri.ui.education

data class Article(
    var id: String = "",
    val title: String = "",
    val desc: String = "",
    val category: String = "",
    val content: String = "",

    // --- UBAH DUA INI JADI SNAKE_CASE (SAMA PERSIS FIREBASE) ---
    val read_time: String = "",
    val image_url: String = ""
    // -----------------------------------------------------------
) {
    // Constructor kosong wajib untuk Firestore
    constructor() : this("", "", "", "", "", "", "")
}