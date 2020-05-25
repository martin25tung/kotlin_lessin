package ch13

class Play3() {
    init {
        val healthBonus = health.times(3)
    }
    val health = 100
}

fun main(args: Array<String>) {
    Play3()
}