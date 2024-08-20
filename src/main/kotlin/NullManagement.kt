fun main() {
    // Example of null safety and the Elvis operator
    val userName: String? = null // Nullable variable, can be null

    // Using the Elvis operator to provide a default value if `userName` is null
    val displayName = userName ?: "Guest"

    println("Display Name: $displayName")  // Output: Display Name: Guest

    // Example of a non-null value
    val nonNullUserName: String? = "Alice"

    // Elvis operator with a non-null value
    val nonNullDisplayName = nonNullUserName ?: "Guest"

    println("Display Name: $nonNullDisplayName")  // Output: Display Name: Alice
}


/*
* Null Safety: userName is a nullable variable (String?), meaning it can hold null values.
* Elvis Operator (?:): Used to provide a default value ("Guest") if userName is null.
* Non-Null Example: When nonNullUserName is not null, the Elvis operator returns its value directly.
* */