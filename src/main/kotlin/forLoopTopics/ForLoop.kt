fun main() {
    //forLoopWithRanges()
    //with_Step()
    //withDownTo()
    //with_ArraysAndLists()
    withIndex()
}

fun forLoopWithRanges() {
    for (i in 1..5) {
        print("$i ")
    }
}

fun with_Step() {
    for (i in 1..10 step 3) print("$i ")
}

fun withDownTo() {
    for (i in 10 downTo 1) print("$i ")
}

fun with_ArraysAndLists() {
    val fruits = arrayOf("apple", "banana","mango")
    for (fruit in fruits)
    {
        print("$fruit ")
    }
}

fun withIndex()
{
    val colors = arrayOf("Red", "Green", "Blue")
    for ((index, color) in colors.withIndex())
    {
        println("Index: $index, Color: $color")
    }
}