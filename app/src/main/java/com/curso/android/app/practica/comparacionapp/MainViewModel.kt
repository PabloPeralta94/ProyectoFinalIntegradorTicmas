package com.curso.android.app.practica.comparacionapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val resultText = MutableLiveData<String>()

    fun compareStrings(text1: String, text2: String) {
        val comparator = StringComparator(text1, text2)
        resultText.value = comparator.result
    }
}