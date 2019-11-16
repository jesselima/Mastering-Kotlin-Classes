package singletonandstatics

// TODO -> Without Lambda
fun newRunnable(): Runnable {

    val foo = "foo"

    return object : Runnable {
        override fun run() {
            println(foo)
        }
    }
}

// TODO -> With Lambda :D
fun newRunnableWithLambda(): Runnable {

    val foo = "foo"

    return Runnable { println(foo) }
}