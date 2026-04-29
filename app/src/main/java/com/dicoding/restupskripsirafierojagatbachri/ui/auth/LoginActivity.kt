package com.dicoding.restupskripsirafierojagatbachri.ui.auth

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityLoginBinding
import com.dicoding.restupskripsirafierojagatbachri.ui.main.MainActivity
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val viewModel: AuthViewModel by viewModels()
    private lateinit var googleSignInClient: GoogleSignInClient

    private val googleSignInLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
            try {
                val account = task.getResult(ApiException::class.java)!!
                viewModel.loginWithGoogle(account.idToken!!)
            } catch (e: ApiException) {
                Toast.makeText(this, "Google Sign-In gagal: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupGoogleSignIn()
        setupAction()
        setupObserver()
        playAnimation()
    }

    private fun setupGoogleSignIn() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, gso)
    }

    private fun setupAction() {
        binding.btnLogin.setOnClickListener {
            // ... (kode login email/pass tetap sama)
            val email = binding.edEmail.text.toString().trim()
            val pass = binding.edPassword.text.toString().trim()

            binding.tilEmail.error = null
            binding.tilPassword.error = null

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

        binding.btnGoogleLogin.setOnClickListener {
            val signInIntent = googleSignInClient.signInIntent
            googleSignInLauncher.launch(signInIntent)
        }

        binding.tvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun playAnimation() {
        ObjectAnimator.ofFloat(binding.ivLogo, View.TRANSLATION_Y, -30f, 30f).apply {
            duration = 3000
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }.start()

        val logo = ObjectAnimator.ofFloat(binding.ivLogo, View.ALPHA, 1f).setDuration(400)
        val title = ObjectAnimator.ofFloat(binding.tvTitle, View.ALPHA, 1f).setDuration(400)
        val subtitle = ObjectAnimator.ofFloat(binding.tvSubtitle, View.ALPHA, 1f).setDuration(400)
        val email = ObjectAnimator.ofFloat(binding.tilEmail, View.ALPHA, 1f).setDuration(400)
        val pass = ObjectAnimator.ofFloat(binding.tilPassword, View.ALPHA, 1f).setDuration(400)
        val btn = ObjectAnimator.ofFloat(binding.btnLogin, View.ALPHA, 1f).setDuration(400)
        val divider = ObjectAnimator.ofFloat(binding.layoutDividerOr, View.ALPHA, 1f).setDuration(400)
        val googleBtn = ObjectAnimator.ofFloat(binding.btnGoogleLogin, View.ALPHA, 1f).setDuration(400)
        val footer = ObjectAnimator.ofFloat(binding.layoutFooter, View.ALPHA, 1f).setDuration(400)

        AnimatorSet().apply {
            playSequentially(logo, title, subtitle, email, pass, btn, divider, googleBtn, footer)
            start()
        }
    }

    private fun setupObserver() {
        viewModel.authResult.observe(this) { resource ->
            when (resource) {
                is Resource.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.btnLogin.isEnabled = false
                    binding.btnLogin.text = "Loading..."
                }
                is Resource.Success -> {
                    binding.progressBar.visibility = View.GONE
                    binding.btnLogin.isEnabled = true
                    binding.btnLogin.text = "LOGIN"

                    Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
                is Resource.Error -> {
                    binding.progressBar.visibility = View.GONE
                    binding.btnLogin.isEnabled = true
                    binding.btnLogin.text = "LOGIN"
                    
                    val errorMessage = when {
                        resource.message.contains("password", ignoreCase = true) -> "Password salah"
                        resource.message.contains("user-not-found", ignoreCase = true) || resource.message.contains("no user", ignoreCase = true) -> "Email belum terdaftar"
                        resource.message.contains("credential", ignoreCase = true) -> "Email atau password salah"
                        else -> resource.message
                    }
                    
                    Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}