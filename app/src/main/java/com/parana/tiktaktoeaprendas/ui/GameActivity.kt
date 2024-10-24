package com.parana.tiktaktoeaprendas.ui

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.parana.tiktaktoeaprendas.R

class GameActivity : AppCompatActivity() {

    private lateinit var tvNome1: TextView
    private lateinit var tvNome2: TextView

    private lateinit var bt00: ImageButton
    private lateinit var bt01: ImageButton
    private lateinit var bt02: ImageButton

    private lateinit var bt10: ImageButton
    private lateinit var bt11: ImageButton
    private lateinit var bt12: ImageButton

    private lateinit var bt20: ImageButton
    private lateinit var bt21: ImageButton
    private lateinit var bt22: ImageButton

    var player1Turn = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        tvNome1 = findViewById(R.id.tv_nome1)
        tvNome2 = findViewById(R.id.tv_nome2)

        bt00 = findViewById(R.id.bt_00)
        bt01 = findViewById(R.id.bt_01)
        bt02 = findViewById(R.id.bt_02)

        bt10 = findViewById(R.id.bt_10)
        bt11 = findViewById(R.id.bt_11)
        bt12 = findViewById(R.id.bt_12)

        bt20 = findViewById(R.id.bt_20)
        bt21 = findViewById(R.id.bt_21)
        bt22 = findViewById(R.id.bt_22)

        tvNome1.text = intent.extras?.getString("player1Nome")
        tvNome2.text = intent.extras?.getString("player2Nome")


        bt00.setOnClickListener {
            bt00.setSou(R.drawable.baseline_circle_24)
        }

        bt01.setOnClickListener {

        }

        bt02.setOnClickListener {

        }

        bt10.setOnClickListener {

        }

        bt11.setOnClickListener {

        }

        bt12.setOnClickListener {

        }

        bt20.setOnClickListener {

        }

        bt21.setOnClickListener {

        }

        bt22.setOnClickListener {

        }


    }
}