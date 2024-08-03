class Dog {
    var name: String? = null

    fun sayName(ownerName: String) {
        println("Hi $ownerName, my name is $name")
    }
}

fun main() {
    val dog = Dog() // The Kotlin syntax is without 'new' keyword in Kotlin
    dog.name = "Linux"
    println("Hello ${dog.name}")

    dog.sayName("Alisson Inacio")
}