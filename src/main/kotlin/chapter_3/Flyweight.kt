package chapter_3

import java.io.File

enum class Direction {
    LEFT, RIGHT
}

object SnailSprites {
    val sprites = List(8) {
        File(when (it) {
            0 -> "snail-left.jpg"
            1 -> "snail-right.jpg"
            in 2..4 -> "snail-move-left-${it - 1}.jpg"
            else -> "snail-move-right-${4 - it}.jpg"
        })
    }
}

class TanzanianSnail {
    val directionFacing = Direction.LEFT
    val sprites = SnailSprites.sprites

    fun getCurrentSprite():File {
        return when (directionFacing) {
            Direction.LEFT -> sprites[0]
            Direction.RIGHT -> sprites[1]
        }
    }
}

fun main() {

}