/**
 * if/else is like java, and JS
 * there is no ternary operator
 *
 *
 *
 *
 *
 */


fun showControlFlow() {
    val a = 23 //type inferred
    val b: Int = 32 //type explicit

    /**
    if(a > b) {
        println("major")
    } else {
        println("minor")
    }
    */

    println(if(a > b) a else b) //with no braces, just with one line.

    //shorted
    val minor = (a < b)
    println(minor)
    println()


    // while loop
    var c = 20
    while( c < b) {
        println("value must be updated")
        c += 4
    }
    println("c is now $c")


    println()


    //do while loop
    do {
        println("c is decreasing")
        c--
    } while(c > b)

    println("now c is $c")
}