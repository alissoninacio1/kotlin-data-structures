data class DataClassBook(val title: String, val author: String, val year: Int, val price: Double)

fun main() {
    val book1 = DataClassBook("Effective Kotlin", "Marcin Moskala", 2019, 45.99)
    val book2 = DataClassBook("Clean Code", "Robert C. Martin", 2008, 49.99)

    // toString()
    println(book1)

    // Use of equals() and hashCode()
    val book3 = DataClassBook("Effective Kotlin", "Marcin Moskala", 2019, 45.99)
    println(book1 == book3)  // true

    // copy()
    val book4 = book1.copy(price = 39.99)
    println(book4)

    // Destructuring
    val (title, author, year, price) = book2
    println("Title: $title, Author: $author, Year: $year, Price: $price")
}
