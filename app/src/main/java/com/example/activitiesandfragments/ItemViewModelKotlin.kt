package com.example.activitiesandfragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModelKotlin : ViewModel() {
    val selectedItem: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}