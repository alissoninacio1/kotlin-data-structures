/**
 * Set is unordered, store unique items only,
 * it's not possible to access an item in a particular index.
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
}