/**
 *
 * use the formula below:
 * val sourceValue: SourceType = // Define the origin value
 * val targetValue: TargetType = sourceValue.toTargetTypeMethod()
 *
 * */

fun conversion() {
    val doubleValue: Double = 42.56
    val intValue: Int = doubleValue.toInt()
    println(intValue)

    val piValue: Double = 3.1415866532
    val downToFloat: Float = piValue.toFloat()

    println(downToFloat)
}


