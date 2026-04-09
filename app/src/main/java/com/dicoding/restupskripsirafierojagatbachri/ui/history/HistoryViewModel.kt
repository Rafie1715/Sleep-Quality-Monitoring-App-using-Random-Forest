package com.dicoding.restupskripsirafierojagatbachri.ui.history

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
class HistoryViewModel @Inject constructor(
    private val repository: TrackerRepository
) : ViewModel() {

    private val _historyList = MutableLiveData<Resource<List<SleepRecord>>>()
    val historyList: LiveData<Resource<List<SleepRecord>>> = _historyList

    fun fetchSleepHistory() {
        viewModelScope.launch {
            repository.getAllSleepRecords().collect { result ->
                _historyList.postValue(result)
            }
        }
    }
}