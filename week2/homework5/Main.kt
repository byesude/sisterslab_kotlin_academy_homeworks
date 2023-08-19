package com.sisterslab.kotlinacademyhomeworks.week2.homework5

/*
Bir "Kullanici" adlı sınıf oluşturun ve ad-soyad gibi özellikleri içeren nullable özellikler tanımlayın.
Kullanıcı adı ve soyadı null olabileceği göz önünde bulundurularak bu özelliklere nasıl erişilir?
 */
fun main() {

    val kullanici1 = User("Ecem", "Ozan")
    val kullanici2 = User("Yunus", null)
    val kullanici3 = User(null, "Demir")
    val kullanici4 = User(null, null)

    kullanici1.bilgileriYazdir()
    kullanici2.bilgileriYazdir()
    kullanici3.bilgileriYazdir()
    kullanici4.bilgileriYazdir()
}