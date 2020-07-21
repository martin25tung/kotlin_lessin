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

    adversary.offerFood()
}

fun makeProclamation() = "Greetings, beast!"

@JvmOverloads
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef"){
    println("Mmmm... you hand over some delicious $leftHand and $rightHand")
}

class Spellbook {
    @JvmField
    val spells = listOf("Magic Ms. L", "Lay on Hans")

    companion object {
        val MAX_SPELL_COUNT = 10
    }
}