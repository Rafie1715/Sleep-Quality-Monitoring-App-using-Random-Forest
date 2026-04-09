package com.dicoding.restupskripsirafierojagatbachri.ui.profile

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityEditProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding
    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = auth.currentUser

        if (user != null) {
            binding.edNameEdit.setText(user.displayName)
            binding.edEmailEdit.setText(user.email)
        }

        binding.btnBack.setOnClickListener { finish() }

        binding.btnSaveProfile.setOnClickListener {
            val newName = binding.edNameEdit.text.toString().trim()

            if (newName.isNotEmpty()) {
                val profileUpdates = UserProfileChangeRequest.Builder()
                    .setDisplayName(newName)
                    .build()

                user?.updateProfile(profileUpdates)
                    ?.addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this, "Profil berhasil diperbarui", Toast.LENGTH_SHORT).show()
                            finish()
                        } else {
                            Toast.makeText(this, "Gagal update profil", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }
}