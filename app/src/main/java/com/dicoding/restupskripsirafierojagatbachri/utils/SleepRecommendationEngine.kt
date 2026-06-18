package com.dicoding.restupskripsirafierojagatbachri.utils

import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord

object SleepRecommendationEngine {

    fun generateRecommendation(record: SleepRecord): String {
        val recommendations = mutableListOf<String>()
        val sources = mutableSetOf<String>()

        if (record.duration_minutes < 180) {
            recommendations.add("<b>⚠️ PERINGATAN MEDIS:</b> Durasi tidurmu sangat ekstrem (kurang dari 3 jam). Ini secara mutlak dikategorikan <b>Buruk</b> dan berisiko tinggi memicu <i>microsleep</i> serta penurunan fungsi kognitif otak secara drastis. Segera rencanakan <i>power nap</i> atau tidur lebih awal malam ini!")
            sources.add("• <a href=\"https://www.sleepfoundation.org/sleep-deprivation\">Sleep Foundation: Severe Sleep Deprivation</a>")
        }

        else if (record.duration_minutes < 360) {
            recommendations.add("Durasi tidurmu kurang dari 6 jam. Usahakan tidur lebih awal besok malam untuk melunasi 'utang tidur' agar tetap fokus saat kuliah. Jangan mencoba 'membayar' utang tidur secara berlebihan di siang hari (napping >30 menit), karena akan merusak jadwal tidurmu malam berikutnya.")
            sources.add("• <a href=\"https://www.cdc.gov/sleep/about/?CDC_AAref_Val=https://www.cdc.gov/sleep/about_sleep/how_much_sleep.html\">CDC: How Much Sleep Do I Need?</a>")
        }

        if (record.high_screen_time) {
            recommendations.add("Kurangi menatap layar HP minimal 1 jam sebelum tidur. Cahaya biru menghambat produksi melatonin yang membuatmu sulit mengantuk.")
            sources.add("• <a href=\"https://www.health.harvard.edu/staying-healthy/blue-light-has-a-dark-side\">Harvard Med School: Blue light has a dark side</a>")
        }

        if (record.has_caffeine) {
            recommendations.add("Hindari minum kopi atau minuman berkafein di sore/malam hari. Kafein dapat memblokir reseptor kantuk di otak hingga 6 jam.")
            sources.add("• <a href=\"https://www.ncbi.nlm.nih.gov/pmc/articles/PMC6292246/\">O'Callaghan et al. (2018): Effects of caffeine on sleep</a>")
        }

        if (record.sleep_latency == ">60 menit" || record.sleep_latency == "30-60 menit" || record.is_stressed) {
            recommendations.add("<b>Pikiran yang stres atau banyak tugas</b> (seperti yang kamu tulis di jurnal) membuat sistem saraf tetap aktif sehingga sulit terlelap. Cobalah teknik relaksasi pernapasan 4-7-8 atau mendengarkan musik <i>ambient</i> sebelum memejamkan mata.")
            sources.add("• <a href=\"https://pubmed.ncbi.nlm.nih.gov/25968710/\">Jerath et al. (2015): Self-regulation of breathing for anxiety</a>")
        }

        if (record.frequent_awakenings || record.bad_temperature) {
            recommendations.add("Pastikan suhu kamarmu nyaman (ideal 15-19°C) dan minimalkan suara bising agar kamu tidak sering terbangun di tengah malam.")
            sources.add("• <a href=\"https://www.sleepfoundation.org/bedroom-environment/best-temperature-for-sleep\">Sleep Foundation: Best Temperature for Sleep</a>")
        }

        if (record.wake_up_mood == "Lelah" && record.duration_minutes > 420) {
            recommendations.add("Meskipun durasi tidurmu cukup, kamu masih merasa lelah. Ini mungkin tanda kualitas tidur yang kurang (banyak gangguan) atau 'oversleeping'. Cobalah batasi tidur maksimal 9 jam.")
            sources.add("• <a href=\"https://www.hopkinsmedicine.org/health/wellness-and-prevention/oversleeping-bad-for-your-health\">Johns Hopkins: Oversleeping</a>")
        }

        if (recommendations.isEmpty()) {
            return "Pola tidurmu sudah sangat baik! Pertahankan kebiasaan <i>sleep hygiene</i> ini untuk menjaga performa akademikmu. 🌟"
        }

        val adviceText = recommendations.joinToString(separator = "<br><br>")
        val sourceText = "<br><br><b>Sumber Referensi Ilmiah:</b><br>" + sources.joinToString(separator = "<br>")

        return adviceText + sourceText
    }
}