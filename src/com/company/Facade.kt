package com.company

fun main() {

    val shapeMaker = ShapeMaker()

    shapeMaker.drawCircleF()
    shapeMaker.drawRecF()
    shapeMaker.drawSquareF()

}


class ShapeMaker {
    private val recF: ShapeFacade = RecF()
    private val circleF: ShapeFacade = CircleF()
    private val squareF: ShapeFacade = SquareF()

    fun drawRecF() {
        recF.draw()
    }

    fun drawCircleF() {
        circleF.draw()
    }

    fun drawSquareF() {
        squareF.draw()
    }
}

interface ShapeFacade {
    fun draw()
}

class RecF : ShapeFacade {
    override fun draw() {
        println("this is Rec class")
    }
}

class CircleF : ShapeFacade {
    override fun draw() {
        println("this is Circle class")
    }
}

class SquareF : ShapeFacade {
    override fun draw() {
        println("this is Square class")
    }
}
