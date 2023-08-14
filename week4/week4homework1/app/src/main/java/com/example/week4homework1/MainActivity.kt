package com.example.week4homework1

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextPhone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextPhone = findViewById(R.id.editTextPhone)
    }

    fun saveButtonClicked(view: android.view.View) {
        val ad = editTextName.text.toString().trim()
        val telefon = editTextPhone.text.toString().trim()

        if (ad.isEmpty() || telefon.isEmpty()) {
            Toast.makeText(this, getString(R.string.uyari_mesaj), Toast.LENGTH_SHORT).show()
            return
        }

        // Burada numarayı kaydetme işlemleri gerçekleştirilir.

        val intent = Intent(this, NextActivity::class.java)
        intent.putExtra("name", ad)
        intent.putExtra("phone", telefon)
        startActivity(intent)
        finish()
    }
}
