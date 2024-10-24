package com.parana.tiktaktoeaprendas.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.parana.tiktaktoeaprendas.R

class GameActivity : AppCompatActivity() {

    private lateinit var tvNome1: TextView
    private lateinit var tvNome2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        tvNome1 = findViewById(R.id.tv_nome1)
        tvNome2 = findViewById(R.id.tv_nome2)

        tvNome1.text = intent.extras?.getString("player1Nome")
        tvNome2.text = intent.extras?.getString("player2Nome")

    }
}