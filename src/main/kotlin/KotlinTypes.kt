/**
 * Integers: Byte, Int, Short, Long  (8, 16, 32, 64) (bits)
 * Floating-point numbers: Float, Double (32, 64)
 * Booleans: Boolean (1)
 * Character: Char (16)
 * Strings: String
 * */

fun printingValues() {
    val byteValue: Byte = 127
    val shortValue: Short = 32767
    val intValue: Int = 1_000_000
    val longValue: Long = 9_000_000_000L

    val floatValue: Float = 3.14f
    val doubleValue: Double = 3.14159265358

    val charValue: Char = 'A'//in single quotes
    val stringValue: String = "Alisson"


    println("" +
            "${byteValue::class}" +
            "${shortValue::class}"
    )

}