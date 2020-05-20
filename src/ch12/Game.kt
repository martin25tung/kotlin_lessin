package ch12



fun main(args: Array<String>) {

    val healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    val player = Player()
    player.castFireball()

    val myD6 = Dice()
    println(myD6.rolledValue)
    println(myD6.rolledValue)
    println(myD6.rolledValue)
    


    // Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    // Player status
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    printPlayerStatus(auraColor, isBlessed, player.name, healthStatus)
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) =
    if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) = when (healthPoints) {
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

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "YES" else "No"})")
    println("$name $healthStatus")
}