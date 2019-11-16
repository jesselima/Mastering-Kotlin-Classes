package classesconstructors

class OuterClass {

    private var name = "some name"

    class InnerClass {
        fun changeName(newName: String) {
            // "name" can not be seen
            //name = newName
        }
    }
}

class AnotherOuterClass {
    private var name = ""

    inner class Inner {
        fun changeName(newName: String) {
            name = newName
        }
    }
}