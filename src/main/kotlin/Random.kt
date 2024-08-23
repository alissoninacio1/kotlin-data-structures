import kotlin.random.Random

fun main() {
    // 1. Generating Random Numbers
    val randomInt = Random.nextInt()            // Random integer
    val randomIntInRange = Random.nextInt(1, 10) // Random integer between 1 and 9
    val randomDouble = Random.nextDouble()      // Random double between 0.0 and 1.0
    val randomBoolean = Random.nextBoolean()    // Random boolean (true or false)

    println("Random integer: $randomInt")
    println("Random integer in range: $randomIntInRange")
    println("Random double: $randomDouble")
    println("Random boolean: $randomBoolean")

    // 2. Shuffling a List - shuffle: pt-BR (embaralhar)
    val numbers = listOf(1, 2, 3, 4, 5)
    val shuffledNumbers = numbers.shuffled() // Shuffles the list randomly
    println("Shuffled list: $shuffledNumbers")

    // 3. Generating a Random Element from a List
    val names = listOf("Alice", "Bob", "Charlie")
    val randomName = names.random() // Selects a random name from the list
    println("Random name: $randomName")

    // 4. Generating a Random String
    val length = 10
    val charset = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    val randomString = List(length) { charset.random() }.joinToString("")
    println("Random string: $randomString")

    // 5. Random Seed
    val seed = 12345L
    val randomWithSeed1 = Random(seed).nextInt()
    val randomWithSeed2 = Random(seed).nextInt()
    println("Random number with seed 1: $randomWithSeed1")
    println("Random number with seed 2: $randomWithSeed2") // Same as the first one
}
