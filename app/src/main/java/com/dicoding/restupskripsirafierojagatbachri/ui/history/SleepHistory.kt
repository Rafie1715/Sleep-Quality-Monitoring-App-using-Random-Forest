package com.dicoding.restupskripsirafierojagatbachri.ui.history

data class SleepHistory(
    val date: String,       // Misal: "12 Feb 2026"
    val timeRange: String,  // Misal: "23:00 - 06:00"
    val duration: String,   // Misal: "7 Jam 0 Menit"
    val quality: String,    // Misal: "Baik", "Kurang"
    val colorStatus: Int    // Warna indikator (Hijau/Merah)
)