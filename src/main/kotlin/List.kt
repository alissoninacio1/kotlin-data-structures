/**
 * Order Collection of Items - allow duplicates, store in the order they're added
 * Kotlin can infer the list types, but if you want to add types, add them inside <>
 *
 * It's similar to arrays
 *
 **/

fun printList() {
    val names = listOf("Alisson", "Oliveira", "Inacio")
    val ages = listOf<Int>(10, 14, 35, 36, 95)

    println(names)
    println(ages)
}