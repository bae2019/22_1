package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    private val repo = Notice_Repo()
    fun fetchData(): LiveData<MutableList<notice_data>> {
        val mutableData = MutableLiveData<MutableList<notice_data>>()
        repo.getData().observeForever{
            mutableData.value = it
        }
        return mutableData
    }
}