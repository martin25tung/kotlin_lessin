package ch15

class PlayerScore(val experience: Int, val level: Int) {
    operator fun component1() = experience
    operator fun component2() = level

    // val (experience, level) = PlayerScore(1250, 5)
    // val (x, y) = Coordinate(1, 0)
}