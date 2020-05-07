package ch05

fun main(args: Array<String>) {

    val greetingFunction: () -> String = {
        val currentYear = 2018
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }

    println(greetingFunction())
}