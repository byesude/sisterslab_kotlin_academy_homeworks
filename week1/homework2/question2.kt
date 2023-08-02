package com.example.kotlinakademiodev.homeworks.week1.homework2
/*
Kullanıcıdan yaşını girmesini isteyecek Girilen yaşa göre, 18 veya daha büyükse "Oy kullanabilirsiniz!"
mesajını, küçükse "Oy kullanamazsınız." mesajını ekrana yazdırır. Eğer geçerli bir sayı girilmezse, "Geçerli
bir yaş girmediniz." mesajını ekrana yazdırsın ve sayı dışında text girdiğinde uygulama hata vermesin sayı
giriniz uyarısı versin Not: try-cacth bloğu kullanılmalı
 */

import java.util.Scanner

fun main() {
    try
    {
        print("Yaşınızı girin: ")
        val yas = Scanner(System.`in`)
        val kullaniciYas = yas.nextInt()

        if(kullaniciYas<0)
        {
            println("Yaşın sıfırdan küçük olamaz.")
        }
        else if(kullaniciYas>=18)
        {
            println("Oy kullanabilirsiniz.")
        }
        else
        {
            println("Oy kullanamazsınız.")
        }

    }
    catch (e: Exception)
    {
        println("Hata! Yalnızca sayı giriniz.")
    }
}