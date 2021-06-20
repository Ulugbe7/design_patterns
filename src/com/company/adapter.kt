package com.company

fun main() {
    val con = true
    var tasks: Tasks? = null

    if (con) tasks = Windows()
    else tasks = Linux()

    tasks.startBluetooth()
    tasks.startWifi()
}


class Windows : Tasks {
    override fun startWifi() {
        println("start wifi Windows")
    }

    override fun startBluetooth() {
        println("start bluetooth Windows")
    }
}

class Linux : Tasks {
    override fun startWifi() {
        println("start wifi Linux")
    }

    override fun startBluetooth() {
        println("start bluetooth Linux")
    }
}


interface Tasks {

    fun startWifi()

    fun startBluetooth()
}