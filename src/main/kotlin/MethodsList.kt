fun main() {
    val list = listOf("Alice", "Bob", "Charlie", "Dave", "Eve")
    val mutableList = mutableListOf("Alice", "Bob", "Charlie", "Dave", "Eve")

    // Accessing elements
    println(list[0])

    // Size
    println(list.size)

    // Contains
    println(list.contains("Alice"))

    // Sublist
    println(list.subList(0, 3))

    // Iterating
    list.forEach { println(it) }

    // Filtering
    println(list.filter { it.startsWith("A") })

    // Sorting
    println(list.sorted())

    // Reversing
    println(list.reversed())

    // Mapping
    println(list.map { it.uppercase() })

    // Finding elements
    println(list.find { it == "Charlie" })

    // Grouping elements
    println(list.groupBy { it.first() })

    // Distinct elements
    println(list.distinct())

    // Adding and removing (MutableList only)
    mutableList.add("Frank")
    mutableList.remove("Alice")
    mutableList[1] = "Betty"
    println(mutableList)

    // Shuffling
    mutableList.shuffle()
    println(mutableList)

    // Joining elements
    println(list.joinToString(separator = ", ", prefix = "[", postfix = "]"))
}
