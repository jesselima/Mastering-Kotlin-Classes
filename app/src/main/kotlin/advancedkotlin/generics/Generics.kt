package advancedkotlin.generics

/**
 *
 */

val names: List<String> = ArrayList()


class GenericClass<T>(private var item: T) {
    fun update(newItem: T) {
        item = newItem
    }
}


fun stringClass() {
    val generic = GenericClass("test")
    generic.update("tested")

    //generic.update(arrayListOf("")) // Wont't compile with a different type argument.

    //val anotherGeneric = GenericClass<Int>("trying another type") // Wont't compile with a different type argument.
}

class NonGenericClass {
    fun <T> generateFunction(item: T) {

    }
}


fun <K, V> multipleTypes(key: K, value: V) {

}

// Generic with Function Extensions
fun <T> T.doSomething() {

}

// Generic with Function Types
fun <V> execute(item: V, init: V.() -> Unit) {

}

