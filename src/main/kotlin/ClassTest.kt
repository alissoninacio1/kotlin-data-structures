class ClassTest (
    val  age: Int,
    val name:String,
    val id: Int) {

    //secondary
    //In Kotlin, when you have a primary constructor with parameters,
    // and you want to create a secondary constructor that delegates to the primary constructor,
    // you use the 'this' keyword followed by parentheses containing the arguments for the primary constructor
    constructor(status: Boolean):this(0,"NoName",0) {
        println(status)
    }

    fun showUser() {
        println("$age, $name, $id")
    }
}

fun main() {
    val contact = ClassTest(25, "Willy", 345)
    contact.showUser()

    val secondary = ClassTest(true)
    secondary.showUser()
}