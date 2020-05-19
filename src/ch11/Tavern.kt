package ch11

import java.io.File
import kotlin.math.roundToInt

const val TAVERN_NAME = "Taernyl's Folly"

var playerGold = 10
var playerSilver = 10
val patronList = mutableListOf("Eli", "Mordoc", "Sophie")

val planets = setOf("Merrcury", "Venus", "Earth", "Earth")

val lastName = listOf ("Ironfoot", "Fernsworth", "Baggins")

val menuList = File("data/tavern-menu-items.txt")
    .readText()
    .split("\n")

val uniquePatrons = mutableSetOf<String>()

val patronGold = mutableMapOf<String, Double>()

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

//    placeOrder("shandy,Dragon's Breath, 5.91")

    (0..9).forEach{
        val first = patronList.shuffled().first()
        val last = lastName.shuffled().first()
        val name = "$first $last"
        uniquePatrons += name
    }

    uniquePatrons.forEach{
        patronGold[it] = 6.0
    }

    var orderCount = 0
    while (orderCount <= 9) {
        placeOrder(uniquePatrons.shuffled().first(), menuList.shuffled().first())
        orderCount++
    }

    val patrons = listOf("Eli Baggins", "Eli Baggins", "Eli Ironfoot").distinct()
    println(patrons[0])

    println(patronGold)

    // = 賦值運算符
    val patronGold2 = mutableMapOf("Mordoc" to 6.0)
//    patronGold2["Mordoc"] = 5.0
//    println(patronGold2)

    // += 添加或更新鍵值對
//    patronGold2 += "Eli" to 5.0
//    println(patronGold2)

//    patronGold2 += mapOf("Eli" to 7.0, "Mordoc" to 1.0, "Jebediah" to 4.5)
//    println(patronGold2)

    // put
//    patronGold2.put("Mordoc", 5.0)
//    println(patronGold2)

    // putAll
//    patronGold2.putAll(listOf("Jebediah" to 5.0, "Sahara" to 6.0))
//    println(patronGold2["Jebediah"])
//    println(patronGold2["Sahara"])

    // getOrPut
//    patronGold2.getOrPut("Randy"){5.0}
//    println(patronGold2["Randy"])
//    patronGold2.getOrPut("Randy"){10.0}
//    println(patronGold2["Randy"])

    // remove
//    val mordocBalance = patronGold2.remove("Mordoc")
//    println(patronGold2)
//    println(mordocBalance)

    // - 刪除指定元素運算符
//    val newPatrons = mutableMapOf("Mordoc" to 6.0, "Jebediah" to 1.0) - "Mordoc"
//    println(newPatrons)

    // -= 刪除指定元素運算符
//    mutableMapOf("Mordoc" to 6.0, "Jebediah" to 1.0) -= "Mordoc"

    // clear
    mutableMapOf("Mordoc" to 6.0, "Jebediah" to 1.0).clear()
}

fun performPurchase(price: Double) {
    displayBalance()
    val totalPurse = playerGold + (playerSilver / 100.0)
    println("Total purse: $totalPurse")
    println("Purchasing item for $price")

    val remainingBalance = totalPurse - price
    println("Remaining balance: ${"%.2f".format(remainingBalance)}")

    val remainingGold = remainingBalance.toInt()
    val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
    playerGold = remainingGold
    playerSilver = remainingSilver
    displayBalance()

    println(5 - (12 * 0.125))
}

private fun displayBalance(){
    println("Player's purse balance: Gold: ${playerGold} , Silver: ${playerSilver}")
}

private fun placeOrder(patronName:String, menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("$patronName speaks with $tavernMaster about their order.")

    val (type, name, price) = menuData.split(',')
    val message = "$patronName buys a $name ($type) for $price"
    println(message)


//    performPurchase(price.toDouble())

    val phrase = if (name == "Dragon's Breath") {
        "$patronName exclaims ${toDragonSpeak("Ah, delicious $name")}"
    } else {
        "$patronName says: Thanks for the $name"
    }
    println(phrase)

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