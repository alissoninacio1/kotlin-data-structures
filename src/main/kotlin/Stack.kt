/**
 * Stack is an ABSTRACT DATA TYPE.
 * It is defined by its BEHAVIOR rather than being a mathematical model
 *
 *
 * -you can implement this using a class, an array
 *  *
 *  * It supports two main operations:
 *  *    -push, which adds an element to the collection (adds at the end of the array, at the beginning opf the stack)
 *  *    -pop, which removes the most recently added element from the collection
 *



fun main() {
    val stack = mutableListOf<Int>()
    // Push operation
    stack.add(1)
    stack.add(2)
    stack.add(3)


    // Pop operation
    val poppedElement = stack.removeAt(stack.size - 1)
    println("Popped element: $poppedElement")


    // Peek operation
    val peekedElement = stack.last()
    println("Peeked element: $peekedElement")


    // Print stack
    println("Stack: $stack")
}

 * */


class Stack<T> {
    // Initialize an empty list to store items
    private val items = mutableListOf<T>()

    // Add element to the stack (it will be the top element)
    fun push(element: T) {
        items.add(element)
    }

    // Remove the top element from the stack
    fun pop(): T? {
        // Remove and return the last element (top of the stack)
        return if (items.isNotEmpty()) {
            items.removeAt(items.size - 1)
        } else {
            null
        }
    }

    // Returns the value of the top element of the stack without removing it
    fun peek(): T? {
        return if (!isEmpty()) {
            items[items.size - 1]
        } else {
            null
        }
    }

    // Check if the stack is empty
    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    // Get the size of the stack
    fun size(): Int {
        return items.size
    }

    // Print the contents of the stack
    fun print() {
        println(items.joinToString())
    }
}
