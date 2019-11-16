package interfaces

class SteerableCar: Steerable {
    override fun steer() {
        println("I am steering...")
    }
}


class SteerableTruck(steerable: Steerable): Steerable by steerable



fun steerTruck(steerableTruck: SteerableTruck) {
    steerableTruck.steer()
}