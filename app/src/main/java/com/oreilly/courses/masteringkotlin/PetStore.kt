package com.oreilly.courses.masteringkotlin

/**
 * Created by jesselima on 11/15/19.
 * This is a part of the project Mastering Kotlin.
 */


/**
 * @param pets var in front of the constructor parameter make "pets" became a property.
 * It has a private field
 * It has getters and setters
 * The field "pets" will" be initialized by the constructor parameter
 */
class PetStore(var pets: List<Pet>) {

    // methods by default are public. In Java the default is private
    // The question mark in the function return type "Pet" means that the return type can be null.
    fun findPet(name: String): Pet? {
        // Using a extensions method
        return pets.firstOrNull { pet -> pet.name == name}
    }

}