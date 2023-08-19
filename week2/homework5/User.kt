package com.sisterslab.kotlinacademyhomeworks.week2.homework5

class User(val ad: String?, val soyad: String?) {

    fun bilgileriYazdir() {

        val tamAd = if (ad != null && soyad != null) {
            "$ad $soyad"
        } else if (ad != null) {
            ad
        } else if (soyad != null) {
            soyad
        } else {
            "Bilgi yok"
        }

        println("Kullanıcının Adı veya Soyadı: $tamAd")
    }
}