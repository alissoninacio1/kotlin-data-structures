fun main() {
    // Using HashMap directly from Kotlin (backed by Java's HashMap)
    // This creates a HashMap that is mutable and allows you to add, update, and remove elements.
    val kotlinHashMap: HashMap<String, Int> = hashMapOf("Alice" to 1, "Bob" to 2, "Charlie" to 3)

    // Adding and modifying values in the HashMap
    kotlinHashMap["Dave"] = 4
    kotlinHashMap["Alice"] = 5

    println("Kotlin HashMap: $kotlinHashMap")
    // Output: {Alice=5, Bob=2, Charlie=3, Dave=4}

    // Using the Map interface in Kotlin
    // By default, mapOf creates an immutable Map (a LinkedHashMap is used internally)
    val kotlinMap: Map<String, Int> = mapOf("Alice" to 1, "Bob" to 2, "Charlie" to 3)

    println("Kotlin Map: $kotlinMap")
    // Output: {Alice=1, Bob=2, Charlie=3}

    // Creating a MutableMap implemented as a HashMap
    // This is similar to the first example but emphasizes the use of the MutableMap interface.
    val mutableHashMap: MutableMap<String, Int> = hashMapOf("Alice" to 1, "Bob" to 2, "Charlie" to 3)

    // Adding and modifying values in the MutableMap
    mutableHashMap["Dave"] = 4
    mutableHashMap["Alice"] = 5

    println("Mutable HashMap as MutableMap: $mutableHashMap")
    // Output: {Alice=5, Bob=2, Charlie=3, Dave=4}
}

/**
* The key difference is that using HashMap in Kotlin specifically ties the code to that Java-based implementation,
 * while using MutableMap with hashMapOf keeps the code more flexible and idiomatic in Kotlin.
 * Kotlin's Map and MutableMap interfaces are preferred
 * because they allow for easy switching between different implementations without changing the code's interface.
 * This makes your Kotlin code more adaptable and maintains compatibility with Kotlin's collection operations.
*
 *
 *
 *
 * 1. **Kotlin `HashMap`**: Uses `hashMapOf`,which creates a mutable `HashMap` from Java.
 * You can add, modify, and remove elements.
 *
 *
 * 2. **Kotlin `Map`**: Uses `mapOf` to create an immutable `Map`, which cannot be changed after creation.
 * It's backed by a `LinkedHashMap` by default.
 *
 *
 * 3. **Kotlin `MutableMap` using `HashMap`**: Uses `hashMapOf` to create a `MutableMap`,
 * allowing changes to the map, similar to the `HashMap` example.
 *
 *
 * This shows how Kotlin provides both mutable and immutable map options,
 * with the mutable version leveraging Java's `HashMap`.
 *
 *
 * */