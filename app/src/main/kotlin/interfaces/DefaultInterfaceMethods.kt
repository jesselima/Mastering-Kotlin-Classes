package interfaces


interface Stoppable : Drivable {
    // Default method implementation
    fun stop() = println("I am stopping...")
}


class StoppablçeCar : Stoppable {
    override fun drive() {
        println("I am driving...")
    }

}