fun main() {
    // Creating an array using Kotlin's native Array type.
    val kotlinArray: Array<String> = arrayOf("Alice", "Bob", "Charlie")

    // Accessing and printing elements
    for (element in kotlinArray) {
        println(element)
    }

    // Modifying an element
    kotlinArray[1] = "Bobby"

    // Printing the modified array
    println(kotlinArray.joinToString()) // Output: Alice, Bobby, Charlie

    // Arrays in Kotlin are native to the language and not directly inherited from Java,
    // but they are interoperable with Java arrays.
    // Creating an integer array
    val intArray: Array<Int> = arrayOf(1, 2, 3, 4)

    // Accessing and printing integer array elements
    println(intArray.joinToString()) // Output: 1, 2, 3, 4
}


/**
 * Use arrays in Kotlin when you have specialized low-level requirements that you need to meet.
 * For example, if you have performance requirements beyond what is needed for regular applications,
 * or you need to build custom data structures. If you don't have these sorts of restrictions,
 * use collections instead.
 *
 * */