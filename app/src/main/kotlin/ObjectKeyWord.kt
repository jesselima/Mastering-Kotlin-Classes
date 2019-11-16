/**
 * The "object" key word you make it a Singleton implementation
 *
 * - Can not have a primary nor secondary constructor
 * - But ir can extend other classes
 * - Any is equivalent do Object in Java
 * - The Singleton methods and properties can be accessed like static classes and methods in Java
 * - You can not create a Singleton instance
 */


object Singleton : Any(), Runnable {
    override fun run() {

    }

    val name = "Singleton"

    fun className(): String = this.javaClass.simpleName
}


fun test() {
    println("Accessing Singleton property: ${Singleton.name}")
}