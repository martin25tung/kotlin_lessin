package ch09

import java.io.File

fun main(args: Array<String>) {
//    val menuFile = File("menu-file.txt")
//    menuFile.setReadable(true)
//    menuFile.setWritable(true)
//    menuFile.setExecutable(false)

    val menuFile = File("menu-file.txt").apply {
        setReadable(true)   // implicitly, menuFile.setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
}