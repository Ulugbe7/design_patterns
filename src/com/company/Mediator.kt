package com.company

import java.util.*

fun main() {
    val u1: User = User("U1")
    val u2: User = User("U2")

    u1.sendMessage("hi u2")
    u2.sendMessage("nice u1")

}

class ChatRoom {
    companion object {
        fun showMessage(user: User, msg: String) {
            println("${Date()} : ${user.name};  [$msg]")
        }
    }
}

class User(val name: String) {

    fun sendMessage(msg: String) {
        ChatRoom.showMessage(this, msg)
    }
}

