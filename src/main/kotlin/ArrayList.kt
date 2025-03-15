/**
 *  ArrayList is optimized for indexed access
 *  Maintain insertion order
 *
 * ArrayList is a class from Java that is fully interoperable with Kotlin.
 * In Kotlin, you can use ArrayList directly without needing to import it explicitly due to Kotlin's
seamless interoperability with Java.
 * While Kotlin provides its own collection types, such as List, MutableList, and others,
 * you can still use Java's ArrayList when needed.
 *
 * */


fun main() {
    // Creating an ArrayList
    val arrayList = ArrayList<String>()

    // Adding elements
    arrayList.add("Alice")
    arrayList.add("Bob")
    arrayList.add("Charlie")

    // Accessing and printing elements
    for (element in arrayList) {
        println(element)  // Prints each element in the ArrayList
    }

    // Modifying an element
    arrayList[1] = "Bobby"  // Changes the element at index 1 from "Bob" to "Bobby"

    // Printing the modified list
    println(arrayList)  // Prints the ArrayList with the modified element


}
