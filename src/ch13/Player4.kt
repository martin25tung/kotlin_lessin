package ch13

class Player4 (_name: String) {
    val playerName: String = initPlayerName()
    val name: String = _name
    private fun initPlayerName() = name
}

fun main(args: Array<String>) {
    println(Player4("Madrigal").playerName)
}