class NodeElement<T>(val value: T) {
    var next: NodeElement<T>? = null // Reference to the next node in the list
}

class LinkedList<T> {
    var head: NodeElement<T>? = null // Reference to the first node in the list
    var size = 0 // Variable to track the list size

    fun isEmpty(): Boolean {
        return size == 0 // Returns true if the list is empty, otherwise false
    }

    fun getSize(): Int {
        return size // Returns the current size of the list
    }

    // Inserts a new element at the specified position
    fun insert(value: T, index: Int) {
        if (index < 0 || index > size) {
            return
        }
        if (index == 0) {
            prepend(value)
        } else {
            val node = NodeElement(value)
            var prev = head
            for (i in 0 until index - 1) {
                prev = prev?.next
            }
            node.next = prev?.next
            prev?.next = node
            size++
        }
    }

    // Removes the element at the specified position
    fun removeFrom(index: Int): T? {
        if (index < 0 || index >= size) {
            return null
        }
        val removeNode: NodeElement<T>?
        if (index == 0) {
            removeNode = head
            head = head?.next
        } else {
            var prev = head
            for (i in 0 until index - 1) {
                prev = prev?.next
            }
            removeNode = prev?.next
            prev?.next = removeNode?.next
        }
        size--
        return removeNode?.value
    }

    // Removes the element with the specified value
    fun removeValue(value: T): T? {
        if (isEmpty()) {
            return null
        }
        if (head?.value == value) {
            head = head?.next
            size--
            return value
        } else {
            var prev = head
            var removedNode: NodeElement<T>?
            while (prev?.next != null && prev.next?.value != value) {
                prev = prev.next
            }
            if (prev?.next != null) {
                removedNode = prev.next
                prev.next = removedNode?.next
                size--
                return value
            }
            return null
        }
    }

    // Searches for the element with the specified value and returns its position
    fun search(value: T): Int {
        if (isEmpty()) {
            return -1
        }

        var i = 0
        var curr = head
        while (curr != null) {
            if (curr.value == value) {
                return i
            }
            curr = curr.next
            i++
        }
        return -1
    }

    // Reverses the linked list
    fun reverse() {
        var prev: NodeElement<T>? = null
        var curr = head
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        head = prev
    }

    // Prints the elements of the list
    fun printList() {
        if (isEmpty()) {
            println("List is empty")
        } else {
            var curr = head
            var listValues = ""
            while (curr != null) {
                listValues += "${curr.value} "
                curr = curr.next
            }
            println(listValues)
        }
    }

    // Adds a new element at the beginning of the list
    private fun prepend(value: T) {
        val node = NodeElement(value)
        if (isEmpty()) {
            head = node
        } else {
            node.next = head
            head = node
        }
        size++
    }
}

fun main() {
    val list = LinkedList<Int>()
    println(list.isEmpty()) // Checks if the list is empty
    println(list.getSize()) // Gets the current size of the list
    list.insert(10, 0) // Inserts 10 at index 0
    list.printList() // Prints the list
    list.insert(20, 0) // Inserts 20 at index 0
    list.insert(30, 0) // Inserts 30 at index 0
    list.insert(40, 0) // Inserts 40 at index 0
    list.printList() // Prints the list
    println(list.removeFrom(0)) // Removes the element at index 0
    list.printList() // Prints the list
    println(list.getSize()) // Gets the current size of the list
    println(list.removeValue(10)) // Removes the element with value 10
    list.printList() // Prints the list
    println(list.search(10)) // Searches for value 10 and prints its index
    list.reverse() // Reverses the list
    list.printList() // Prints the reversed list
}
