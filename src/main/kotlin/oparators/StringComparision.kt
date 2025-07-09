package oparators


// "==" & "===" & equals() operators
fun main() {

    val name1 : String = "Naveen"
    var name2 : String = "naveen"

    if (name1.equals(name2,true))
    {
        println("Equal")
    }
    else{
        println("Not Equal")
    }
}