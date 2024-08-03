/**
 * val randomData: Int = (1..7).shuffled().first()
 * shuffled for large lists -  it’s big O(n), but for a small list it’s alright
 */

import kotlin.random.Random


fun main() {
    d4()
    d6()
    d12()
    d20()
}

fun d4() {
    var ran: Int = Random.nextInt(1, 5)
    println(ran)
}

fun d6() {
    var ran: Int = Random.nextInt(1, 7)
    println(ran)
}


fun d12() {
    var ran: Int = Random.nextInt(1, 13)
    println(ran)
}


fun d20() {
    var ran: Int = Random.nextInt(1, 21)
    println(ran)
}