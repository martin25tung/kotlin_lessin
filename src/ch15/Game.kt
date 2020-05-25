package ch15

fun main(args: Array<String>) {
    val player = Player("Madrigal")
    player.castFireball()

    printPlayerStatus(player)
}

private fun printPlayerStatus(player: Player) {
    println("(Aura: ${player.auraColor()}) (Blessed: ${if (player.isBlessed) "YES" else "No"})")
    println("${player.name} ${player.formatHealthStatus()}")
}

object Game {

}