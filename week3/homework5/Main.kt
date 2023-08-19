package com.sisterslab.kotlinacademyhomeworks.week3.homework5

/*
Asenkron olarak uzun süren bir işlemi gerçekleştiren thread oluşturuyoruz. Bu kodda, iki farklı thread
oluşturacağız ve her biri uzun süreli bir işlemi temsil edecek. İlk thread 5 saniye uyuyacak, ikinci thread
ise 3 saniye uyuyacak. Ana thread, diğer threadler çalışırken devam edecek ve tüm threadlerin bitmesini beklemek
için 6 saniye uyuyacak. Bu şekilde, asenkron olarak uzun süren işlemler gerçekleştirsin.
 */

fun main() {

    val threadBir = FirstThread()
    threadBir.start()

    val threadIki = Thread(SecondThread())
    threadIki.start()

    for (i in 900..999) {
        println("Ana thread : $i")
        Thread.sleep(6)
    }
}