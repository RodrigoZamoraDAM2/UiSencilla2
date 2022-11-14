package com.example.uisencilla2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class SecondaryActivity : AppCompatActivity() {

    private lateinit var txtSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        txtSaludo = findViewById(R.id.txtSaludo)

        txtSaludo.text = "Bienvenido ${intent.getStringExtra("Nombre")}"

    }

}