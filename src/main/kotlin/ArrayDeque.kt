//In Kotlin, you can use ArrayDeque directly from the Java standard library.
// So while it’s not originally a Kotlin-specific data structure,
// it is available and commonly used in Kotlin code.

fun main() {
    // Create an instance of ArrayDeque
    val deque = ArrayDeque<Int>()

    // Add elements to the deque
    deque.addFirst(10) // Adds 10 to the front of the deque
    deque.addLast(20)  // Adds 20 to the end of the deque
    deque.addFirst(5)  // Adds 5 to the front of the deque
    deque.addLast(30)  // Adds 30 to the end of the deque

    // Print the deque
    println("Deque: $deque") // Output: Deque: [5, 10, 20, 30]

    // Remove elements from the deque
    val removedFirst = deque.removeFirst() // Removes the first element (5)
    val removedLast = deque.removeLast()   // Removes the last element (30)

    // Print the removed elements and the updated deque
    println("Removed First: $removedFirst") // Output: Removed First: 5
    println("Removed Last: $removedLast")   // Output: Removed Last: 30
    println("Updated Deque: $deque") // Output: Updated Deque: [10, 20]
}
