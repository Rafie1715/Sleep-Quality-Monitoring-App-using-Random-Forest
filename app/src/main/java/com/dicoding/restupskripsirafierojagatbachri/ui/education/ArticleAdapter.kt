package com.dicoding.restupskripsirafierojagatbachri.ui.education

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.ItemArticleBinding

class ArticleAdapter(private val list: List<Article>) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemArticleBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val article = list[position]
        holder.binding.apply {
            tvTitleArticle.text = article.title
            tvDescArticle.text = article.desc
            tvCategory.text = article.category.uppercase()

            tvReadTime.text = "• ${article.read_time}"

            Glide.with(holder.itemView.context)
                .load(article.image_url)
                .centerCrop()
                .placeholder(R.drawable.bg_header_rounded)
                .error(android.R.drawable.ic_menu_report_image)
                .into(ivArticleThumb)

            root.setOnClickListener {
                val intent = Intent(it.context, DetailArticleActivity::class.java)
                intent.putExtra(DetailArticleActivity.EXTRA_ARTICLE, article)
                it.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount() = list.size
}