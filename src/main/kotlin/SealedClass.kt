sealed class SealedClass (val name:String)


//Sealed classes let you restrict the use of inheritance.
// Once you declare a class sealed, it can only be subclassed
// from inside the same package where the sealed class is declared.
// It cannot be subclassed outside of the package where the sealed class is declared.