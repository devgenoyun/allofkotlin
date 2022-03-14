package chapter_4

enum class Direction {
    LEFT, RIGHT
}

interface Projectile {
    val x:Int
    val y:Int
    val direction:Direction
    val damage:Double
}

interface Weapon {
    fun shoot(x:Int, y:Int, direction:Direction)
}

class OurHero {
    private val currentWeapon:Weapon = object:Weapon {
        override fun shoot(x: Int, y: Int, direction: Direction) {
            TODO("Not yet implemented")
        }
    }
    fun attack() {

    }
}

fun main() {

}