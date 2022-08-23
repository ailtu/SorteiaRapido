package com.example.sorteiarapido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sorteio(view: View) {

        val texto = findViewById<TextView>(R.id.nmrSorteado)
        var goTo = findViewById<Int>(R.id.cxRecebeNumero)
        var numSorteado = Random.nextInt(goTo)

        texto.text = "O Número sorteado é: " + numSorteado
    }
}