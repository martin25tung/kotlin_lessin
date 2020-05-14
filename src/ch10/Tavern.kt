package ch10

import kotlin.math.roundToInt

const val TAVERN_NAME = "Taernyl's Folly"

var playerGold = 10
var playerSilver = 10
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")
val readOnlyPatronList = patronList.toList()

fun main(args: Array<String>) {

    if (patronList.contains("Eli")) {
        println("The tavern master says: Eli's in the back playing cards.")
    } else {
        println("The tavern master says: Eli isn't here.")
    }

    if (patronList.containsAll(listOf("Sophie", "Mordoc"))){
        println("The tavern master says: Yea, they're seated by the stew kettle.")
    } else {
        println("The tavern master says: Nay, they departed hours ago.")
    }

    placeOrder("shandy,Dragon's Breath, 5.91")

    println(patronList)
    patronList.remove("Eli")
    patronList.add("Alex")
    patronList.add(0, "Alex")
    println(patronList)
}

fun performPurchase(price: Double) {
    displayBalance()
    val totalPurse = ch08.playerGold + (ch08.playerSilver / 100.0)
    println("Total purse: $totalPurse")
    println("Purchasing item for $price")

    val remainingBalance = totalPurse - price
    println("Remaining balance: ${"%.2f".format(remainingBalance)}")

    val remainingGold = remainingBalance.toInt()
    val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
    ch08.playerGold = remainingGold
    ch08.playerSilver = remainingSilver
    displayBalance()

    println(5 - (12 * 0.125))
}

private fun displayBalance(){
    println("Player's purse balance: Gold: ${ch08.playerGold} , Silver: ${ch08.playerSilver}")
}

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = ch07.TAVERN_NAME.indexOf('\'')
    val tavernMaster = ch07.TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")

    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price"
    println(message)

    if (ch08.playerGold + (ch08.playerSilver / 100.0) > price.toDouble()) {
        performPurchase(price.toDouble())

        val phrase = if (name == "Dragon's Breath") {
            "Madrigal exclaims ${toDragonSpeak("Ah, delicious $name")}"
        } else {
            "Madrigal says: Thanks for the $name"
        }
        println(phrase)
    } else {
        println("餘額不足")
    }
}

private fun toDragonSpeak(phrase: String) = phrase.replace(Regex("[aeiouAEIOU]")) {
    when (it.value) {
        "a","A" -> "4"
        "e", "E" -> "3"
        "i", "I" -> "1"
        "o", "O" -> "0"
        "u", "U" -> "|_|"
        else -> it.value
    }
}