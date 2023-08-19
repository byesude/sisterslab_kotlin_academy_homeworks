package com.sisterslab.kotlinacademyhomeworks.week2.homework1

class Circle(val yaricap: Double) : GeometricShapes() {

    override fun alan(): Double {
        return Math.PI * yaricap * yaricap
    }

    override fun cevre(): Double {
        return 2 * Math.PI * yaricap
    }
}