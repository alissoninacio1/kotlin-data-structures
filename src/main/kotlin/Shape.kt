//overloading and overriding
open class Shaping {
    val sizeOfShape: Double = 0.05

    open fun draw() {
        println("Drawing a shape")
    }

    open fun draw(sizeOfShape: Double) {
        print("The size is $sizeOfShape")
    }
}

class Circle : Shaping() {
   override fun draw() {
       super.draw()
       println("printing size from Class parent Value: ${super.sizeOfShape}")
       println("Drawing a circle")
   }

    override fun draw(sizeOfShape: Double) {
        super.draw(sizeOfShape)
        println("\nthe circle was made")
    }

}

fun main() {
    val c = Circle()
    c.draw()

    c.draw(0.08)
}