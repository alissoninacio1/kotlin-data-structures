/**
 * Set is unordered,
 * store unique items only,
 * indexed is not allowed,
 * so, it's not possible to access an item in a particular index.
 *
 *
 *
 **/


fun showSet() {
    val names = setOf("Alisson", "Alisson", "Joel","Joel")
    //it won't print the duplicates
    println(names)
    println(names.size)


    val uniqueNames = setOf<String>("Alisson", "Joel", "Luke")
    println(uniqueNames)

    val mySet = setOf("apple", "banana", "cherry")


    //because set is not indexed, these are the ways to print the elements

    // Using um loop for
    for (item in mySet) {
        println(item)
    }

    // Using forEach
    mySet.forEach { item ->
        println(item)
    }

    val setNull: MutableSet<Int?> = mutableSetOf(1, 2, null, 3, 4)


    //ways of declaring sets
    val immutableSet = setOf(1, 2, 3)
    val immutableSetWithTypes = setOf<String>("Alex", "Wander")
    val mutableSet1 = mutableSetOf(1, 2, 3)
    val mutableSet2: MutableSet<Int> = mutableSetOf(1, 2, 3)
}

fun main() {
    showSet()
}