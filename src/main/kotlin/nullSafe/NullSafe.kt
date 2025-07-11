package nullSafe

import classKotlin.Praveen

fun main() {
    //Non-Nullable Type
    var nonNullableString : String = "Praveen"
    // name = null -> this will return Compilation Error

    //Nullable Type
    var nullableString : String? = "Praveen"
    //name1 = null
    println(nullableString?.length)


    //Safe call operator (?.)
    var name :String? = "Praveen"
    println("Safe call " + name?.length)

    var anotherName : String? = null
    println(anotherName?.length)

    // Elvis Operator (?:)
    var newName :String? = null
    println(newName ?: "Hi")

    var actualName : String? ="Bob"
    println(actualName ?: "Morly")

    // Not-Null Assertion Operator (!!)
    var nonNullName : String? = null
    //println(nonNullName!!) // it throws Null Pointer Exception

    //Safe Cast Operator (as?)
    //Performs a safe cast, returning null if the cast is not possible, instead of throwing a ClassCastException.
    
}