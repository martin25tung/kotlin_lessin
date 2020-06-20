package ch17

class Barrel<in T>(item: T)

fun main(args: Array<String>) {
    var fedoraBarrel: Barrel<Fedora> = Barrel(Fedora("a generic-looking fedora", 15))
    var lootBarrel: Barrel<Loot> = Barrel(Coin(15))

    fedoraBarrel = lootBarrel

    randomOrBackupLoot { Fedora("a backup fedora", 15) }.run { println(name) }
}

inline fun <reified T> randomOrBackupLoot(backupLoot: () -> T) : T {
    val items = listOf(Coin(14), Fedora("a fedora of the ages", 150))
    val randomLoot: Loot = items.shuffled().first()
    return if (randomLoot is T) {
        randomLoot
    } else {
        backupLoot()
    }
}