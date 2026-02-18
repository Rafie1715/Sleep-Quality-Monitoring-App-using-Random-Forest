package com.dicoding.restupskripsirafierojagatbachri.ui.auth

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityLoginBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.main.MainActivity
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val viewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            // 1. Ambil data
            val email = binding.edEmail.text.toString().trim()
            val pass = binding.edPassword.text.toString().trim()

            // 2. Reset Error dulu (hapus tulisan merah sebelumnya)
            binding.tilEmail.error = null
            binding.tilPassword.error = null

            // 3. Validasi Berjenjang
            if (email.isEmpty()) {
                binding.tilEmail.error = "Email tidak boleh kosong"
                binding.edEmail.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.tilEmail.error = "Format email salah (contoh: user@email.com)"
                binding.edEmail.requestFocus()
                return@setOnClickListener
            }

            if (pass.isEmpty()) {
                binding.tilPassword.error = "Password tidak boleh kosong"
                binding.edPassword.requestFocus()
                return@setOnClickListener
            }

            if (pass.length < 8) {
                binding.tilPassword.error = "Password terlalu pendek"
                binding.edPassword.requestFocus()
                return@setOnClickListener
            }

            viewModel.login(email, pass)
        }

        binding.tvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        setupObserver()
    }

    private fun setupObserver() {
        viewModel.authResult.observe(this) { resource ->
            when (resource) {
                is Resource.Loading -> {
                    // Tampilkan Loading
                    binding.progressBar.visibility = View.VISIBLE
                    binding.btnLogin.isEnabled = false
                    binding.btnLogin.text = "Loading..."
                }
                is Resource.Success -> {
                    // Sembunyikan Loading
                    binding.progressBar.visibility = View.GONE
                    binding.btnLogin.isEnabled = true
                    binding.btnLogin.text = "LOGIN"

                    Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
                is Resource.Error -> {
                    // Tampilkan Error
                    binding.progressBar.visibility = View.GONE
                    binding.btnLogin.isEnabled = true
                    binding.btnLogin.text = "LOGIN"
                    Toast.makeText(this, resource.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}