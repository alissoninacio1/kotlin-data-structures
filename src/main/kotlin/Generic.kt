class Generic<T> (var value: T)

fun main() {
    val word = Generic("Word")
    val number = Generic(123)

    println(word.value)
    println(number.value)
}