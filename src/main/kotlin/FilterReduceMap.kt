fun main() {
    // Define a list of numbers
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Use map to square each number
    val squaredNumbers = numbers.map { it * it }

    // Use filter to keep only the even numbers
    val evenNumbers = squaredNumbers.filter { it % 2 == 0 }

    // Use reduce to sum all the remaining numbers
    val sumOfEvenSquares = evenNumbers.reduce { sum, number -> sum + number }

    // Print the results
    println("Original numbers: $numbers")
    println("Squared numbers: $squaredNumbers")
    println("Even squares: $evenNumbers")
    println("Sum of even squares: $sumOfEvenSquares")
}
