/**
 * Collection<T> is the root of the collection hierarchy.
 *
 * You can use Collection as a parameter of a function that applies to different collection types.
 * For more specific cases, use the Collection's inheritors: List and Set.
 *
 */

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun main() {
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}
