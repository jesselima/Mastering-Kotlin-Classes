package advancedkotlin.operatoroverloading

/**
 * Operator Overloading
 */

data class Numeric(val value: Int) {

    operator fun plus(other: Numeric): Numeric {
        return Numeric(value + other.value)
    }

    operator fun times(other: Numeric): Numeric {
        return Numeric(value * other.value)
    }

    operator fun plus(num: Number): Numeric {
        return Numeric(value + num.toInt())
    }

}

// Extension Function with Operator Overloading
operator fun Char.times(multiplier: Int): String {
    return this.toString().repeat(multiplier)
}


fun testingMyFunctions() {
    val n1 = Numeric(10)
    val n2 = Numeric(20)

    val n3 = n1 + n2 // = 30
    val n4 = n1 * n2 // = 200
    val n5 = n1 + 10 // = 20

    println('A' * 3) // Prints AAA

    // Collections have extensions methods that overload operators.
    val stringList = ArrayList<String>()
    stringList += "Kotlin"


    val anotherList = listOf("Java")
    val combinedList = anotherList + stringList // A new list with "Kotlin" and "Java"

    println(stringList[0]) // Prints "Kotlin"
    stringList[0] = "Java"  // Set "Java" to the 0 index position

    val map = mapOf(1 to "Kotlin")
    println(map[1]) // Prints "kotlin"

    println("Kotlin" in stringList) // prints True


}