
//kotlin classes are final by default,
// to make them inheritable you need to mark as open
open class FatherClass {
    var name: String? = "Alisson"

    init {
        println("Class father created")
    }
}

class ChildClass : FatherClass() {
    var age: Int? = 32
    fun presentation() {
        println("$name, $age")//I cannot print directly, I need to create a function
    }
}

fun main() {
    val father = FatherClass()
    println(father.name)

    val child = ChildClass()
    //before execute the function, this will call the father init block
    child.presentation()

}

