package com.dicoding.restupskripsirafierojagatbachri.data.repository

import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class TrackerRepository @Inject constructor(
    private val auth: FirebaseAuth,
    private val firestore: FirebaseFirestore
) {
    fun saveSleepRecord(record: SleepRecord): Flow<Resource<String>> = flow {
        emit(Resource.Loading)
        try {
            val currentUser = auth.currentUser
            if (currentUser == null) {
                emit(Resource.Error("User belum login"))
                return@flow
            }

            // 1. Tentukan Collection di Firestore
            val collectionRef = firestore.collection("sleep_records")

            // 2. Buat ID Dokumen baru secara otomatis
            val documentRef = collectionRef.document()

            // 3. Masukkan ID Dokumen dan UID User ke dalam record
            record.id = documentRef.id
            record.user_id = currentUser.uid

            // 4. Simpan ke Firestore dan tunggu prosesnya selesai
            documentRef.set(record).await()

            // 5. Berhasil!
            emit(Resource.Success("Data tidur berhasil disimpan!"))

        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "Terjadi kesalahan yang tidak diketahui"))
        }
    }
}
