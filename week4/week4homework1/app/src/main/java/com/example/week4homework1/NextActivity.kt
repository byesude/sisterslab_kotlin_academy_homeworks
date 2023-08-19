package com.example.week4homework1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")

        val basarili_mesaj = "@+id/basarili_mesaj"


    }
}
