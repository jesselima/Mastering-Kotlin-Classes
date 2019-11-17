package functions

/**
 *
 */


inline fun modifyPerson(person: Person, modifier: (Person) -> Unit) {
    modifier(person)
}

fun modifyPersonCall() {
    val person = Person()
    modifyPerson(person) { p ->
        p.country = "Brazil"
        p.name = "Jesse"
        p.yearOfBirth = 1981
    }
}


fun modifyPersonCompilerGeneratedCode() {
    val person = Person()
    person.country = "Brazil"
    person.name = "Jesse"
    person.yearOfBirth = 1981
}


inline fun modifyPerson(
    person: Person,
    modifier: (Person) -> Unit,
    noinline log: (String) -> Unit
) {
    modifier(person)
}


/**
 * Inline restrictions:
 * Inline function can not be stored into a property because the compiler substitutes Java byte
 * code function type. So it can not be stored into a object for a later use.
 */

private var storedAction: () -> Unit = {}

inline fun cantInline(action: () -> Unit) {
    //storedAction = action
}