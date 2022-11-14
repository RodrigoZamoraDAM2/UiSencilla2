package com.example.uisencilla2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var txtNombre : EditText
    private lateinit var txtApellido : EditText
    private lateinit var btnAceptar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNombre = findViewById(R.id.editTextTextPersonName)
        txtApellido = findViewById(R.id.editTextTextPersonName2)
        btnAceptar = findViewById(R.id.button)

        btnAceptar.setOnClickListener() {
            val intent = Intent(this@MainActivity, SecondaryActivity::class.java)


            intent.putExtra("Nombre", txtNombre.text.toString() +" "+ txtApellido.text.toString())

            startActivity(intent)
        }
    }
}