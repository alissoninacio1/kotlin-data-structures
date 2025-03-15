// Define a data class
data class Destructuring(val name: String, val age: Int)

typealias Human = Destructuring

fun main() {
    // Create an instance of Person
    val human = Human("Alice", 30)

    // Destructuring declaration
    val (name, age) = human
    println("Name: $name") // Output: Name: Alice
    println("Age: $age")   // Output: Age: 30

    // Create a list of Person objects
    val people = listOf(
        Human("Alice", 30),
        Human("Bob", 25),
        Human("Charlie", 35)
    )

    // Destructuring in a for loop
    for (human in people) {
        val (name, age) = human
        println("Name: $name, Age: $age")
    }

    // Destructuring pairs in a map
    val map = mapOf("first" to 1, "second" to 2, "third" to 3)

    // Destructuring in a for loop over map entries
    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }
}
