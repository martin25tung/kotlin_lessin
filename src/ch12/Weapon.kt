package ch12

class Weapon(val name: String)
class Player2 {
    var weapon: Weapon? = Weapon("Ebony Kris")

    fun printWeaponName() {
//        if (weapon != null) {
//            println(weapon.name)
//        }
        weapon?.also { println(it.name) }
    }
}