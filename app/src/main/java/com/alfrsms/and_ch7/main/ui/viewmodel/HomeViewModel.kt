package com.alfrsms.and_ch7.main.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.alfrsms.and_ch7.main.data.DataStoreManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val dataStoreManager: DataStoreManager): ViewModel() {
    fun getUsername(): LiveData<String> {
        return dataStoreManager.getUsername().asLiveData()
    }
}