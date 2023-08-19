package com.sisterslab.kotlinacademyhomeworks.week2.homework3

class Personnel(val ad: String, val soyad: String, val pozisyon: String, var maas: Double) {

    fun maasArttir(artisMiktari: Double) {
        maas += artisMiktari
        println("$ad $soyad adlı personelin yeni maaşı: $maas")
    }
}