package com.curso.android.app.practica.comparacionapp

data class StringComparator (val text1: String, val text2: String) {
    val result: String
        get() = if (text1 == text2) {
            "Las cadenas de texto son iguales"
        } else {
            "Las cadenas de texto son diferentes"
        }
}