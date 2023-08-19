package com.sisterslab.kotlinacademyhomeworks.week2.homework1

class Rectangle(val uzunluk: Double, val genislik: Double) : GeometricShapes() {

    override fun alan(): Double {
        return uzunluk * genislik
    }

    override fun cevre(): Double {
        return 2 * (uzunluk + genislik)
    }
}