package com.example.sorteiarapido

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun sorteio(view: View) {
        val texto = findViewById<TextView>(R.id.outPutNumSorteado)
        val numSorteado = Random.nextInt(10 + 1)
        texto.text = "> " + numSorteado
    }
}