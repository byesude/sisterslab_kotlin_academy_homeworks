package com.example.kotlinakademiodev.homeworks.week2.homework3

fun main() {

    val personel = Personnel("Yunus", "Yavuz", "Mühendis", 5000.0)

    println("Ad: ${personel.ad}")
    println("Soyad: ${personel.soyad}")
    println("Pozisyon: ${personel.pozisyon}")
    println("Maaş: ${personel.maas}")

    personel.maasArttir(2000.0)
}