package com.oreilly.courses.masteringkotlin

/**
 * Default Arguments (Optional parameters)
 * ->> Java has no default arguments
 */


@JvmOverloads
/** @Annotation @JvmOverloads Instructs the Kotlin compiler to generate overloads for this function
 * that substitute default parameter values.
 *
 * If a method has N parameters and M of which have default values, M overloads are generated: the first one
 * takes N-1 parameters (all but the last one that takes a default value), the second takes N-2 parameters, and so on.
 */
fun searchFor(array: IntArray,
              startIndex: Int = 0,
              endIndex: Int = array.size -1,
              searchNumber: Number = 1): IntArray {
    return array
}


class Test {

    fun call() {
        val array = intArrayOf()
        searchFor(array)
        searchFor(array, 0, 1, 1)
    }
}
