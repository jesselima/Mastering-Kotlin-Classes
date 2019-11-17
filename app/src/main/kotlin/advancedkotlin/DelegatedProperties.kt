package advancedkotlin

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Delegated Properties
 * - It's Kotlin specific feature
 * - Used for reuse code or implement some additional logic
 */

class StringDelegate {
    var string by Delegate("Kotlin")
}

class Delegate(var value: String): ReadWriteProperty<Any, String> {

    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("getValue called on Delegate, returning $value")
        return value
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("setValue called on Delegate with value: $value")
        this.value = value
    }

}


class InjectedProperty<out T>(private val clazz: Class<T>) : ReadOnlyProperty<Any, T> {
    override fun getValue(thisRef: Any, property: KProperty<*>): T {
        // In a real world library, this call would go to a container that knows how to create this
        // type. To simplify, we always create a new instance with reflection.
        return clazz.newInstance()
    }
}

inline fun <reified T : Any> injected(): InjectedProperty<T> {
    return InjectedProperty(T::class.java)
}


class DelegatedProperties {

    val any by injected<Any>()

    // WHAT COMPILER GENERATES
    private val anyInjectedProperty = InjectedProperty(Any::class.java)
    val anyProp: Any
        get() = anyInjectedProperty.getValue(this, this::anyProp)

}


class StandardLibDelegatedProperties {

    val string by lazy { "lazy string" }

    fun localDelegatedProperties(someCondition: Boolean) {
        val localLazyString by lazy { "local lazy string" }

        if(someCondition) {
            println(localLazyString)
        }
    }
}


