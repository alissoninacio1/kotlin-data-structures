//you can use lambda expression like:
// { x ->  x * 2 }
//or you can use
// { it * 2 }

// Kotlin uses the 'it' keyword as an implicit name for single-parameter lambda expressions or
// anonymous functions

fun showNumbers() {


    //filter
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    println(positives)
    println(negatives)


    //map
    val list = listOf(1, -2, 3, -4, 5)
    val doubled = list.map { x -> x * 2 }
    val tripled = list.map { it * 3 }

    println(doubled)
    println(tripled)


    //reduce - accumulate function
    //acc is initially 0
    val series = listOf(1, 2,3, 4, 5)
    val sum = series.reduce {acc, i -> acc + i }
    println(sum)


    //forEach
    println("testing for each")
    series.forEach { println(it) }
    numbers.forEach { println(it) }




    // :: operator used to create functions references
    fun referredFunction(){
        println("Reference function")
    }

    fun reference() {
        val refer = ::referredFunction
        refer()
        //this in JS would be a function assigned to a variable
        //but this is the Kotlin way to do that.
    }

    reference()

}


/**
 *
 JS code
function referredFunction() {
console.log("Reference function");
}

function reference() {
const refer = referredFunction;  // Atribui a função referredFunction a variável refer
refer();  // Chama a função referenciada
}

reference();

Em ambos os casos, a função é atribuída a uma variável, e essa variável pode ser usada para
invocar a função. A diferença está na sintaxe específica de cada linguagem para realizar essa atribuição.
Em Kotlin, você usa o operador :: para obter uma referência à função,
enquanto em JavaScript você simplesmente atribui a função diretamente à variável.








 * */
