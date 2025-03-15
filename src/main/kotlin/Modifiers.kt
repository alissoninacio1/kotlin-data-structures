class Access {
    private val name:String = "Jhon"
    protected val age: Int = 25
    internal val status: Boolean = true
    public val hired: Boolean = true //the word 'public' don't need to be specified
}

/**
 * private: the member is visible inside this class only (including all its members).
 * protected: the member has the same visibility as one marked as private, but that it is also visible in subclasses.
 * internal:  it means that any client inside this module who sees the declaring class sees its internal members.
 * public: it means that any client who sees the declaring class sees its public members (the word 'public' is not mandatory)
 * *
 *
 * In Kotlin, visibility modifiers can be applied not only to attributes,
 * but also to classes, functions (methods), constructors, and even entire packages.
 *
 * */


