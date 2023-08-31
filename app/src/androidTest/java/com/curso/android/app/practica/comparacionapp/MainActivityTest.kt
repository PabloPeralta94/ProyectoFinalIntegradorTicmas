package com.curso.android.app.practica.comparacionapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testUIComponentsVisible() {
        onView(withId(R.id.editTextText4)).check(matches(isDisplayed()))
        onView(withId(R.id.editTextText5)).check(matches(isDisplayed()))
        onView(withId(R.id.button)).check(matches(isDisplayed()))
        onView(withId(R.id.textView4)).check(matches(isDisplayed()))
    }

    @Test
    fun testComparisonResult() {
        onView(withId(R.id.editTextText4)).perform(typeText("hello"), closeSoftKeyboard())
        onView(withId(R.id.editTextText5)).perform(typeText("world"), closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())

        onView(withId(R.id.textView4)).check(matches(withText("Las cadenas de texto son diferentes")))
    }

}