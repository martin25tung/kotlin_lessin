package ch09

import java.io.File

fun main(args: Array<String>) {
//    val menuFile = File("menu-file.txt")
//    menuFile.setReadable(true)
//    menuFile.setWritable(true)
//    menuFile.setExecutable(false)

//    val menuFile = File("menu-file.txt").apply {
//        setReadable(true)   // implicitly, menuFile.setReadable(true)
//        setWritable(true)
//        setExecutable(false)
//    }

//    val firstItemSquared = listOf(1, 2, 3).first().let { it * it }
//    println(firstItemSquared)

//    val firstElement = listOf(1, 2, 3).first()
//    val firstItemSquared = firstElement * firstElement
//    println(firstItemSquared)
//
//    println(formatGreeting(null))

//    "Madrigal".run(::nameIsLong)    // false
//    "Polarcubis, Supreme Master of NyetHack"
//        .run(::nameIsLong)
//        .run(::playerCreateMessage)
//        .run(::println)
//
//    println(playerCreateMessage(nameIsLong("Polarcubis, Supreme Master of NyetHack")))
//
//    val status = run {
//        if (healthPoints == 100) "perfect health" else "has injuries"
//    }

    val nameTooLong = with("Polarcubis, Supreme Master of NyetHack") {
        length >= 20
    }
}

fun nameIsLong(name: String) = name.length >= 20

fun playerCreateMessage(nameTooLong: Boolean): String {
    return if (nameTooLong) {
        "Name is too long. Please choose another name."
    } else {
        "Welcome, adventurer"
    }
}


fun formatGreeting(vipGuest: String?): String{
    return vipGuest?.let {
        "Welcome, $it. Please, go straight back - your table is ready."
    } ?: "Welcome to the tavern. Your'll be seated soon."
}

//fun formatGreeting(vipGuest: String?): String{
//    return if ($vipGuest != null){
//        "Welcome, $$vipGuest. Please, go straight back - your table is ready."
//    } else {
//        "Welcome to the tavern. Your'll be seated soon."
//    }
//}