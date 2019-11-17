package advancedkotlin

/**
 * Kotlin Type System
 * - Kotlin has no primitive types
 * - Any compiles to Object from Java. The difference is the name
 * -
 */

class Car : Any() {
    fun drive() {
        println("Driving...")
    }
}


fun noPrimitiveType() {
    val i: Int = 3 // Compiles to a Java primitive int
    val boxedInt: Int? = 19 // Compiles to Java's Integer type
    val intList: List<Int> = ArrayList() // This will use Java's reference Integer generic type
}


val immutableList: List<String> = ArrayList()
val mutableList: MutableList<String> = ArrayList()


fun lists() {
    /***
     * Can modify immutable list
     */
    // immutableList.add("Kotlin") // Does not work
    mutableList.add("Kotlin") // This works

    // This works to manipulate uma immutable list
    immutableList.toMutableList().add("Kotlin")
}


fun reflection() {
    val car = Car()
    val method = car.javaClass.getMethod("drive", null)
    method.invoke(car, null)
}