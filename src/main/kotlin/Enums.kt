enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun main() {
    val direction = Direction.NORTH
    println(direction)  // Output: NORTH

    // Enum class with When clauses
    when (direction) {
        Direction.NORTH -> println("Going north")
        Direction.SOUTH -> println("Going south")
        Direction.EAST -> println("Going east")
        Direction.WEST -> println("Going west")
    }
}
