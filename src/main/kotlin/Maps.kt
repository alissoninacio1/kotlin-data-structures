/**
 * This is like dictionaries/hash-maps or objects in JS, based in a key-value pairs
 * Allow duplicate maps
 * keys must be uniques
 *
 *
 *
 **/


fun printMaps() {
    val players = mapOf(
        10 to "Pele",
        9 to "Ronaldo",
        11 to "Romario"
    )

    val worldTitles = mapOf<String, Int>(
        "Brazil" to 5,
        "Argentina" to 3,
        "Spain" to 1
    )

    println(players)
    println(worldTitles)
    println()
    println(players.keys)
    println(players.values)
    println()
    println("${worldTitles.keys.first()} has ${worldTitles["Brazil"]} titles ")
    println()
    println("Brazil" in worldTitles.keys)
    println(3 in worldTitles.values)


    // Immutable map with inferred types
    val immutableMap = mapOf("key1" to "value1", "key2" to "value2")

    // Immutable map with explicit types
    val immutableMapWithTypes: Map<String, String> = mapOf("key1" to "value1", "key2" to "value2")

    // Mutable map with inferred types
    val mutableMap1 = mutableMapOf("key1" to "value1", "key2" to "value2")

    // Mutable map with explicit types
    val mutableMap2: MutableMap<String, String> = mutableMapOf("key1" to "value1", "key2" to "value2")



}