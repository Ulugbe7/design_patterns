package com.company

fun main() {

    val redCircle: Shape = Circle(10, 3, 4, RedCircle())
    val blueCircle: Shape = Circle(10, 3, 4, BlueCircle())

    blueCircle.draw()
    redCircle.draw()
}

interface Draw {
    fun drawCircle(r: Int, x: Int, y: Int)
}


class RedCircle : Draw {
    override fun drawCircle(r: Int, x: Int, y: Int) {
        println("this is red circle r=$r, x=$x, y=$y")
    }
}

class BlueCircle : Draw {
    override fun drawCircle(r: Int, x: Int, y: Int) {
        println("this is blue circle r=$r, x=$x, y=$y")
    }
}

abstract class Shape(private val draw: Draw) {
    abstract fun draw()
}

class Circle(private val r: Int, private val x: Int, private val y: Int, private val draw: Draw) : Shape(draw) {
    override fun draw() {
        draw.drawCircle(r, x, y)
    }
}
