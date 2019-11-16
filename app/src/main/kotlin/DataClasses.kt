@file:Suppress("unused", "UNUSED_VARIABLE")


/**
 * When you mark a class with "data" key the compiler will generate equals, hashcode, toString and
 * copy methods with all given constructor parameters
 *
 * IMPORTANT ABOUT DATA CLASSES
 * - Must have at least one constructor parameter (immutable or mutable)
 * - Data classes can not be open or abstract
 * - The class can extend other classes
 * - Can implement interfaces
 */
data class User(val name:String, val country: String)

fun equalsCheck() {

    val user1 = User(name = "John", country = "US")
    var user2 = User(name = "John", country = "US")
    println("\nAre users $user1 and $user2 equal: ${user1 == user2}")
    println("\nAre users $user1 and $user2 reference equal: ${user1 === user2}") // Reference equality like Java

    user2 = user1
    println("\nAre users $user1 and $user2 reference equal(==) (reassigned): ${user1 == user2}")
    println("\nAre users $user1 and $user2 reference equal(===) (reassigned): ${user1 === user2}")

    val user3 = User(name = "John", country = "US")
    val user4 = User(name = "John", country = "BR")
    println("\nAre users $user3 and $user4 equal: ${user3 == user4}")
}



fun copy() {
    val usUser = User("John", "US")
    println("\nUS User: $usUser")

    val germanUser = usUser.copy(country = "Germany")
    println("\nUS User: $germanUser")
}