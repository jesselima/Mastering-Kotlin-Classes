package functions

// if the function has parameters it goes here "()"
val action: () -> Unit = { println("Function assigned to a property") }


val incrementFunction: (Int) -> Int = { i -> i + 1 }


fun createAction(): () -> Unit {
    return { println("I am a Lambda!") }
}


fun consumeAction(action: () -> Unit) {
    action()
    // Every function type in kotlin has a invoke method
    action.invoke()
}



fun passingFunctionTypes() {

    consumeAction(action)

    consumeAction { println("Lambda passed to function") }

    consumeAction(::anotherAction)

    val actionHolder = ActionHolder()
    consumeAction(actionHolder::action)

}

fun anotherAction() {
    println("Member reference")
}



class ActionHolder {
    fun action() = println("Member reference called from class")
}

