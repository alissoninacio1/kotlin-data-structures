/**
 * Order Collection of Items - allow duplicates, store in the order they're added
 * Kotlin can infer the list types, but if you want to add types, add them inside <>
 *
 * It's similar to arrays
 *
 **/

fun printList() {

    //as the type isn't specified, I can add different data types when a mutable list is used
    val names = listOf("Alisson", "Oliveira", "Inacio")

    //data type is specified in a mutable list, I can't add another type of data
    val ages = listOf<Int>(10, 14, 35, 36, 95)

    println(names)
    println(ages)
    println(names[2])

}

fun main() {
    printList()
}