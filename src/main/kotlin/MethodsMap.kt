fun main() {
    val map = mapOf("Alice" to 1, "Bob" to 2, "Charlie" to 3, "Dave" to 4)
    val mutableMap = mutableMapOf("Alice" to 1, "Bob" to 2, "Charlie" to 3, "Dave" to 4)

    // Accessing elements
    println(map["Alice"])

    // Size
    println(map.size)

    // Contains key/value
    println(map.containsKey("Alice"))
    println(map.containsValue(2))

    // Iterating
    map.forEach { (key, value) -> println("$key -> $value") }

    // Adding and removing (MutableMap only)
    mutableMap["Eve"] = 5
    mutableMap.remove("Alice")
    println(mutableMap)

    // Filtering
    println(map.filter { (key, value) -> value > 2 })

    // Keys and values
    println(map.keys)
    println(map.values)

    // Mapping keys and values
    println(map.mapKeys { it.key.uppercase() })
    println(map.mapValues { it.value * 2 })

    // Merging maps
    val newMap = mapOf("Eve" to 5, "Frank" to 6)
    println(map + newMap)

    // Getting or default value
    println(map.getOrDefault("George", 0))

    // Checking emptiness
    println(map.isEmpty())
}
