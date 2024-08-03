fun typeCheckExamples(obj: Any) {
    // Using `is`
    if (obj is String) {
        println("Using 'is': The object is a String with length ${obj.length}")
    }

    // Using `as` to realize a not safe cast
    try {
        val str = obj as String
        println("Using 'as': Successfully cast to String, length is ${str.length}")
    } catch (e: ClassCastException) {
        println("Using 'as': ClassCastException occurred because the object is not a String")
    }

    // Using `as?` to do a safe cast
    val safeStr: String? = obj as? String
    if (safeStr != null) {
        println("Using 'as?': The object was safely cast to String, length is ${safeStr.length}")
    } else {
        println("Using 'as?': The object is not a String, so it returned null")
    }
}

fun main() {
    typeCheckExamples("Hello, Kotlin!")  // É uma String
    typeCheckExamples(42)                // Não é uma String
}
