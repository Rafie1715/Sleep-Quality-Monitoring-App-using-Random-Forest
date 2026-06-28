package com.dicoding.restupskripsirafierojagatbachri.utils

import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord

object SleepRecommendationEngine {

    fun generateRecommendation(record: SleepRecord): String {
        val recommendations = mutableListOf<String>()
        val sources = mutableSetOf<String>()
        val journal = record.sleep_journal.lowercase()

        if (record.duration_minutes < 180) {
            recommendations.add("<b>⚠️ PERINGATAN MEDIS:</b> Durasi tidurmu sangat ekstrem (kurang dari 3 jam). Ini berisiko tinggi memicu <i>microsleep</i> dan penurunan fungsi kognitif drastis.")
            sources.add("• <a href=\"https://www.sleepfoundation.org/sleep-deprivation\">Sleep Foundation: Severe Sleep Deprivation</a>")
            sources.add("• <a href=\"https://www.halodoc.com/artikel/tidur-cukup-itu-penting-kunci-sehat-fokus-produktif\">Halodoc: Tidur Cukup itu Penting</a>")
        }

        else if (record.duration_minutes < 360) {
            recommendations.add("Durasi tidurmu kurang dari 6 jam. Usahakan tidur lebih awal besok malam untuk melunasi 'utang tidur' agar tetap fokus saat kuliah.")
            sources.add("• <a href=\"https://www.cdc.gov/sleep/about/index.html\">CDC: How Much Sleep Do I Need?</a>")
            sources.add("• <a href=\"https://www.halodoc.com/artikel/berapa-lama-tidur-yang-diperlukan-agar-tubuh-tetap-fit-ini-penjelasannya\">HaloDoc: Berapa Lama Tidur yang Diperlukan agar Tubuh Tetap Fit?</a>")
        }

        if (record.high_screen_time) {
            recommendations.add("Paparan cahaya biru dan radiasi HP dapat menghambat melatonin serta mengganggu kualitas tidur nyenyakmu.")
            sources.add("• <a href=\"https://www.health.harvard.edu/staying-healthy/blue-light-has-a-dark-side\">Harvard: Blue light has a dark side</a>")
            sources.add("• <a href=\"https://www.halodoc.com/artikel/waspada-radiasi-hp-saat-tidur-jaga-jarak-tidur-nyenyak\">Halodoc: Waspada Radiasi HP saat Tidur</a>")
        }

        if (record.has_caffeine) {
            recommendations.add("Kafein memblokir reseptor kantuk di otak hingga 6 jam. Hindari kopi di sore/malam hari agar tidak terjaga terlalu lama.")
            sources.add("• <a href=\"https://www.ncbi.nlm.nih.gov/pmc/articles/PMC6292246/\">NIH: Effects of caffeine on sleep</a>")
            sources.add("• <a href=\"https://www.alodokter.com/komunitas/topic/apakah-kafein-memengaruhi-kualitas-tidur-dan-kapan-sebaiknya-berhenti-minum\">Alodokter: Pengaruh Kafein terhadap Tidur</a>")
        }

        if (record.is_stressed || listOf("stres", "stress", "tugas", "skripsi", "deadline", "cemas", "pikiran").any { journal.contains(it) }) {
            recommendations.add("<b>Analisis Jurnal:</b> Pikiran yang stres atau beban tugas membuat sistem saraf tetap aktif. Cobalah teknik relaksasi pernapasan 4-7-8 untuk menenangkan pikiran sebelum tidur.")
            sources.add("• <a href=\"https://pubmed.ncbi.nlm.nih.gov/25869930/\">Jerath et al: Self-regulation of breathing for anxiety</a>")
            sources.add("• <a href=\"https://www.alodokter.com/menyiasati-insomnia\">AloDokter: Cara Mengatasi Insomnia</a>")
        }

        if (listOf("toilet", "kamar mandi", "pipis", "kencing", "minum").any { journal.contains(it) }) {
            recommendations.add("<b>Analisis Jurnal:</b> Sering terbangun untuk ke toilet (nokturia) bisa disebabkan konsumsi cairan berlebih sebelum tidur. Batasi minum 1-2 jam sebelum jam tidurmu.")
            sources.add("• <a href=\"https://www.alodokter.com/nokturia\">Alodokter: Nokturia (Sering Kencing di Malam Hari)</a>")
        }

        if (listOf("ngorok", "dengkur", "snoring", "nafas", "sesak").any { journal.contains(it) }) {
            recommendations.add("<b>Analisis Jurnal:</b> Mendengkur bisa menandakan adanya hambatan jalan napas. Cobalah posisi tidur miring dan hindari tidur telentang untuk membantu pernapasan lebih lancar.")
            sources.add("• <a href=\"https://www.klikdokter.com/penyakit/masalah-tidur/mendengkur\">KlikDokter: Mengatasi Mendengkur</a>")
        }

        if (listOf("mimpi buruk", "gelisah", "nightmare", "takut").any { journal.contains(it) }) {
            recommendations.add("<b>Analisis Jurnal:</b> Mimpi buruk sering kali dipicu oleh stres atau kondisi lingkungan. Pastikan suhu kamar sejuk dan hindari konten menegangkan sebelum tidur.")
            sources.add("• <a href=\"https://www.halodoc.com/artikel/penyebab-mimpi-buruk-dan-tips-untuk-mengatasinya\">Halodoc: Penjelasan Medis Mimpi Buruk</a>")
        }

        if (record.frequent_awakenings || record.bad_temperature || journal.contains("berisik") || journal.contains("panas")) {
            recommendations.add("Pastikan suhu kamarmu nyaman (ideal 15-19°C) dan minimalkan cahaya serta kebisingan agar kamu tidak sering terbangun.")
            sources.add("• <a href=\"https://www.sleepfoundation.org/bedroom-environment/best-temperature-for-sleep\">Sleep Foundation: Best Temperature for Sleep</a>")
        }

        if (record.wake_up_mood == "Lelah" && record.duration_minutes > 420) {
            recommendations.add("Meskipun durasi tidur cukup, rasa lelah bisa menandakan kualitas tidur yang rendah atau kelelahan mental.")
            sources.add("• <a href=\"https://www.hopkinsmedicine.org/health/wellness-and-prevention/oversleeping-bad-for-your-health\">Johns Hopkins: Oversleeping</a>")
            sources.add("• <a href=\"https://www.halodoc.com/artikel/bangun-tidur-lemas-kenali-penyebab-dan-cara-mengatasinya\">Halodoc: Bangun Tidur Lemas?</a>")
        }

        if (recommendations.isEmpty()) {
            return "Pola tidurmu sudah sangat baik! Pertahankan kebiasaan <i>sleep hygiene</i> ini untuk menjaga performa akademikmu. 🌟"
        }

        val adviceText = recommendations.joinToString(separator = "<br><br>")
        val sourceText = "<br><br><b>Sumber Referensi Ilmiah (Global & Indonesia):</b><br>" + sources.joinToString(separator = "<br>")

        return adviceText + sourceText
    }
}