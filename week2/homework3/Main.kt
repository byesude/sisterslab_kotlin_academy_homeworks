package com.sisterslab.kotlinacademyhomeworks.week2.homework3

/*
Bir "Personel" adlı sınıf oluşturun ve şirketteki personellerin adı soyadı pozisyonu maaşı içeren nitelikleri
ve maasArrtir gibi işlevi olsun.
 */

fun main() {

    val personel = Personnel("Yunus", "Yavuz", "Mühendis", 5000.0)

    println("Ad: ${personel.ad}")
    println("Soyad: ${personel.soyad}")
    println("Pozisyon: ${personel.pozisyon}")
    println("Maaş: ${personel.maas}")

    personel.maasArttir(2000.0)
}