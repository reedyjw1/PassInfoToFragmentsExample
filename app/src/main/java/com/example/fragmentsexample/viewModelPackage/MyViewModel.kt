package com.example.fragmentsexample.viewModelPackage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    val response: MutableLiveData<String> = MutableLiveData("init")
}