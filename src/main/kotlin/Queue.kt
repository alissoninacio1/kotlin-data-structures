/**
 * QUEUE is an ABSTRACT data type. it is defined by its behavior
 * rather than being a mathematical model (implementation)



fun main() {
    val queueList = mutableListOf<Int>()
    // Enqueue operation
    queueList.add(10)
    queueList.add(20)
    queueList.add(30)


    // Dequeue operation
    val dequeuedElement = queueList.removeAt(0)
    println("Dequeued element: $dequeuedElement")


    // Peek operation
    val peekedElement = queueList.firstOrNull()
    println("Peeked element: $peekedElement")


    // Print queue
    println("Queue: $queueList")
}

 */

class Queue<T> {
    // Initialize an empty list to store items
    private val items = mutableListOf<T>()


    // Add element to the queue (it will be the last element)
    fun enqueue(element: T) {
        items.add(element)
    }
    // Remove the oldest element from the queue (first element)
    // An implementation using object instead of array will allow dequeue and queue have constant time complexity
    fun dequeue(): T? {
        // This built-in shift method has a linear complexity that's not favorable
        return if (items.isNotEmpty()) {
            items.removeAt(0)
        } else {
            null
        }
    }
    // Returns the value of the top ("front") of the collection without removing the element from the collection.
    // It reads the value only
    fun peek(): T? {
        return if (!isEmpty()) {
            items[0]
        } else {
            null
        }
    }
    // Check if the queue is empty
    fun isEmpty(): Boolean {
        return items.isEmpty()
    }
    //Get the size of the queue
    fun size(): Int {
        return items.size
    }
    // Print the contents of the queue
    fun print() {
        println(items.joinToString())
    }
}


fun main() {
    val queue = Queue<Int>()
    println(queue.isEmpty())
    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)
    println(queue.size())
    queue.print()
    println(queue.dequeue())
}
