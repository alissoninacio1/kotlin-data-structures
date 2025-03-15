//Unity is like the keyword "void" in some programming languages

// function that returns Unit
fun printMessage(message: String): Unit {
    println(message)
}

// Specification : Unit can be omitted and the result will be the same
fun printAnotherMessage(message: String) {
    println(message)
}

fun main() {
    printMessage("Hello, Kotlin!")  // Output: Hello, Kotlin!
    printAnotherMessage("Hello again!")  // Output: Hello again!
}
