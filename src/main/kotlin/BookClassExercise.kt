class Book(
    val title: String,
    val author: String,
    val year: Int,
    val price: Double
)
{
    init {
        println("primary constructor properties have been initialized")
        println()
    }

    //secondary constructor
    constructor(title: String, author: String) : this(title, author, 0, 0.0)

    init {
        println("second constructor has been initialized")
        println()
    }

    fun printDetails() {
        println("Title: $title")
        println("Author: $author")
        println("Year: $year")
        println("Price: $$price")
    }
}

//example about using another class without inheritance
class Library(val name:String, val books: MutableList<Book> = mutableListOf()) {
    init {
        println("Library '$name' is being initialized")
        if(books.isEmpty()) {
            println("No books provided, initializing with default books.")
            books.add(Book("Default Book 1", "Unknown Author"))
            books.add(Book("Default Book 2", "Unknown Author"))
        }
    }

    constructor(name: String) : this(name, mutableListOf())

    fun printLibraryDetails() {
        println("Library Name: $name")
        println("Books in Library:")
        for (book in books) {
            book.printDetails()
        }
    }
}



fun main() {
    // Using the primary constructor
    val book1 = Book("Effective Kotlin", "Marcin Moskala", 2019, 45.99)
    book1.printDetails()

    // Using the secondary constructor
    val book2 = Book("Clean Code", "Robert C. Martin")
    book2.printDetails()


    val library1 = Library("City Library", mutableListOf(book1, book2))
    library1.printLibraryDetails()

    println()

    val library2 = Library("Community Library")
    library2.printLibraryDetails()

}