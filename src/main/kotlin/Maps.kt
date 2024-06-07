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

}