package singletonandstatics

/**
 * Companion Object
 * - Can only be created inside another class.
 * - Used to give access to private properties
 * - Kotlin encourages to declare utility functions on the package level. Declaring function outside
 *   of classes. Some time this utilities methods need to access private members of a class. That's
 *   when companion object comes to play. To give you access to private members in the class.
 *
 * @JvmStatic
 */

abstract class Vehicle

class VehicleFactory {

    private class RoadVehicle: Vehicle()

    companion object {
        fun newVehicle(): Vehicle {
            return RoadVehicle()
        }

        //Kotlin has no static key word
        @JvmStatic
        fun newVehicleStatic(): Vehicle {
            return RoadVehicle()
        }
    }
}
