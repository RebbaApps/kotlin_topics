package scopeFunctions

class ScopeFunctions {

    lateinit var name : String
    lateinit var objective : String
    lateinit var founder : String

}

fun main() {
    // without using scope function
    normalFunction()


}

fun normalFunction()
{
    // creating instance of ScopeFunctions Class
    var obj = ScopeFunctions()

    // initializing members of the class
    obj.name = "Kotlin Scopes"
    obj.objective = "For Testing"
    obj.founder = "Praveen Rebba"

    println(obj.name)
}