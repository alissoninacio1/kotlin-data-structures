/**
 *  The When case is similar to switch case.
 *  Use '->' in each branch to separate each condition from each action.
 *
 * else - is the default, but no required when all cases are covered before the else statement
 */


fun whenCase() {
    val option = "Alisson"

    when(option){
        "one" -> println("Error")
        "Alisson" -> println("Correct!")
        else -> println("Unknown")
    }


    //in boolean expression

    val temperature: Int = 15
    val description = when {
        temperature < 15 -> println("so cold!")
        temperature > 15 -> println("warm")
        temperature == 15 -> println("cool")
        else -> println("Are you sure?")
    }


    //ranges
    val x = 1
    when(x) {
        in 1..10 -> println("x is in the range")
        else -> println("not 1")
    }

}