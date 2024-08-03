typealias StringTransformation = (String) -> String

fun transformString(string: String, transformation: StringTransformation): String {
    return transformation(string)
}

typealias StringList = List<String>

fun printStringList(strings: StringList) {
    for (string in strings) {
        println(string)
    }
}

fun main() {
    val myList: StringList = listOf("Kotlin", "Type", "Alias")
    printStringList(myList) // Output: Kotlin, Type, Alias

    
    val upperCaseTransformation: StringTransformation = { it.uppercase() }
    val result = transformString("hello, world", upperCaseTransformation)
    println(result) // Output: HELLO, WORLD
}