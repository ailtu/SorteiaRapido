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
        val texto = findViewById<TextView>(R.id./* nome do textView aqui */)
        var goTo = 0
        var numSorteado = Random.nextInt(goTo +1)

        texto.text = "O Número sorteado é: " + numSorteado
    }
}