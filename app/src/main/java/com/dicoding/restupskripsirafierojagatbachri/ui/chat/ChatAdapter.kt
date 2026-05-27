package com.dicoding.restupskripsirafierojagatbachri.ui.chat

import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.text.HtmlCompat
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
        
        // Animasi Bounce/Pop-up Entrance
        holder.itemView.alpha = 0f
        holder.itemView.scaleX = 0.8f
        holder.itemView.scaleY = 0.8f
        
        holder.itemView.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .setDuration(400)
            .setInterpolator(android.view.animation.OvershootInterpolator())
            .start()

        val formattedMessage = chat.message
            .replace(Regex("\\*\\*(.*?)\\*\\*"), "<b>$1</b>")
            .replace(Regex("\\*(.*?)\\*"), "<i>$1</i>")
            .replace(Regex("(?m)^\\*\\s"), "• ")
            .replace("\n", "<br>")

        holder.tvMessage.text = HtmlCompat.fromHtml(formattedMessage, HtmlCompat.FROM_HTML_MODE_COMPACT)

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