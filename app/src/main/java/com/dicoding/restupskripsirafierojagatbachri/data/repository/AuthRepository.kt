package com.dicoding.restupskripsirafierojagatbachri.data.repository

import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.UserProfileChangeRequest
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) {
    suspend fun login(email: String, pass: String): Resource<FirebaseUser> {
        return try {
            val result = firebaseAuth.signInWithEmailAndPassword(email, pass).await()
            Resource.Success(result.user!!)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Terjadi kesalahan")
        }
    }

    suspend fun register(name: String, email: String, pass: String): Resource<FirebaseUser> {
        return try {
            val result = firebaseAuth.createUserWithEmailAndPassword(email, pass).await()
            val user = result.user

            val profileUpdates = UserProfileChangeRequest.Builder()
                .setDisplayName(name)
                .build()

            user?.updateProfile(profileUpdates)?.await()

            Resource.Success(user!!)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Gagal mendaftar")
        }
    }

    fun getCurrentUser(): FirebaseUser? = firebaseAuth.currentUser

    fun logout() = firebaseAuth.signOut()
}