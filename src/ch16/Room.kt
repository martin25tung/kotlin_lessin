package ch16

open class Room(val name: String) {
    protected open val dangerLevel = 5
    var monster: Monster? = Goblin()
    protected open val bellSound = "DING"
    fun description() = "Room: $name\nDanger level: $dangerLevel\n" +
            "Creature: ${monster?.description ?: "none."}"
    open fun load() = "Nothing much to see here..."
    open fun ringBell() = "$bellSound from $name"
}

open class TownSquare : Room("Town Square") {
    override val dangerLevel = super.dangerLevel - 3
    override var bellSound = "GWONG"

    final override fun load() = "The villagers rally and cheer as you enter!"

    override fun ringBell() = "The bell tower announces your arrival. $bellSound"
}