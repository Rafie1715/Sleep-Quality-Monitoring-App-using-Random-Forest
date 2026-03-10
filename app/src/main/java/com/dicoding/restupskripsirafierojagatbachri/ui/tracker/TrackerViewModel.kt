package com.dicoding.restupskripsirafierojagatbachri.ui.tracker

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
class TrackerViewModel @Inject constructor(
    private val repository: TrackerRepository
) : ViewModel() {

    private val _saveStatus = MutableLiveData<Resource<String>>()
    val saveStatus: LiveData<Resource<String>> = _saveStatus

    fun saveSleepRecord(record: SleepRecord) {
        viewModelScope.launch {
            repository.saveSleepRecord(record).collect { result ->
                _saveStatus.postValue(result)
            }
        }
    }
}