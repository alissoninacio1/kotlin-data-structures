import java.io.File

/**
 * Unfortunately, Kotlin does not have a dedicated kotlin.io package for file I/O operations,
 * and file operations in Kotlin are typically handled through Java’s java.io.File.
 */


fun main() {
    val fileName = "example.txt"

    // Writing to a file
    File(fileName).writeText("Hello, Kotlin I/O!")
    println("File written successfully.")

    // Checking if the file exists
    if (File(fileName).exists()) {
        println("File exists.")

        // Reading the entire file content
        val content = File(fileName).readText()
        println("File Content:\n$content")

        // Reading file line by line
        val lines = File(fileName).readLines()
        println("\nFile Content Line by Line:")
        lines.forEach { println(it) }

        // Appending to the file
        File(fileName).appendText("\nThis is appended text.")
        println("\nText appended successfully.")

        // Deleting the file
        File(fileName).delete()
        println("\nFile deleted successfully.")
    } else {
        println("File does not exist.")
    }
}
