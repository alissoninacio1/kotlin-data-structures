// Custom exception class
class CustomException(message: String) : Exception(message)

fun riskyOperation(value: Int) {
    when {
        value < 0 -> throw IllegalArgumentException("Negative values are not allowed")
        value == 0 -> throw CustomException("Value cannot be zero")
        else -> println("Processing value: $value")
    }
}

fun main() {
    val values = listOf(-1, 0, 5)

    values.forEach {
        try {
            riskyOperation(it)
        } catch (e: IllegalArgumentException) {
            println("Caught IllegalArgumentException: ${e.message}")
        } catch (e: CustomException) {
            println("Caught CustomException: ${e.message}")
        } catch (e: Exception) {
            println("Caught Exception: ${e.message}")
        } finally {
            println("Finally block executed")
        }
    }
}
