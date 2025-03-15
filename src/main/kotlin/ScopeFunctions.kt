fun main() {
    //let
    val name = "Kotlin"
    val length = name.let {
        println("Name: $it")
        println(it.length + 1)
        it.length

    }
    println(length)



    //also
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("before add: $it")
    }.add(4)
    println(numbers)


    //with
    val builder = StringBuilder()
    val result = with(builder) {
        append("Hello, ")
        append("World!")
        println(this.length)
        toString()
    }
    println(result)


    //run
    val word = "Kotlin".run {
        println("String length: ${this.length}")
        this.uppercase()
    }
    println("Uppercase result: $word")



    //apply
    class Person {
        var personName: String = ""
        var age: Int = 0
    }
    val person = Person().apply {
        personName = "Alice"
        age = 30
    }
    println(person)




    //takeIf and takeUnless

    val numberUsed = 42

    // Using takeIf to return the object if the condition is met
    val resulting = numberUsed.takeIf { it > 30 } // Condition is met, so 'result' will be 42
    println(resulting)  // Output: 42

    // Using takeIf to return null if the condition is not met
    val filteredResult = numberUsed.takeIf { it < 30 } // Condition is not met, so 'filteredResult' will be null
    println(filteredResult)  // Output: null

    // Using takeUnless to return null if the condition is met
    val resultUnless = numberUsed.takeUnless { it > 30 } // Condition is met, so 'resultUnless' will be null
    println(resultUnless)  // Output: null

    // Using takeUnless to return the object if the condition is not met
    val filteredResultUnless = numberUsed.takeUnless { it < 30 } // Condition is not met, so 'filteredResultUnless' will be 42
    println(filteredResultUnless)  // Output: 42
    
}