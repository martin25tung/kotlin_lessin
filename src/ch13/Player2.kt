package ch13

// 1. 主構造函數
class Player2(_name: String, val health: Int ) {
    // 2. 類別屬性給值
    val race = "DWARF"
    var town = "Bavaria"
    val name = _name
    lateinit var alignment: String
    private var age = 0

    // 3. init初始化模塊的屬性給值和函數調用
    init {
        println("initializing player")
    }

    // 4. 次構造函數的屬性給值和函數調用
    constructor(_name: String) : this(_name, 100) {
        town = "This Shire"
        println("constructor start")
    }

    fun determineFate() {
        alignment = "Good"
    }

    fun proclaimFate() {
        if (::alignment.isInitialized) println(alignment)
    }

}

fun main(args: Array<String>) {
    Player2("Madrigl")
}