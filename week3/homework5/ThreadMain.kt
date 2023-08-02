package com.example.kotlinakademiodev.homeworks.week3.homework5

fun main() {

    val threadBir = FirstThread()
    threadBir.start()

    val threadIki = Thread(SecondThread())
    threadIki.start()

    for (i in 900..999) {
        println("Ana thread : $i")
        Thread.sleep(6)
    }
}