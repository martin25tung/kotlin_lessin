package ch13

class Player(_name: String, _healthPoints: Int, _isBlessed: Boolean, _isImmortal: Boolean) {
    var name = _name
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    val healthPoints = _healthPoints
    val isBlessed = _isBlessed
    private val isImmortal = _isImmortal

    fun castFireball(numFireball: Int = 2) =
        println("A glass of Fireball springs into existence.(x$numFireball)")

    fun auraColor() =
        if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

    fun formatHealthStatus() = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
}