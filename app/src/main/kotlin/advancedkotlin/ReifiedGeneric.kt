package advancedkotlin

/**
 * Reified Generic
 */

// It will not work
//fun <T : Any> newInstance(): T {
//    val clazz = T::class.java
//}

// The solution is to pass the class a parameter
fun <T : Any> newInstance(clazz: Class<T>) : T {
    return clazz.newInstance()
}

// or use the inline keyword plus the reified keyword before the type
inline fun <reified T: Any> reifiedNewInstance(): T {
    return T::class.java.newInstance()
}
