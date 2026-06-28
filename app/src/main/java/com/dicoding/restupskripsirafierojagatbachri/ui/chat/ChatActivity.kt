package com.dicoding.restupskripsirafierojagatbachri.ui.chat

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityChatBinding
import com.dicoding.restupskripsirafierojagatbachri.BuildConfig
import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.utils.SleepRecommendationEngine
import com.google.ai.client.generativeai.Chat
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.launch

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding
    private val chatList = mutableListOf<ChatMessage>()
    private lateinit var chatAdapter: ChatAdapter

    private var sleepRecord: SleepRecord? = null
    private var chatSession: Chat? = null
    private var typingAnimator: AnimatorSet? = null

    private val generativeModel by lazy {
        val systemPrompt = StringBuilder()

        sleepRecord?.let {
            val durationText = "${it.duration_minutes / 60} jam ${it.duration_minutes % 60} menit"
            val journalText = it.sleep_journal.ifEmpty { "Tidak ada catatan tambahan." }
            val aturanPakar = SleepRecommendationEngine.generateRecommendation(it)

            systemPrompt.append("""
                Anda adalah RestBot, asisten virtual yang cerdas, hangat, dan suportif layaknya seorang teman atau kakak tingkat yang juga pakar kesehatan tidur mahasiswa.
                
                Konteks pengguna saat ini:
                - Hasil Klasifikasi Sistem: ${it.sleep_quality}
                - Durasi Tidur Aktual: $durationText
                - Keluhan/Jurnal Tidur (NLP): "$journalText"
                
                ATURAN MEDIS MUTLAK (Hanya gunakan poin-poin ini sebagai sumber saran):
                "$aturanPakar"
                
                GAYA BAHASA & TUGAS ANDA:
                1. BERIKAN EMPATI MENDALAM: Mulailah dengan merespons isi jurnal tidur pengguna secara tulus.
                2. JADI MANUSIAWI: Gunakan gaya bahasa yang santai namun sopan (seperti kakak tingkat/teman akrab).
                3. FORMATTING BERSIH: Dilarang keras menggunakan tanda bintang (*) untuk penekanan kata (bold/italic) di tengah kalimat. Gunakan huruf kapital di awal kata atau tanda kutip jika perlu.
                4. TATA LETAK: Gunakan narasi yang mengalir. Jika harus membuat daftar, gunakan tanda hubung (-) atau simbol bullet (•) yang rapi, bukan tanda bintang.
                5. TRANSLASI PAKAR: Ubah bahasa medis "ATURAN MEDIS" menjadi saran praktis yang menyemangati.
                6. DURASI: Maksimal 2-3 paragraf saja.
            """.trimIndent())
        } ?: run {
            systemPrompt.append("Anda adalah RestBot. Tugas Anda adalah memberikan saran kesehatan tidur yang ramah, informatif, dan mudah dimengerti kepada mahasiswa.")
        }

        GenerativeModel(
            modelName = "gemini-2.5-flash",
            apiKey = BuildConfig.GEMINI_API_KEY,
            systemInstruction = content {
                text(systemPrompt.toString())
            }
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        chatSession = generativeModel.startChat()

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val ime = insets.getInsets(WindowInsetsCompat.Type.ime())
            
            v.updatePadding(
                top = systemBars.top,
                bottom = systemBars.bottom.coerceAtLeast(ime.bottom)
            )
            insets
        }

        sleepRecord = intent.getParcelableExtra("EXTRA_SLEEP_RECORD")
        val weeklyContext = intent.getStringExtra("EXTRA_WEEKLY_CONTEXT")

        setupUI()

        when {
            weeklyContext != null -> {
                addMessageToChat(ChatMessage("Halo! Aku RestBot 🤖. Aku sudah menerima data tidur mingguanmu. Sedang aku analisis ya...", false))
                sendMessageToGemini(weeklyContext, false)
            }
            sleepRecord != null -> {
                addMessageToChat(ChatMessage("Halo! Aku RestBot 🤖. Sedang menganalisis jurnal dan data tidurmu sebentar ya...", false))
                val prompt = """
                    Berdasarkan data tidurku:
                    - Kualitas: ${sleepRecord?.sleep_quality}
                    - Durasi: ${sleepRecord?.duration_minutes} menit
                    - Jurnal/Keluhan: "${sleepRecord?.sleep_journal}"
                    
                    Tolong berikan analisis singkat yang sangat personal berdasarkan keluhan di jurnalku itu dan berikan 1 solusi praktis.
                """.trimIndent()
                sendMessageToGemini(prompt, false)
            }
            else -> {
                addMessageToChat(ChatMessage("Halo! Aku RestBot 🤖. Ada keluhan apa soal tidurmu malam ini?", false))
            }
        }
    }

    private fun setupUI() {
        chatAdapter = ChatAdapter(chatList)
        binding.rvChat.layoutManager = LinearLayoutManager(this)
        binding.rvChat.adapter = chatAdapter

        binding.btnSend.setOnClickListener {
            val userMessage = binding.etMessage.text.toString().trim()
            if (userMessage.isNotEmpty()) {
                sendMessageToGemini(userMessage)
            }
        }

        binding.toolbar.setNavigationOnClickListener { finish() }
    }

    private fun sendMessageToGemini(message: String, addToUi: Boolean = true) {
        if (BuildConfig.GEMINI_API_KEY.isEmpty()) {
            addMessageToChat(ChatMessage("Waduh, API Key Gemini belum dipasang di project ini. Silakan cek local.properties ya! 🤖", false))
            return
        }

        if (addToUi) {
            addMessageToChat(ChatMessage(message, true))
        }
        binding.etMessage.text.clear()

        showTypingIndicator(true)
        binding.btnSend.isEnabled = false

        lifecycleScope.launch {
            try {
                val response = chatSession?.sendMessage(content { text(message) })

                val aiReply = response?.text ?: "Maaf, aku sedang pusing. Coba lagi nanti ya!"
                
                showTypingIndicator(false)
                addMessageToChat(ChatMessage(aiReply.trim(), false))

            } catch (e: Exception) {
                e.printStackTrace()
                showTypingIndicator(false)
                val errorMessage = when {
                    e.message?.contains("high demand", ignoreCase = true) == true || 
                    e.message?.contains("503", ignoreCase = true) == true -> 
                        "Waduh, sepertinya RestBot lagi sibuk banget melayani pengguna lain nih 🤖. Coba kirim pesan lagi sebentar lagi ya! ⏳"
                    
                    e.message?.contains("SAFETY", ignoreCase = true) == true ->
                        "Maaf, aku tidak bisa menjawab pertanyaan itu karena alasan keamanan. Tanya yang lain yuk!"
                        
                    else -> "Terjadi kesalahan koneksi. Pastikan internetmu aktif dan coba lagi ya! ✨"
                }
                addMessageToChat(ChatMessage(errorMessage, false))
            } finally {
                binding.progressBar.visibility = View.GONE
                binding.btnSend.isEnabled = true
            }
        }
    }

    private fun showTypingIndicator(show: Boolean) {
        if (show) {
            binding.layoutTyping.visibility = View.VISIBLE
            binding.progressBar.visibility = View.GONE
            
            if (typingAnimator == null) {
                val dot1 = ObjectAnimator.ofFloat(binding.dot1, "translationY", 0f, -15f, 0f).apply {
                    duration = 600
                    repeatCount = ObjectAnimator.INFINITE
                    interpolator = AccelerateDecelerateInterpolator()
                }
                val dot2 = ObjectAnimator.ofFloat(binding.dot2, "translationY", 0f, -15f, 0f).apply {
                    duration = 600
                    repeatCount = ObjectAnimator.INFINITE
                    startDelay = 150
                    interpolator = AccelerateDecelerateInterpolator()
                }
                val dot3 = ObjectAnimator.ofFloat(binding.dot3, "translationY", 0f, -15f, 0f).apply {
                    duration = 600
                    repeatCount = ObjectAnimator.INFINITE
                    startDelay = 300
                    interpolator = AccelerateDecelerateInterpolator()
                }

                typingAnimator = AnimatorSet().apply {
                    playTogether(dot1, dot2, dot3)
                }
            }
            typingAnimator?.start()
        } else {
            binding.layoutTyping.visibility = View.GONE
            typingAnimator?.cancel()
        }
    }

    private fun addMessageToChat(chatMessage: ChatMessage) {
        chatList.add(chatMessage)
        chatAdapter.notifyItemInserted(chatList.size - 1)
        binding.rvChat.scrollToPosition(chatList.size - 1)
    }
}