package functions

/**
 * Receiver functions are specific to Kotlin.
 *
 */


data class Person(
    var name: String? = null,
    var yearOfBirth: Int? = null,
    var country: String? = null
)


fun newPerson(init: Person.() -> Unit): Person {
    val person = Person()
    person.init()
    init(person)
    return person
}

fun person() = newPerson {
    name = "Bob"
    yearOfBirth = 2001
    country = "Brazil"
}

fun personApply() = Person().apply {
    name = "Bob"
    yearOfBirth = 2001
    country = "Brazil"
}