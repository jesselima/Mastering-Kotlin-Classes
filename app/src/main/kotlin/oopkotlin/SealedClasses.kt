package oopkotlin

/**
 * It's a Kotlin specific feature
 * It's a way to restrict the classes hierarchy
 *
 */


sealed class Animal (val name: String)

class Dog(name: String) : Animal(name)

class Cat(name: String) : Animal(name)

// When we add a new subclass it must be set into the "when". Otherwise "when" (the compiler) will
// complain.
// class Duck(name: String) : Animal(name)


// The compiler only allows sub-classes of this sealed class Animal tobe defined in the same file.
// This is how kotlin knows how many classes we have defined.
fun nameOfAnimal(animal: Animal): String {
    return when(animal) {
        is Dog -> "The animal is a Dog with the name ${animal.name}"
        is Cat -> "The animal is a Cat with the name ${animal.name}"
        // else is not required here because due to Animal to be sealed
    }
}