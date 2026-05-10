package com.dicoding.restupskripsirafierojagatbachri.ui.education

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.appcompat.widget.SearchView
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.FragmentEducationBinding
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

        adapter = ArticleAdapter(articleList)
        binding.rvArticle.layoutManager = LinearLayoutManager(requireContext())
        binding.rvArticle.adapter = adapter

        setupSearch()
        fetchArticles()
        playAnimation()
    }

    private fun playAnimation() {
        binding.viewHeader.alpha = 0f
        binding.tvTitleEdu.alpha = 0f
        binding.cardSearch.alpha = 0f
        binding.rvArticle.alpha = 0f

        val header = ObjectAnimator.ofFloat(binding.viewHeader, View.ALPHA, 1f).setDuration(400)
        val title = ObjectAnimator.ofFloat(binding.tvTitleEdu, View.ALPHA, 1f).setDuration(400)
        val search = ObjectAnimator.ofFloat(binding.cardSearch, View.ALPHA, 1f).setDuration(400)
        val list = ObjectAnimator.ofFloat(binding.rvArticle, View.ALPHA, 1f).setDuration(400)
        val listSlide = ObjectAnimator.ofFloat(binding.rvArticle, View.TRANSLATION_Y, 50f, 0f).setDuration(400)

        AnimatorSet().apply {
            playSequentially(header, title, search, AnimatorSet().apply { playTogether(list, listSlide) })
            start()
        }
    }

    private fun setupSearch() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterArticles(newText ?: "")
                return true
            }
        })
    }

    private fun filterArticles(query: String) {
        val filteredList = if (query.isEmpty()) {
            articleList
        } else {
            articleList.filter {
                it.title.contains(query, ignoreCase = true) ||
                it.category.contains(query, ignoreCase = true)
            }
        }
        adapter.updateList(filteredList)
        
        if (filteredList.isEmpty()) {
            binding.layoutEmptyEducation.root.visibility = View.VISIBLE
            binding.layoutEmptyEducation.tvEmptyTitle.text = getString(R.string.artikel_tidak_ditemukan)
            binding.layoutEmptyEducation.tvEmptyDesc.text = getString(R.string.cari_kata_kunci_lain)
        } else {
            binding.layoutEmptyEducation.root.visibility = View.GONE
        }
    }

    private fun fetchArticles() {
        binding.progressBar.visibility = View.GONE
        binding.layoutSkeletonEdu.root.visibility = View.VISIBLE
        binding.layoutEmptyEducation.root.visibility = View.GONE
        db.collection("articles")
            .get()
            .addOnSuccessListener { result ->
                binding.layoutSkeletonEdu.root.visibility = View.GONE
                articleList.clear()
                for (document in result) {
                    val article = document.toObject(Article::class.java)
                    articleList.add(article)
                }
                adapter.notifyDataSetChanged()
                
                if (articleList.isEmpty()) {
                    binding.layoutEmptyEducation.root.visibility = View.VISIBLE
                } else {
                    binding.layoutEmptyEducation.root.visibility = View.GONE
                }
            }
            .addOnFailureListener { exception ->
                binding.progressBar.visibility = View.GONE
                Log.e("DEBUG_FIREBASE", "Error fetch data", exception)
                Toast.makeText(requireContext(), "Gagal memuat artikel", Toast.LENGTH_SHORT).show()
            }
    }
}