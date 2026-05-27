package com.dicoding.restupskripsirafierojagatbachri.ui.chat

import android.os.Bundle
import android.view.View
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

    private val generativeModel by lazy {
        val systemPrompt = StringBuilder("Anda adalah RestBot, pakar kesehatan tidur. ")

        sleepRecord?.let {
            val durationText = "${it.duration_minutes / 60} jam ${it.duration_minutes % 60} menit"
            val journalText = it.sleep_journal.ifEmpty { "Tidak ada catatan tambahan." }

            systemPrompt.append("Mahasiswa ini baru saja tidur dengan durasi $durationText dan diprediksi memiliki kualitas tidur ${it.sleep_quality}. ")
            systemPrompt.append("Ia juga menuliskan jurnal tidur berikut: '$journalText'. ")
            systemPrompt.append("Berdasarkan sentimen jurnal tersebut dan status klasifikasinya, berikan saran pemulihan yang sangat personal dan empatik maksimal dua paragraf tanpa istilah medis yang rumit.")
        } ?: run {
            systemPrompt.append("Tugas Anda adalah memberikan saran kesehatan tidur yang ramah, informatif, dan mudah dimengerti kepada mahasiswa.")
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

        // Initialize Chat Session
        chatSession = generativeModel.startChat()

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val ime = insets.getInsets(WindowInsetsCompat.Type.ime())
            
            v.updatePadding(
                top = systemBars.top,
                bottom = Math.max(systemBars.bottom, ime.bottom)
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
                sendMessageToGemini("Berikan analisis awal dan saran pemulihan berdasarkan data tidurku semalam.", false)
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

        binding.progressBar.visibility = View.VISIBLE
        binding.btnSend.isEnabled = false

        lifecycleScope.launch {
            try {
                val response = chatSession?.sendMessage(content { text(message) })

                val aiReply = response?.text ?: "Maaf, aku sedang pusing. Coba lagi nanti ya!"
                
                addMessageToChat(ChatMessage(aiReply.trim(), false))

            } catch (e: Exception) {
                e.printStackTrace()
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

    private fun addMessageToChat(chatMessage: ChatMessage) {
        chatList.add(chatMessage)
        chatAdapter.notifyItemInserted(chatList.size - 1)
        binding.rvChat.scrollToPosition(chatList.size - 1)
    }
}