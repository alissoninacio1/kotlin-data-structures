fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Filter even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }

    // Filter odd numbers using filterNot
    val oddNumbers = numbers.filterNot { it % 2 == 0 }

    // Filter numbers at even indices
    val indexedFilter = numbers.filterIndexed { index, _ -> index % 2 == 0 }


    // In Kotlin, the _ is used as a "discard" parameter. The _ indicates that you don't care about the value and just want to use the index.
    // It's an elegant way to ignore the value while still accessing the index.

    // Filter non-null numbers
    val nullableNumbers = listOf(1, null, 2, null, 3)
    val nonNullNumbers = nullableNumbers.filterNotNull()

    // Partition numbers into even and odd
    val (evens, odds) = numbers.partition { it % 2 == 0 }

    // Filter elements of a specific type
    val mixedList = listOf(1, "two", 3.0, "four", 5)
    val stringElements = mixedList.filterIsInstance<String>()

    // Test predicates
    val anyGreaterThanFive = numbers.any { it > 5 }
    val noneGreaterThanSix = numbers.none { it > 6 }
    val allGreaterThanZero = numbers.all { it > 0 }

    println("Even numbers: $evenNumbers") // Output: Even numbers: [2, 4, 6]
    println("Odd numbers: $oddNumbers") // Output: Odd numbers: [1, 3, 5]
    println("Numbers at even indices: $indexedFilter") // Output: Numbers at even indices: [1, 3, 5]
    println("Non-null numbers: $nonNullNumbers") // Output: Non-null numbers: [1, 2, 3]
    println("Partitioned evens: $evens") // Output: Partitioned evens: [2, 4, 6]
    println("Partitioned odds: $odds") // Output: Partitioned odds: [1, 3, 5]
    println("String elements: $stringElements") // Output: String elements: [two, four]
    println("Any greater than 5: $anyGreaterThanFive") // Output: Any greater than 5: true
    println("None greater than 6: $noneGreaterThanSix") // Output: None greater than 6: true
    println("All greater than 0: $allGreaterThanZero") // Output: All greater than 0: true


    /**
     *
     * Breakdown:
     * Filter: Filters elements that match the predicate.
     * FilterNot: Filters elements that do not match the predicate.
     * FilterIndexed: Filters elements based on their index.
     * FilterNotNull: Filters out null elements.
     * Partition: Splits the list into two based on a predicate.
     * FilterIsInstance: Filters elements of a specific type.
     * Test Predicates: any, none, and all check conditions on the elements.
     * 
     */


}
