package classesconstructors

import java.util.*

class Person(val name: String) {

    var isRetired = false

    // Used for Java Interoperability
    constructor(name: String, birthDayYear: Int): this(name) {
        isRetired = birthDayYear <= Calendar.getInstance().get(Calendar.YEAR) - 65
    }
}