package controlFlow


var greeting: String? = null
fun main() {

    greeting = "hello"
    var greetingToPrint = when(greeting){
        null -> "Hi"
        else -> "Invalid Message"
    }

    println(greetingToPrint)

    when_example_1()
}

fun when_example_1()
{
    //with range
    val marks = 85

    val grade = when(marks){

        in 90..100 -> "A+"
        in 75..89 -> "A"
        in 65..74 -> "B"
        in 50..64 -> "c"
        else -> "Invalid Marks"
    }
    println("grade is : $grade")
}