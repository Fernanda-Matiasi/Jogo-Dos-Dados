package com.example.dadosemtelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TerceiroDadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceiro_dado)

        val buttonVoltar2 = findViewById<Button>(R.id.buttonVoltar2)

        val buttonJoga2 = findViewById<Button>(R.id.buttonJoga2)
        buttonJoga2.setOnClickListener {
            rolarDados(12)
        }
        buttonVoltar2.setOnClickListener {
            finish()
        }
    }
    fun rolarDados(lados: Int){
        val valor = (1..lados).random()

        val textD12 = findViewById<TextView>(R.id.textD12)
        textD12.text = valor.toString()

        val imageResource = imgD12(valor)
        val imageD12 = findViewById<ImageView>(R.id.imageD12)
        imageD12.setImageResource(imageResource)
    }

    private fun imgD12(valor: Int): Int {
        return when(valor){
            1 -> R.drawable.d12_1
            2 -> R.drawable.d12_2
            3 -> R.drawable.d12_3
            4 -> R.drawable.d12_4
            5 -> R.drawable.d12_5
            6 -> R.drawable.d12_6
            7-> R.drawable.d12_7
            8 -> R.drawable.d12_8
            9 -> R.drawable.d12_9
            10 -> R.drawable.d12_10
            11 -> R.drawable.d12_11
            else -> R.drawable.d12_12
        }
    }

}