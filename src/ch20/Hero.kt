@file:JvmName("Hero")
package ch20

fun main(args: Array<String>) {
    val adversary = Jhava()
    println(adversary.utterGreeting())

    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.toLowerCase() ?: "It's complicated.")

    val adversaryHitPints: Int = adversary.hitPoints
    println(adversaryHitPints.dec())
    println(adversaryHitPints.javaClass)

    adversary.greeting = "Hello, Hero."
    println(adversary.utterGreeting())
}

fun makeProclamation() = "Greetings, beast!"