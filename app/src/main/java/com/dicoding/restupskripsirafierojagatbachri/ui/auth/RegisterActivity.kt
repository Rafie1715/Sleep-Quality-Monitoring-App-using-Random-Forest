package com.dicoding.restupskripsirafierojagatbachri.ui.auth

import android.content.Intent
import android.os.Bundle
import android.util.Patterns // Import Validasi Email
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityRegisterBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.main.MainActivity
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private val viewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            // 1. Ambil data
            val name = binding.edNameRegister.text.toString().trim()
            val email = binding.edEmailRegister.text.toString().trim()
            val pass = binding.edPasswordRegister.text.toString().trim()

            // 2. Reset Error
            binding.tilNameReg.error = null
            binding.tilEmailReg.error = null
            binding.tilPassReg.error = null

            // 3. Validasi Input

            // Cek Nama
            if (name.isEmpty()) {
                binding.tilNameReg.error = "Nama harus diisi"
                binding.edNameRegister.requestFocus()
                return@setOnClickListener
            }

            // Cek Email Kosong
            if (email.isEmpty()) {
                binding.tilEmailReg.error = "Email harus diisi"
                binding.edEmailRegister.requestFocus()
                return@setOnClickListener
            }

            // Cek Format Email
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.tilEmailReg.error = "Format email tidak valid"
                binding.edEmailRegister.requestFocus()
                return@setOnClickListener
            }

            // Cek Password Kosong
            if (pass.isEmpty()) {
                binding.tilPassReg.error = "Password harus diisi"
                binding.edPasswordRegister.requestFocus()
                return@setOnClickListener
            }

            // Cek Panjang Password (Min 8)
            if (pass.length < 8) {
                binding.tilPassReg.error = "Password minimal 8 karakter"
                binding.edPasswordRegister.requestFocus()
                return@setOnClickListener
            }

            // 4. Panggil ViewModel jika valid
            viewModel.register(name, email, pass)
        }

        binding.tvLogin.setOnClickListener {
            finish()
        }

        setupObserver()
    }

    private fun setupObserver() {
        viewModel.authResult.observe(this) { resource ->
            when (resource) {
                is Resource.Loading -> {
                    // UI Loading
                    binding.progressBarRegister.visibility = View.VISIBLE
                    binding.btnRegister.isEnabled = false
                    binding.btnRegister.text = "Memproses..."
                    binding.tvLogin.isEnabled = false
                }
                is Resource.Success -> {
                    // UI Sukses
                    binding.progressBarRegister.visibility = View.GONE
                    binding.btnRegister.isEnabled = true
                    binding.btnRegister.text = "DAFTAR SEKARANG"

                    Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intent)
                    finish()
                }
                is Resource.Error -> {
                    // UI Error
                    binding.progressBarRegister.visibility = View.GONE
                    binding.btnRegister.isEnabled = true
                    binding.tvLogin.isEnabled = true
                    binding.btnRegister.text = "DAFTAR SEKARANG"

                    Toast.makeText(this, "Gagal: ${resource.message}", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}