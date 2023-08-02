package com.example.kotlinakademiodev.homeworks.week1.homework1
/*
Dışardan kullanıcı adı ve şifre girişi alınacak, girilen bu kullanıcı adı ve şifre önceden belirlenen
kullanıcı adı ve şifreyle  eşleştirilecek . Kullanıcı adında büyük-küçük harf farkı göz ardı edilecek,
ancak şifrede büyük-küçük harf farkı olması gerekmektedir. kullanıcı adı ve şifre daha önce belirlenen
kullanıcı adı ve şifreyle uyuşuyorsa hoş geldiniz diyecek eşleşmiyorsa kullanıcı adı veya şifre hatalı
uyarı verecek program yazılmalı
 */
import java.util.Scanner

fun main() {

    val ad = "Ecem"
    val sifre = "Ecem2002"


    val scanner = Scanner(System.`in`)

    // Kullanıcı adı ve şifre girişini al
    print("Kullanıcı Adı: ")
    val kullaniciAdi = scanner.nextLine()

    print("Şifre: ")
    val kullaniciSifre = scanner.nextLine()


    if (kullaniciAdi.equals(ad, ignoreCase = true) && kullaniciSifre.equals(sifre, ignoreCase = false))
    {
        println("Hoş geldiniz!")
    }
    else
    {
        println("Kullanıcı adı veya şifre hatalı.")
    }

}