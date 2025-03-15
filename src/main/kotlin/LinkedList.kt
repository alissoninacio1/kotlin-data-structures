/**
 * LinkedList maintain insertion order
 * LinkedList is better for insertions and removals
 *
 * Frequent Insertions and Deletions:
 * Use LinkedList when you need to frequently add or remove elements from the middle of the list.
 * It provides better performance for these operations compared to ArrayList, as it doesn't require shifting elements.
 *
 *
 * Memory Efficiency: LinkedList may be more memory efficient for operations where elements are frequently added or removed, due to its dynamic nature.
 *
 * Sequential Access: While LinkedList has slower access times for random access compared to ArrayList,
 * it's efficient for sequential access.
 * */

import java.util.LinkedList

fun main() {
    // Creating a LinkedList
    val linkedList = LinkedList<String>()

    // Adding elements
    linkedList.add("Alice")
    linkedList.add("Bob")
    linkedList.add("Charlie")

    // Accessing and printing elements
    for (element in linkedList) {
        println(element)
    }

    // Modifying an element
    linkedList[1] = "Bobby"

    // Removing an element
    linkedList.remove("Charlie")

    // Printing the modified list
    println(linkedList)
}
