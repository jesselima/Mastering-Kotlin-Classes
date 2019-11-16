package oopkotlin

abstract class BaseCar {

    // Kotlin allows us to mark properties as abstract
    // This means that the classes the extends this base class will have to override the properties
    abstract  val isDrivable: Boolean

    abstract fun drive()

}


class RoadCar : BaseCar() {

    override val isDrivable: Boolean
        get() = true

    override fun drive() {
        println("I am Driving...")
    }


}
