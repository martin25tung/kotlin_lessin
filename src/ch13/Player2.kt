package ch13

// 1. 主構造函數
class Player2(_name: String, val health: Int ) {
    // 2. 類別屬性給值
    val race = "DWARF"
    var town = "Bavaria"
    val name = _name
    val alignment: String
    private var age = 0

    // 3. init初始化模塊的屬性給值和函數調用
    init {
        println("initializing player")
        alignment = "GOOD"
    }

    // 4. 次構造函數的屬性給值和函數調用
    constructor(_name: String) : this(_name, 100) {
        town = "This Shire"
        println("constructor start")
    }
}

fun main(args: Array<String>) {
    Player2("Madrigl")
}