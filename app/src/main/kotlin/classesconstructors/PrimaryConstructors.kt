@file:Suppress("unused", "RemoveEmptyBody", "JoinDeclarationAndAssignment")

package classesconstructors


// Kotlin can have only one primary constructor per class

class FirstCar(val type: String, val ProductionYear: Int) {

}


class SecondCar(type: String, productionYear: Int) {
    val type: String
    val productionYear: Int

    // Initialize block is reserved for primary constructor
    // Its used for additional initialization that you do npt have inside of the constructor
    init {
        this.type = type
        this.productionYear = productionYear
    }
}


class ThirdCar(type: String, productionYear: Int) {
    val type: String = type
    val productionYear = productionYear
}

// Its a valid class declaration in kotlin.
class EmptyCar


//class InjectedCar @Inject constructor(val type: String)