package com.dicoding.restupskripsirafierojagatbachri.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.restupskripsirafierojagatbachri.data.model.SleepRecord
import com.dicoding.restupskripsirafierojagatbachri.data.repository.TrackerRepository
import com.dicoding.restupskripsirafierojagatbachri.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: TrackerRepository
) : ViewModel() {

    private val _latestSleep = MutableLiveData<Resource<SleepRecord?>>()
    val latestSleep: LiveData<Resource<SleepRecord?>> = _latestSleep

    private val _weeklySleep = MutableLiveData<Resource<List<SleepRecord>>>()
    val weeklySleep: LiveData<Resource<List<SleepRecord>>> = _weeklySleep

    fun fetchLatestSleep() {
        viewModelScope.launch {
            repository.getLatestSleepRecord().collect { result ->
                _latestSleep.postValue(result)
            }
        }
    }

    fun fetchWeeklySleep() {
        viewModelScope.launch {
            repository.getWeeklySleepRecords().collect { result ->
                _weeklySleep.postValue(result)
            }
        }
    }
}