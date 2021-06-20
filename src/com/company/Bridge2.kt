package com.company

fun main() {
    val blueCircle = Circle2(10, 3, 4, BlueCircle2())
    val redCircle = Circle2(20, 7, 4, RedCircle2())
    blueCircle.drawCircle()
    redCircle.drawCircle()
}

interface Draw2 {
    fun draw(r: Int, x: Int, y: Int)
}

class BlueCircle2 : Draw2 {
    override fun draw(r: Int, x: Int, y: Int) {
        println("this is blue [r=$r, x=$x, y=$y]")
    }
}

class RedCircle2 : Draw2 {
    override fun draw(r: Int, x: Int, y: Int) {
        println("this is red [r=$r, x=$x, y=$y]")
    }
}

abstract class Shape2(private val draw2: Draw2) {
    abstract fun drawCircle()
}

class Circle2(private val r: Int, private val x: Int, private val y: Int, private val draw2: Draw2) : Shape2(draw2) {
    override fun drawCircle() {
        draw2.draw(r, x, y)
    }
}
