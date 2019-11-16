package interfaces


interface Drivable {
    fun drive()
}


class DrivebleCar: Drivable {
    override fun drive() {
        println("I am driving...")
    }
}


interface Steerable {
    fun steer()
}


class DrivableSteerableCar: Drivable, Steerable {

    override fun steer() {
        println("I am steering...")
    }

    override fun drive() {
        println("I am driving...")
    }

}