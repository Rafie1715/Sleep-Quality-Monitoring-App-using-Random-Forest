package com.dicoding.restupskripsirafierojagatbachri.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.restupskripsirafierojagatbachri.data.repository.AuthRepository
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repository: AuthRepository
) : ViewModel() {

    private val _authResult = MutableLiveData<Resource<FirebaseUser>>()
    val authResult: LiveData<Resource<FirebaseUser>> = _authResult

    fun login(email: String, pass: String) {
        _authResult.value = Resource.Loading
        viewModelScope.launch {
            _authResult.value = repository.login(email, pass)
        }
    }

    fun register(name: String, email: String, pass: String) {
        _authResult.value = Resource.Loading
        viewModelScope.launch {
            _authResult.value = repository.register(name, email, pass)
        }
    }
}