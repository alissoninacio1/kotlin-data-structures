fun main() {
    val char: Char = 'A'

    // Case manipulation
    println(char.lowercaseChar())
    println(char.uppercaseChar())

    // Check type
    println(char.isDigit())
    println(char.isLetter())
    println(char.isUpperCase())
    println(char.isLowerCase())
    println(char.isWhitespace())

    // Converting to Int
    println(char.code)

    // Converting to String
    println(char.toString())

    // Checking if a character is defined
    println(char.isDefined())
}
