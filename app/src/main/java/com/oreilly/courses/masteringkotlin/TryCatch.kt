package com.oreilly.courses.masteringkotlin

import java.io.InputStream
import java.lang.Exception


fun divideWithZero(n: Int) {
    try {
        // Try something
        val fail = n /0
    } catch (e: Exception) {
        // Exception caught
    } finally {
        // Do some thing
    }
}


/**
 * Kotlin does not have checked exceptions.
 * In Kotlin we need to explicitly handle
 */

fun openStream(stream: InputStream) {
    stream.close()
}

/**
 * TO simulate the check exception in kotlin we use the Throws annotation
 * But only work if the kotlin function is been called from Java
 */

@Throws
fun openStream2(stream: InputStream) {
    stream.close()
}
