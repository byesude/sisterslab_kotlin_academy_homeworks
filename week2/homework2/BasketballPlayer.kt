package com.example.kotlinakademiodev.homeworks.week2.homework2

class BasketballPlayer(ad: String, yas: Int, val takim: String) : Player(ad, yas) {

    override fun oyna() {
        println("$ad basketbol oynuyor. Takımı: $takim")
    }
}