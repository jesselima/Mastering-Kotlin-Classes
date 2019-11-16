package lambdas

import android.view.View.OnClickListener

fun filterOldCarsWithLambdas() {
    /**
     * LAMBDA: { c -> c.productYear <= 2010 }
     * c = Type parameter. It could also be: c: Car -> ...
     * The Expression that will return the boolean: c.productYear <= 2010
     * We do not have to specify the return statement
     */
    cars.filter { c -> c.productYear <= 2010 }

    cars.elementAtOrElse(1) { Car("default", 2011) }
}

fun lambdasAndClosures() {
    var counter = 0

    var incrementation = { counter++ }
}


fun createRunnable(): Runnable = Runnable { print("Hey! I am a Runnable created with lambda") }


fun createClickListener(): OnClickListener = OnClickListener { print("Hey! This is a click listener lambda function") }