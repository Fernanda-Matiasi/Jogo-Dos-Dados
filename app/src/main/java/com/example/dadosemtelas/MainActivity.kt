package com.example.dadosemtelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val intentDado = Intent(this, SegundoDadoActivity::class.java)
        buttonD6.setOnClickListener {
            startActivity(intentDado)
        }

        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val intentDado2 = Intent(this, TerceiroDadoActivity::class.java)
        buttonD12.setOnClickListener {
            startActivity(intentDado2)
        }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)
        val intentDado3 = Intent(this, QuartoDadoActivity::class.java)
        buttonD20.setOnClickListener {
            startActivity(intentDado3)
        }
    }
}
