fun main() {
    val set = setOf("Alice", "Bob", "Charlie", "Dave", "Eve")
    val mutableSet = mutableSetOf("Alice", "Bob", "Charlie", "Dave", "Eve")

    // Size
    println(set.size)

    // Contains
    println(set.contains("Alice"))

    // Iterating
    set.forEach { println(it) }

    // Adding and removing (MutableSet only)
    mutableSet.add("Frank")
    mutableSet.remove("Alice")
    println(mutableSet)

    // Union
    println(set.union(setOf("Frank", "Grace")))

    // Intersection
    println(set.intersect(setOf("Charlie", "Grace")))

    // Difference
    println(set.subtract(setOf("Alice", "Charlie")))

    // Filtering
    println(set.filter { it.startsWith("B") })

    // Mapping
    println(set.map { it.length })

    // Checking emptiness
    println(set.isEmpty())

    // Converting to List
    println(set.toList())
}
