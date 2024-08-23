fun main() {
    // Creating a LinkedHashMap and adding key-value pairs
    val linkedHashMap: LinkedHashMap<String, Int> = linkedMapOf(
        "Alice" to 1,
        "Bob" to 2,
        "Charlie" to 3
    )

    // Adding more key-value pairs
    linkedHashMap["Dave"] = 4
    linkedHashMap["Eve"] = 5

    // Iterating over the LinkedHashMap to show that the insertion order is preserved
    println("LinkedHashMap:")
    for ((key, value) in linkedHashMap) {
        println("$key: $value")
    }
}


/**
 *
 * LinkedHashMap is for key-value pairs
 * In Kotlin, LinkedHashMap, a Java class, maintains insertion order for key-value pairs.
 * It extends HashMap to ensure that elements are iterated in the order they were inserted.
 * This behavior is useful when order preservation is important while using map structures.
 * linkedMapOf() creates a LinkedHashMap with the provided key-value pairs.
 *
 * */