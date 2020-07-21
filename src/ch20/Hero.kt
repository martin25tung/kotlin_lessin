@file:JvmName("Hero")
package ch20

import java.io.IOException
import java.lang.Exception

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

    try {
        adversary.extendHandInFriendship()
    } catch (e: Exception){
        println("Begone, foul beast!")
    }

}

val translator = { utterance: String ->
    println(utterance.toLowerCase().capitalize())
}

fun makeProclamation() = "Greetings, beast!"

@JvmOverloads
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef"){
    println("Mmmm... you hand over some delicious $leftHand and $rightHand")
}

@Throws(IOException::class)
fun acceptApology(){
    throw IOException()
}

class Spellbook {
    @JvmField
    val spells = listOf("Magic Ms. L", "Lay on Hans")

    companion object {
        @JvmField
        val MAX_SPELL_COUNT = 10

        @JvmStatic
        fun getSpellbookGreeting() = println("I am the Great Grimoire!")
    }
}