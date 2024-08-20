// Function that throws an exception if the divisor is zero
fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw ArithmeticException("Divider cannot be zero!")
    }
    return a / b
}

// Main function to test exception handling
fun main() {
    try {
        val result = divide(10, 0)
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Caught an exception: ${e.message}")
    } finally {
        println("This block always executes.")
    }
}
