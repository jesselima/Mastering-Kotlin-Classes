package oopkotlin

/**
 * "Sealed" classes in Kotlin are similar do "final" in Java
 * "open" mark the class that can be extended
 */


open class Car {

    fun drive() {
        println("I am Driving")
    }

    open fun accelerate() {
        println("I can't drive faster")
    }
}


open class SportsCar : Car() {
    // Drive in Car is final and can not be override
//    override fun drive() {
//
//    }

    // Mark the method as "final when you do not want to allow it to be override
    final override fun accelerate() {
        println("Accelerating...")
    }
}

class SuperSportCar: SportsCar() {
    // THis method can not be override because its final on Sport Car
//    override fun accelerate() {
//        println("Accelerating My Super SPort ...")
//    }
}

