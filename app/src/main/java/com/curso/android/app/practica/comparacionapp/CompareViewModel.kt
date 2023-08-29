package com.curso.android.app.practica.comparacionapp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompareViewModel : ViewModel() {

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result

    fun compareStrings(text1: String, text2: String) {
        _result.value = if (text1 == text2) {
            "Las cadenas son iguales"
        } else {
            "Las cadenas son diferentes"
        }
    }
}

