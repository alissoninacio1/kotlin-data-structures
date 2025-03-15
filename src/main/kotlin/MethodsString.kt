fun main() {
    val string = "Hello, World!"

    // Length
    println(string.length)

    // Substring
    println(string.substring(0, 5))

    // Split
    println(string.split(", "))

    // Replace
    println(string.replace("World", "Kotlin"))

    // Case manipulation
    println(string.lowercase())
    println(string.uppercase())

    // Contains
    println(string.contains("Hello"))

    // Iterating over characters
    string.forEach { println(it) }

    // Reversed
    println(string.reversed())

    // Trimming
    println(string.trim())

    // Indexing
    println(string[0])

    // Starting and ending checks
    println(string.startsWith("Hello"))
    println(string.endsWith("!"))

    // Padding
    println(string.padStart(15, '*'))
    println(string.padEnd(15, '*'))

    // Formatting
    println("%s %d".format("Number:", 42))

    // Matching patterns
    println(string.matches(Regex("Hello, .*!")))
}
