/**
 *
 * In Kotlin, data class is a class that is mainly used to store data.
 * When you define a data class, the compiler automatically generates useful methods
 * like equals(), hashCode(), toString(), copy()
 * Will you store/hold data? So, use a data class
 *
 * Don't use a data class when you need to use a complex class to interact with other classes
 * */

data class User (
    val age:Int = 33,
    val hero:String = "Kal"
    )
//class without body, so without {}

fun main() {
    val user1 = User()
    val user2 = User()
    val user3 = User(35, "Batman")


    //toString()
    println(user1.toString())

    //using equals
    println(user1 == user2)

    //using copy
    val user4 = user3.copy()
    println(user4.toString())
}