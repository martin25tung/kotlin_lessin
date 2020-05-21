package ch13


fun main(args: Array<String>) {

    val player = Player(
        "Madrigal", healthPoints = 100,
        isImmortal = true, isBlessed = false
    )
    player.castFireball()

    // Aura
    val auraColor = player.auraColor()

    // Player status
    printPlayerStatus(player)

    player.auraColor()

    val player2 = Player("", 0, true, false)
}


private fun printPlayerStatus(player: Player) {
    println("(Aura: ${player.auraColor()}) (Blessed: ${if (player.isBlessed) "YES" else "No"})")
    println("${player.name} ${player.formatHealthStatus()}")
}