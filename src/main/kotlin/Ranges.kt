/**
 *
 * Ranges are created with '..' operator
 * For example, 1..4 is equivalent to 1, 2, 3, 4.
 *
 * -To declare a range that doesn't include the end value, use the ‘..<’ operator.
 * For example, 1..<4 is equivalent to 1, 2, 3.
 *
 * -To declare a range in reverse order, use downTo.
 * For example, 4 downTo 1 is equivalent to 4, 3, 2, 1.
 *
 *
 *
 *  To declare a range that increments in a step that isn't 1, use step and your desired increment value.
 *  For example, 1..5 step 2 is equivalent to 1, 3, 5
 *
 *  'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'
 *
 *
 * until - represents a range [number, until(to this value but not included this one)]
 *
 **/



fun showRanges() {
    val rangeRegular = 1..10
    val rangeByTwo = 1 .. 10 step 2
    val excludeRange = 1..< 10
    val downRange = 10 downTo 1
    val downWithStep = 10 downTo 1 step 2

    for( i in rangeRegular) {
        println(i)
    }

    for( i in rangeByTwo) {
        println(i)
    }

    for( i in excludeRange) {
        println(i)
    }

    for( i in downRange) {
        println(i)
    }

    for( i in downWithStep) {
        println(i)
    }

    /**
    for(i in 1..10) {
        println(i)
    }
    */

    val range = 5 until 15 //range[0,15]   5, 6, 7, 8, 9, 10, 11, 12, 13, 14
    for(i in range) {
        println(i)
    }
}