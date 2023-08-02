package com.example.kotlinakademiodev.homeworks.week2.homework1
/*
Bir "GeometrikSekil" adlı üst sınıf oluşturun. Ardından "Dikdortgen" ve "Daire" adında iki alt sınıf oluşturun.
Her alt sınıfın kendine özgü alan ve çevre hesaplayan işlevleri olsun.
(Dikdörtgen alan = uzunluk x genişlik, çevre = 2 x (uzunluk + genişlik),
Daire alan = π x yarıçap x yarıçap, çevre = 2 x π x yarıçap) Not: ortak kullanılanlar GeometrikSeklin özelliği
olacak
 */
fun main() {

    val dikdortgen = Rectangle(5.0, 3.0)
    val daire = Circle(4.0)

    println("Dikdörtgen Alanı: ${dikdortgen.alan()}")
    println("Dikdörtgen Çevresi: ${dikdortgen.cevre()}")


    println("Daire Alanı: ${daire.alan()}")
    println("Daire Çevresi: ${daire.cevre()}")
}