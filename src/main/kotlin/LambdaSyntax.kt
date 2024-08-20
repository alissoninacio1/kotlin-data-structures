// explicit declaration, where you define the function type as (String) -> String
// and the parameter type 'str'
val upperCase1: (String) -> String = {str: String -> str.uppercase()}


// Similar to the first example, but the omitting the 'str' type
// because Kotlin can infer the parameter type
val upperCase2: (String) -> String = {str -> str.uppercase()}

// the function type is omitted letting to Kotlin infer it
// explicit type for 'str' variable
val upperCase3 = { str: String -> str.uppercase() }

// the simplest form, omitting all types
// but the compiler shows that Kotlin cannot infer the type for this parameter
// without a clear context(type) the compiler doesn't know which type should be
/** val upperCase4 = { str -> str.uppercase() } */

// Uses the keyword 'it' to refer to the unique parameter,
// defined as being a String (defined in the function type)
// inside the lambda expression: it takes the argument and applies what it needs to do with the var
val upperCase5: (String) -> String = { it.uppercase() }

// this approach uses the reference member function
// '::' is used for a function class reference (you need to omit the parentheses)
// String is a type and a Class, then it's called the uppercase() method from the String class
// explicit function type declaration
val upperCase6: (String) -> String = String::uppercase



/**
 * For lambdas with a single parameter, you don't have to name it explicitly.
 * Instead, you can use the implicit `it` variable.
 * This is especially useful when the type of it can be inferred (which is often the case).
 *
 *  STRONG TIP: ALWAYS USE THE FUNC TYPE IN THE LAMBDA EXPRESSION
 *  OR AT LEAST, THE VAR TYPE WHEN YOU OMIT THE FUNC TYPE
 **/


// auto-invocation
// Lambda expressions can be invoked on their own by adding parentheses () after the curly braces {}
fun main() {
    println({ string: String -> string.uppercase() }("hello"))
    println(upperCase6("this is my string"))
}


//--------------ANONYMOUS FUNCTION ----
/**
 * They are functions with NO NAME
 * Declared with the FUN KEYWORD.
 * It requires an explicit RETURN statement to return a value.
 * It requires explicit TYPE declarations for parameters and return types.
 * */

val anonymousSum = fun(x: Int, y: Int): Int {
    return x + y
}

// ------------lambda vs anonymous -------------

//lambda Expression
val lambdaPrint: (String) -> Unit = { println(it) }

//anonymous function
val anonymousPrint = fun(message: String): Unit {
    println(message)
}

