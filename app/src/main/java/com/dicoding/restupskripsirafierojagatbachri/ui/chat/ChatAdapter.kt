package com.dicoding.restupskripsirafierojagatbachri.ui.chat

import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.restupskripsirafierojagatbachri.R

class ChatAdapter(private val chatList: List<ChatMessage>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMessage: TextView = itemView.findViewById(R.id.tvMessage)
        val layoutBubble: LinearLayout = itemView.findViewById(R.id.layoutBubble)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val chat = chatList[position]
        holder.tvMessage.text = chat.message

        if (chat.isUser) {
            holder.layoutBubble.gravity = Gravity.END
            holder.tvMessage.setBackgroundResource(R.drawable.bg_chat_bubble_user)
            holder.tvMessage.setTextColor(Color.WHITE)
        } else {
            holder.layoutBubble.gravity = Gravity.START
            holder.tvMessage.setBackgroundResource(R.drawable.bg_chat_bubble_bot)
            holder.tvMessage.setTextColor(Color.WHITE)
        }
    }

    override fun getItemCount() = chatList.size
}