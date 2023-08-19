package com.sisterslab.kotlinacademyhomeworks.week2.homework2

/*
Bir "Oyuncu" adlı üst sınıf oluşturun. Ardından "Futbolcu" be "Basketbolcu" adlı iki alt sınıf oluşturun. Her bir sınıfın
kendine özgü işlevi olsun. Oyuncuların "oyna" işlevi olsun.
 */

fun main() {

    val futbolcu = FootballPlayer("Birdal", 25, "Galatasaray")
    val basketbolcu = BasketballPlayer("Yunus", 28, "Beşiktaş")

    futbolcu.oyna()
    basketbolcu.oyna()
}