package com.dicoding.restupskripsirafierojagatbachri.data.repository

import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
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

            val collectionRef = firestore.collection("sleep_records")

            val documentRef = collectionRef.document()

            record.id = documentRef.id
            record.user_id = currentUser.uid

            documentRef.set(record).await()

            emit(Resource.Success("Data tidur berhasil disimpan!"))

        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "Terjadi kesalahan yang tidak diketahui"))
        }
    }

    fun getLatestSleepRecord(): Flow<Resource<SleepRecord?>> = flow {
        emit(Resource.Loading)
        try {
            val currentUser = auth.currentUser
            if (currentUser == null) {
                emit(Resource.Error("User belum login"))
                return@flow
            }

            val snapshot = firestore.collection("sleep_records")
                .whereEqualTo("user_id", currentUser.uid)
                .orderBy("wake_time", Query.Direction.DESCENDING)
                .limit(1)
                .get()
                .await()

            if (!snapshot.isEmpty) {
                val record = snapshot.documents[0].toObject(SleepRecord::class.java)
                emit(Resource.Success(record))
            } else {
                emit(Resource.Success(null))
            }

        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "Gagal mengambil data"))
        }
    }

    fun getAllSleepRecords(): Flow<Resource<List<SleepRecord>>> = flow {
        emit(Resource.Loading)
        try {
            val currentUser = auth.currentUser
            if (currentUser == null) {
                emit(Resource.Error("User belum login"))
                return@flow
            }

            val snapshot = firestore.collection("sleep_records")
                .whereEqualTo("user_id", currentUser.uid)
                .orderBy("wake_time", Query.Direction.DESCENDING)
                .get()
                .await()

            val records = snapshot.documents.mapNotNull { it.toObject(SleepRecord::class.java) }
            emit(Resource.Success(records))

        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "Gagal mengambil riwayat data"))
        }
    }

    fun getWeeklySleepRecords(): Flow<Resource<List<SleepRecord>>> = flow {
        emit(Resource.Loading)
        try {
            val currentUser = auth.currentUser
            if (currentUser == null) {
                emit(Resource.Error("User belum login"))
                return@flow
            }

            val snapshot = firestore.collection("sleep_records")
                .whereEqualTo("user_id", currentUser.uid)
                .orderBy("wake_time", Query.Direction.DESCENDING)
                .limit(7)
                .get()
                .await()

            val records = snapshot.documents.mapNotNull { it.toObject(SleepRecord::class.java) }

            emit(Resource.Success(records.reversed()))

        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "Gagal memuat grafik mingguan"))
        }
    }
}
