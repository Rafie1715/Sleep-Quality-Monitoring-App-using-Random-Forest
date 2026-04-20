package com.dicoding.restupskripsirafierojagatbachri.ui.chat

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityChatBinding
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.launch
import kotlin.getValue
import com.dicoding.restupskripsirafierojagatbachri.BuildConfig

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding
    private val chatList = mutableListOf<ChatMessage>()
    private lateinit var chatAdapter: ChatAdapter

    private val generativeModel by lazy {
        GenerativeModel(
            modelName = "gemini-2.5-flash",
            apiKey = BuildConfig.GEMINI_API_KEY,
            systemInstruction = content {
                text("Kamu adalah RestBot, asisten virtual aplikasi RestUP...")
            }
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()

        addMessageToChat(ChatMessage("Halo! Aku RestBot 🤖. Ada keluhan apa soal tidurmu malam ini?", false))
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

    private fun sendMessageToGemini(message: String) {
        addMessageToChat(ChatMessage(message, true))
        binding.etMessage.text.clear()

        binding.progressBar.visibility = View.VISIBLE
        binding.btnSend.isEnabled = false

        lifecycleScope.launch {
            try {
                val response = generativeModel.generateContent(message)

                var aiReply = response.text ?: "Maaf, aku sedang pusing. Coba lagi nanti ya!"
                
                aiReply = aiReply.replace(Regex("\\*\\*|__|\\*|_|#"), "")

                addMessageToChat(ChatMessage(aiReply, false))

            } catch (e: Exception) {
                e.printStackTrace()
                val cleanError = e.message?.replace("Unexpected Response:", "")?.trim() ?: "Terjadi kesalahan koneksi"
                Toast.makeText(this@ChatActivity, "Error: $cleanError", Toast.LENGTH_LONG).show()
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