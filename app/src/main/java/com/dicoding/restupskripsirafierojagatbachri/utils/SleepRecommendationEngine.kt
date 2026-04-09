package com.dicoding.restupskripsirafierojagatbachri.utils

import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord

object SleepRecommendationEngine {

    fun generateRecommendation(record: SleepRecord): String {
        val recommendations = mutableListOf<String>()
        val sources = mutableSetOf<String>()

        // 1. Cek Durasi Tidur
        if (record.duration_minutes < 360) {
            recommendations.add("Durasi tidurmu kurang dari 6 jam. Usahakan tidur lebih awal besok malam untuk melunasi 'utang tidur' agar tetap fokus saat kuliah.")
            sources.add("• <a href=\"https://www.cdc.gov/sleep/about/?CDC_AAref_Val=https://www.cdc.gov/sleep/about_sleep/how_much_sleep.html\">CDC: How Much Sleep Do I Need?</a>")
        }

        // 2. Cek Kebiasaan Layar (Screen Time)
        if (record.high_screen_time) {
            recommendations.add("Kurangi menatap layar HP minimal 1 jam sebelum tidur. Cahaya biru menghambat produksi melatonin yang membuatmu sulit mengantuk.")
            sources.add("• <a href=\"https://www.health.harvard.edu/staying-healthy/blue-light-has-a-dark-side\">Harvard Med School: Blue light has a dark side</a>")
        }

        // 3. Cek Konsumsi Kafein
        if (record.has_caffeine) {
            recommendations.add("Hindari minum kopi atau minuman berkafein di sore/malam hari. Kafein dapat memblokir reseptor kantuk di otak hingga 6 jam.")
            sources.add("• <a href=\"https://www.ncbi.nlm.nih.gov/pmc/articles/PMC6292246/\">O'Callaghan et al. (2018): Effects of caffeine on sleep</a>")
        }

        // 4. Cek Latensi (Sulit Tidur) & Stres
        if (record.sleep_latency == ">60m" || record.sleep_latency == "30-60m" || record.is_stressed) {
            recommendations.add("Pikiran yang stres atau banyak tugas membuatmu butuh waktu lama untuk tertidur. Cobalah teknik relaksasi pernapasan 4-7-8 sebelum memejamkan mata.")
            sources.add("• <a href=\"https://pubmed.ncbi.nlm.nih.gov/25968710/\">Jerath et al. (2015): Self-regulation of breathing for anxiety</a>")
        }

        // 5. Cek Gangguan Fisik (Suhu & Sering Terbangun)
        if (record.frequent_awakenings || record.bad_temperature) {
            recommendations.add("Pastikan suhu kamarmu nyaman (ideal 15-19°C) dan minimalkan suara bising agar kamu tidak sering terbangun di tengah malam.")
            sources.add("• <a href=\"https://www.sleepfoundation.org/bedroom-environment/best-temperature-for-sleep\">Sleep Foundation: Best Temperature for Sleep</a>")
        }

        // 6. Kesimpulan jika tidak ada masalah
        if (recommendations.isEmpty()) {
            return "Pola tidurmu sudah sangat baik! Pertahankan kebiasaan <i>sleep hygiene</i> ini untuk menjaga performa akademikmu. 🌟"
        }

        val adviceText = recommendations.joinToString(separator = "<br><br>")
        val sourceText = "<br><br><b>Sumber Referensi Ilmiah:</b><br>" + sources.joinToString(separator = "<br>")

        return adviceText + sourceText
    }
}