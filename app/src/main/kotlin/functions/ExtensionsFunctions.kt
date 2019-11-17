package functions

import lambdas.Car


fun Car.isOld(): Boolean {
    return this.productYear <= 2010
}

fun Car?.typeOrElse(orElse: String): String {
    return this?.type ?: orElse
}

fun callExtensionsFunctio(car: Car) {
    val isOld = car.isOld()
}