package advancedkotlin

import java.io.Closeable

/**
 * Generic Constraints
 */


fun noRawTypes() {
    /**
     *  NO raw type in Kotlin
      */
    //val list: List = ArrayList()
}

// Search about Co and Counter variants in the documentation
fun wildcards(anyList: List<*>) {
    if(anyList.isNotEmpty()) {
        val firstItem1 = anyList[0]
        // or...
        val firstItem2 = anyList.first()
    }
}


fun <T : Closeable> runAndClose(closeable: Closeable, execute: Closeable.() -> Unit) {
    try {
        closeable.execute()
    } finally {
        closeable.close()
    }
}



fun <T> multipleCOnstraints(item: T) where T : Runnable, T : Closeable {

}
