package ch14

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    var room = Room("Foyer")
    println(room is TownSquare)

    var townSquare = TownSquare()
    var className = when(townSquare) {
        is TownSquare -> "TownSquare"
        is Room -> "Room"
        else -> throw IllegalArgumentException()
    }
    println(className)


}