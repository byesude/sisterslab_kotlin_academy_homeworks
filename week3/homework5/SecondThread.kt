package com.sisterslab.kotlinacademyhomeworks.week3.homework5

class SecondThread : Runnable {
    override fun run() {
        for (i in 200..299) {
            println("İkinci thread: $i")
            Thread.sleep(3)
        }
    }
}