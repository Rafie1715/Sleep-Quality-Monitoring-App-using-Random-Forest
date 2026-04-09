package com.dicoding.restupskripsirafierojagatbachri.ui.education

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityDetailArticleBinding

class DetailArticleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup Toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        binding.toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

        // Ambil data dari Intent
        val article = intent.getParcelableExtra<Article>(EXTRA_ARTICLE)

        if (article != null) {
            displayArticle(article)
        }
    }

    private fun displayArticle(article: Article) {
        binding.apply {
            tvDetailTitle.text = article.title
            tvDetailCategory.text = article.category.uppercase()
            tvDetailReadTime.text = article.read_time
            tvDetailContent.text = article.content.replace("\\n", "\n") // Handle newline if any

            if (article.source_url.isNotEmpty()) {
                layoutSource.visibility = View.VISIBLE
                tvDetailSource.text = article.source_url
            } else {
                layoutSource.visibility = View.GONE
            }

            Glide.with(this@DetailArticleActivity)
                .load(article.image_url)
                .placeholder(R.drawable.bg_header_rounded)
                .error(android.R.drawable.ic_menu_report_image)
                .into(ivDetailImage)
        }
    }

    companion object {
        const val EXTRA_ARTICLE = "extra_article"
    }
}