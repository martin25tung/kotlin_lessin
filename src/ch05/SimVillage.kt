package ch05

fun main(args: Array<String>) {

    val greetingFunction: (String) -> String = {
        val currentYear = 2018
        "Welcome to SimVillage, $it! (copyright $currentYear)"
    }

    println(greetingFunction("Guyal"))
}