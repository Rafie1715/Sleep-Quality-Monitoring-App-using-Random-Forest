package com.dicoding.restupskripsirafierojagatbachri.ui.education

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.FragmentEducationBinding
import com.dicoding.restupskripsirafierojagatbachri.databinding.ItemArticleBinding
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EducationFragment : Fragment(R.layout.fragment_education) {

    private lateinit var binding: FragmentEducationBinding
    private val db = FirebaseFirestore.getInstance()
    private val articleList = ArrayList<Article>()
    private lateinit var adapter: ArticleAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentEducationBinding.bind(view)

        // Setup RecyclerView Kosong
        adapter = ArticleAdapter(articleList)
        binding.rvArticle.layoutManager = LinearLayoutManager(requireContext())
        binding.rvArticle.adapter = adapter

        // Ambil Data dari Firebase
        fetchArticles()
    }

    private fun fetchArticles() {
        // Tampilkan Loading (kalau ada progress bar)

        db.collection("articles")
            .get()
            .addOnSuccessListener { result ->
                articleList.clear()
                for (document in result) {
                    val article = document.toObject(Article::class.java)

                    // Update nama variabel di sini juga
                    Log.d("DEBUG_FIREBASE", "Judul: ${article.title}")
                    Log.d("DEBUG_FIREBASE", "Link Gambar: '${article.image_url}'") // Ganti jadi image_url

                    articleList.add(article)
                }
                adapter.notifyDataSetChanged()
            }
            .addOnFailureListener { exception ->
                Log.e("DEBUG_FIREBASE", "Error fetch data", exception)
            }
    }
}