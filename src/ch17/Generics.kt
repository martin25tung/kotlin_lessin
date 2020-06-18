package ch17

class LootBox<T>(item: T){
    private var loot: T = item
}

class Fedora(val name: String, val value: Int)

class Coin(val value: Int)

fun main(args: Array<String>) {
    val lootBoxOne: LootBox<Fedora> = LootBox(Fedora("a greneric-looking fedora", 15))
    val lootBoxTwo: LootBox<Coin> = LootBox(Coin(15))
}