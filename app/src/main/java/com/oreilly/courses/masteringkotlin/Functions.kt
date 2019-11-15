package com.oreilly.courses.masteringkotlin

/**
 * Functions
 * Kotlin function always return a object (Unit)
 */
fun someFunction(name: String) {
    println(name)
}

fun someFunctionInline(name: String) = println(name)

// Using type inference. The function will return a Int from teh result between a + b
fun sum(a: Int, b: Int): Int = a + b

private fun calculate() = Unit

private fun doSaomeThing(number: Int) {
    // Immutable value
    val count = 1
    // Mutable value
    var finalValue = number + count

}
