fun showIterators() {
    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()

    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }



    val numbers2 = mutableListOf("one", "two", "three", "four")
    val mutableIterator = numbers2.iterator()

    mutableIterator.next()
    mutableIterator.remove()
    println("After removal: $numbers2")


    val numbers3 = mutableListOf("one", "four", "four")
    val mutableListIterator = numbers3.listIterator()

    mutableListIterator.next()
    mutableListIterator.add("two")
    mutableListIterator.next()
    mutableListIterator.set("three")
    println(numbers3)




}
