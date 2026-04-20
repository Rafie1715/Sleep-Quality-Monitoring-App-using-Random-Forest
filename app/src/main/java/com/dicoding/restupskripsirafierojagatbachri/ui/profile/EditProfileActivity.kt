package com.dicoding.restupskripsirafierojagatbachri.ui.profile

import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dicoding.restupskripsirafierojagatbachri.R
import com.dicoding.restupskripsirafierojagatbachri.databinding.ActivityEditProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding
    private val auth = FirebaseAuth.getInstance()
    private var currentImageUri: Uri? = null

    private val launcherGallery = registerForActivityResult(
        ActivityResultContracts.PickVisualMedia()
    ) { uri: Uri? ->
        if (uri != null) {
            currentImageUri = uri
            showImage()
        } else {
            Toast.makeText(this, "Tidak ada gambar yang dipilih", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = auth.currentUser

        if (user != null) {
            binding.edNameEdit.setText(user.displayName)
            binding.edEmailEdit.setText(user.email)
            user.photoUrl?.let {
                Glide.with(this)
                    .load(it)
                    .placeholder(R.drawable.ic_person)
                    .into(binding.ivProfileEdit)
            }
        }

        binding.btnBack.setOnClickListener { finish() }

        binding.fabEditPhoto.setOnClickListener {
            launcherGallery.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }

        binding.btnSaveProfile.setOnClickListener {
            saveProfile()
        }
    }

    private fun showImage() {
        currentImageUri?.let {
            Glide.with(this)
                .load(it)
                .into(binding.ivProfileEdit)
        }
    }

    private fun saveProfile() {
        val user = auth.currentUser
        val newName = binding.edNameEdit.text.toString().trim()

        if (newName.isEmpty()) {
            binding.edNameEdit.error = "Nama tidak boleh kosong"
            return
        }

        binding.btnSaveProfile.isEnabled = false
        binding.btnSaveProfile.text = "Menyimpan..."

        val profileUpdates = UserProfileChangeRequest.Builder()
            .setDisplayName(newName)
            .apply {
                currentImageUri?.let { photoUri = it }
            }
            .build()

        user?.updateProfile(profileUpdates)
            ?.addOnCompleteListener { task ->
                binding.btnSaveProfile.isEnabled = true
                binding.btnSaveProfile.text = getString(R.string.simpan_perubahan)
                
                if (task.isSuccessful) {
                    Toast.makeText(this, "Profil berhasil diperbarui", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    Toast.makeText(this, "Gagal update profil: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}