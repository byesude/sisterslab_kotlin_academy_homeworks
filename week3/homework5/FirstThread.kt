package com.sisterslab.kotlinacademyhomeworks.week3.homework5

class FirstThread : Thread() {
    override fun run() {
        for (i in 100..199) {
            println("Birinci thread: $i")
            Thread.sleep(5)
        }
    }
}