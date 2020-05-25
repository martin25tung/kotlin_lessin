package ch13

class Play3() {
    val health = 100
    val name: String
    private fun firstLatter() = name[0]
    init {
        val healthBonus = health.times(3)
        println(firstLatter())
        name = "Madrigal"
    }
}

fun main(args: Array<String>) {
    Play3()
}