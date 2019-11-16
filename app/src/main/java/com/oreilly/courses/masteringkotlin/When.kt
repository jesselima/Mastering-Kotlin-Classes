package com.oreilly.courses.masteringkotlin

import java.lang.IllegalArgumentException

// Use of when as expression
fun getAge(person: String): Int {
    return when(person) {
        "Mary" -> 21
        "John" -> 40
        "Richard" -> 35
        else -> throw IllegalArgumentException("Unknown person")
    }
}

// Use of when as statement
fun checkPersonName(name: String) {
    when(name.length) {
        1,2,3 -> println("Name is too short!")
        in 4..10 -> println("Name length is ok!")
    }
}