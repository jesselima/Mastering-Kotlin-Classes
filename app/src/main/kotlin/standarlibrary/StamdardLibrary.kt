package standarlibrary

import lambdas.cars


fun filter() {
    val filtered = cars.filter { car -> car.type == "XYZ" }
}


fun map() {
    val productionYears = cars.map { car -> car.productYear }
}


fun iterateAll() {
    cars.forEach { car -> println(car.type) }
}


fun any() {
    // Return a boolean value if any of the items satisfy the supplied predicate
    val hasOldCars = cars.any { car -> car.productYear <= 2000 }
}


fun groupBy() {
    // This returns a map of integers
    val carsByProductionYear = cars.groupBy { car -> car.productYear }
}


fun multipleFunctions() {
    val count = (1..100).filter { i -> i % 2 == 0 } // Select the even numbers
        .map { i -> i * i }                         // Multiply the number by itself
        .count { it % 10 == 0 }                     // Count the numbers divisible by 10


    /**
     * Some methods that do not work in Java Collections API
     */

    fun otherUsefulMethods(input: String?): String {

        checkNotNull(input)

        input?.let { string -> println(string) }

        input?.let { string -> "$string ext" }?.also { print(it) }

        TODO("We will finish this later") // Throws a NotImplementedError
    }
}
