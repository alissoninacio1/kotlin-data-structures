class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}
val demo = Outer.Nested().foo() // == 2



class NestedClass {
    private val outerField = "Outer field"

    class Nested {
        fun nestedMethod() = "Nested method"
    }

    inner class Inner {
        fun innerMethod() = "Inner method accessing $outerField"
    }
}

fun main() {
    val nested = NestedClass.Nested()
    println(nested.nestedMethod())


    val outer = NestedClass()
    val inner = outer.Inner()
    println(inner.innerMethod())
}
