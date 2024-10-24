package com.parana.tiktaktoeaprendas.ui

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.parana.tiktaktoeaprendas.R

class PlayerChooserScreen : AppCompatActivity() {

    private lateinit var spinner1: Spinner
    private lateinit var spinner2: Spinner
    private var cpu = false;

    private var listaPlayers = mutableListOf("Escolha um jogador")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_chooser_screen)


        if (intent.extras?.getBoolean("cpu") != null) {
            cpu = intent.extras!!.getBoolean("cpu")
        }
        spinner1 = findViewById(R.id.sp_player1)
        spinner2 = findViewById(R.id.sp_player2)
        popularSpinners()
    }

    fun popularSpinners() {
        //(Esperando ficar pronto o banco para fazer os inserts dos itens)

        //Caso seja player x cpu ele remove o botão

        spinner1.adapter = ArrayAdapter(
            this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            listaPlayers
        )

        //Configura spinner para caso seja CPU
        if (cpu) {
            spinner2.visibility = View.GONE
        } else {
            spinner2.adapter = ArrayAdapter(
                this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                listaPlayers
            )
        }
    }

}