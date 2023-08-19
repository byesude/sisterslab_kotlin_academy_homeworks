package com.sisterslab.kotlinacademyhomeworks.week2.homework2

class FootballPlayer(ad: String, yas: Int, val takim: String) : Player(ad, yas) {

    override fun oyna() {
        println("$ad futbol oynuyor. Takımı: $takim")
    }
}