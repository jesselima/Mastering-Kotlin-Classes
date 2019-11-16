@file:Suppress("unused")

var someStringNotNullable: String = "some text"

var nullableString: String? = null

// If you want to initialize the object with a null value, use the lateinit without initialization
lateinit var someLateInitString: String


fun assignString() {

    someStringNotNullable = null

    nullableString = null

}


fun explicitNullAssertion() {
    val len = nullableString!!.length // TODO -> ATTENTION IF THE OBJECT IS NULL CAUSES EXCEPTION
}

fun otherCases() {
    val len1 = nullableString.length
    // Safe Access operator "?"
    // Very important to access methods that might be null
    val len2 = nullableString?.length
}

fun elvisOperator(input: String) {

    var len = input?.length ?: -1

    val two = null ?: 2
}