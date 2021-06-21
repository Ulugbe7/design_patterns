package com.company


fun main() {
    val subject = Subject()

    HexaObserver(subject)
    OctalObserver(subject)
    BinaryObserver(subject)

    println("First state change: 15")
    subject.state = 15
    println("Second state change: 10")
    subject.state = 10
}

class Subject {
    private val observers: MutableList<Observer> = ArrayList()
    var state = 0
        set(state) {
            field = state
            notifyAllObservers()
        }

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    private fun notifyAllObservers() {
        for (observer in observers) {
            observer.update()
        }
    }
}

abstract class Observer {
    protected var subject: Subject? = null
    abstract fun update()
}

class BinaryObserver(subject: Subject?) : Observer() {
    override fun update() {
        println("Binary String: " + Integer.toBinaryString(subject!!.state))
    }

    init {
        this.subject = subject
        this.subject!!.attach(this)
    }
}

class OctalObserver(subject: Subject?) : Observer() {
    override fun update() {
        println("Octal String: " + Integer.toOctalString(subject!!.state))
    }

    init {
        this.subject = subject
        this.subject!!.attach(this)
    }
}

class HexaObserver(subject: Subject?) : Observer() {
    override fun update() {
        println("Hex String: " + Integer.toHexString(subject!!.state).toUpperCase())
    }

    init {
        this.subject = subject
        this.subject!!.attach(this)
    }
}