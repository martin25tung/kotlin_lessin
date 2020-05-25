package ch14

fun main(args: Array<String>) {
    var room = Room("Foyer")
    println(room is TownSquare)

    var townSquare = TownSquare()
    println(townSquare is Room)
}