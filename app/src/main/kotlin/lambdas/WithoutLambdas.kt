package lambdas

class Car(val type: String, val productYear: Int)

val cars: List<Car> = ArrayList()

interface CarPredicate {
    fun filter(car: Car): Boolean
}

fun filterCars(carPredicate: CarPredicate): List<Car> {

    val result = ArrayList<Car>()

    for(car in cars) {
        if (carPredicate.filter(car)) {
            result.add(car)
        }
    }
    return result
}


fun filterOldCars() {
    var cars = filterCars(object : CarPredicate {

        override fun filter(car: Car): Boolean {
            return car.productYear <= 2010
        }

    })
}
