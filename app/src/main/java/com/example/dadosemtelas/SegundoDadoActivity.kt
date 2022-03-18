package com.example.dadosemtelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SegundoDadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo_dado)

        val buttonVoltar1 = findViewById<Button>(R.id.buttonVoltar1)

        val buttonJoga = findViewById<Button>(R.id.buttonJoga)
        buttonJoga.setOnClickListener {
            rolarDados(6)
        }
        buttonVoltar1.setOnClickListener {
            finish()
        }
    }

    fun rolarDados(lados: Int) {
        val valor = (1..lados).random()

        val textD6 = findViewById<TextView>(R.id.textD6)
        textD6.text = valor.toString()

        val imageResource = imgD6(valor)
        val imageD6 = findViewById<ImageView>(R.id.imageD6)
        imageD6.setImageResource(imageResource)
    }

    private fun imgD6(valor: Int): Int {
        return when (valor) {
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6

        }
    }
}