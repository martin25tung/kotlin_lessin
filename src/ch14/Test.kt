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

fun printIsSourceOfBlessings(any: Any) {
    val isSourceOfBlessings = if(any is Player) {
        any.isBlessed
    } else {
        (any as Room).name == "Fount of Blessings"
    }

    println("$any is a source of blessings: $isSourceOfBlessings")
}