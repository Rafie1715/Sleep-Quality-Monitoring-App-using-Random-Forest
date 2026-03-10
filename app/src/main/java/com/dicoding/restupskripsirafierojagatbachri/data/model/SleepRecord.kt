package com.dicoding.restupskripsirafierojagatbachri.data.model

data class SleepRecord(
    var id: String = "",                    // ID dokumen acak dari Firestore nantinya
    var user_id: String = "",               // UID User yang sedang login
    var date: String = "",                  // Tanggal format string (misal: "10 Mar 2026")
    var sleep_time: Long = 0L,              // Timestamp waktu mulai tidur (milidetik)
    var wake_time: Long = 0L,               // Timestamp waktu bangun (milidetik)
    var duration_minutes: Int = 0,          // Selisih durasi tidur dalam satuan menit

    // --- Data Input dari Kuesioner Pagi (Morning Survey) ---
    var sleep_latency: String = "",
    var disturbances: List<String> = emptyList(), // Array karena bisa pilih > 1 gangguan
    var habits: List<String> = emptyList(),       // Array karena bisa pilih > 1 kebiasaan
    var mood: String = "",

    // --- Data Output (Hasil Analisis Machine Learning & Rule-Based) ---
    var sleep_quality: String = "",         // Akan diisi: "Baik", "Cukup", atau "Buruk"
    var recommendation: String = ""         // Akan diisi teks saran perbaikan tidur
) {
    // Firebase Firestore mewajibkan adanya "Empty Constructor" (Konstruktor Kosong).
    // Karena kita sudah memberikan nilai default (seperti "", 0L, emptyList()) pada semua parameter di atas,
    // Kotlin secara otomatis sudah membuatkannya untuk kita.
}