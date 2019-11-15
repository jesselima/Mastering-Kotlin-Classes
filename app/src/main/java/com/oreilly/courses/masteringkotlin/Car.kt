package com.oreilly.courses.masteringkotlin

/**
 * Created by jesse on 11/15/19.
 * This is a part of the project Mastering Kotlin.
 */
class Car(var model: String, val dieselEngine: Boolean) {

    // Kotlin is type safe. Then We need to initialize the property
    var color: String = "yellow"
    private val seatCount = 4

    // Initialize the properties after the constructor fires.
    // Dependency  injection is one good example too.
    // When use lateinit we can omit initializer.
    // If you try to access the lateinit property without it have been initialized you will
    // get an UninitializedException.
    lateinit var maker: String


}