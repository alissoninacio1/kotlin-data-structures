class Node<T>(val value: T) {
    var next: Node<T>? = null // Reference to the next node in the list
}

fun main() {
    var head: Node<Int>? = null // Reference to the first node in the list
    var size = 0 // Variable to keep track of the list size

    fun isEmpty(): Boolean {
        return size == 0 // Returns true if the list is empty, otherwise false
    }

    fun getSize(): Int {
        return size // Returns the current size of the list
    }

    fun prepend(value: Int) {
        val newNode = Node(value) // Creates a new node with the given value
        if (isEmpty()) {
            head = newNode // If the list is empty, the new node becomes the first node
        } else {
            newNode.next = head // Connects the new node to the current first node
            head = newNode // The new node becomes the new first node
        }
        size++ // Increments the size of the list
    }

    fun append(value: Int) {
        val newNode = Node(value) // Creates a new node with the given value
        if (isEmpty()) {
            head = newNode // If the list is empty, the new node becomes the first node
        } else {
            var prev = head
            while (prev?.next != null) {
                prev = prev.next // Finds the last node in the list
            }
            prev?.next = newNode // Connects the new node to the last node
        }
        size++ // Increments the size of the list
    }

    fun printList() {
        if (isEmpty()) {
            println("List is empty") // If the list is empty, prints a message indicating that
        } else {
            var curr = head // Initializes a pointer to the first node
            var listValues = "" // String to store the node values
            while (curr != null) {
                listValues += "${curr.value} " // Adds the current node's value to the string
                curr = curr.next // Moves to the next node in the list
            }
            println(listValues) // Prints the node values in the list
        }
    }

    println(isEmpty()) // Checks if the list is empty
    println(getSize()) // Gets the current size of the list
    printList() // Prints the list
    prepend(10) // Adds a node with value 10 at the beginning of the list
    printList() // Prints the list
    append(20) // Adds a node with value 20 at the end of the list
    append(30) // Adds a node with value 30 at the end of the list
    printList() // Prints the list
}
