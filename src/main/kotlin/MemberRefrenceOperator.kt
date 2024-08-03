// Define a class with a property and a method
class Person(val name: String) {
    fun greet() {
        println("Hello, $name!")
    }
}

fun main() {
    // Case 1: Reference to a property
    val nameProperty = Person::name
    val personInstance = Person("Alice")

    // Get the value of the 'name' property from the personInstance
    val nameValue = nameProperty.get(personInstance)
    println("Property reference: $nameValue")  // Output: Property reference: Alice

    //direct access of the value of the 'name' property
    println(personInstance.name)


    // Case 2: Reference to a method
    val greetFunction = Person::greet

    // Call the 'greet' method on the personInstance using the function reference
    greetFunction(personInstance)  // Output: Hello, Alice!

    // Case 3: Reference to a constructor
    val personConstructor = ::Person

    // Create a new instance of Person using the constructor reference
    val newPersonInstance = personConstructor("Bob")
    println("New person created: ${newPersonInstance.name}")  // Output: New person created: Bob
}
