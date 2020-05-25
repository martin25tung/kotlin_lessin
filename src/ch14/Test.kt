package ch14

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    var room = Room("Foyer")
    println(room is TownSquare)

    var townSquare = TownSquare()
    var className = when(townSquare) {
        is Room -> "Room"
        is TownSquare -> "TownSquare"
        else -> throw IllegalArgumentException()
    }
    println(className)


}