package com.curso.android.app.practica.comparacionapp

import org.junit.Test
import org.junit.Assert.*

class StringComparatorTest {
    @Test
    fun testEqualStrings() {
        val comparator = StringComparator("hello", "hello")
        assertEquals("Las cadenas de texto son iguales", comparator.result)
    }

    @Test
    fun testDifferentStrings() {
        val comparator = StringComparator("hello", "world")
        assertEquals("Las cadenas de texto son diferentes", comparator.result)
    }
}