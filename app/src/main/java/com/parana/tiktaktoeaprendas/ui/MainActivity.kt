package com.parana.tiktaktoeaprendas.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.parana.tiktaktoeaprendas.R

class MainActivity : AppCompatActivity() {

    private lateinit var btSair: Button
    private lateinit var btPvp: Button
    private lateinit var btPvCpu: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSair = findViewById(R.id.bt_sair)
        btPvp = findViewById(R.id.bt_pvp)
        btPvCpu = findViewById(R.id.bt_pvcpu)

        var intent = Intent(this@MainActivity, PlayerChooserScreen::class.java)


        btPvp.setOnClickListener {
            startActivity(intent)
        }

        btPvCpu.setOnClickListener {
            intent.putExtra("cpu", true)
            startActivity(intent)
        }

        btSair.setOnClickListener {
            finish()
        }

    }

}