package com.parana.tiktaktoeaprendas.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.parana.tiktaktoeaprendas.GameActivity
import com.parana.tiktaktoeaprendas.R
import com.parana.tiktaktoeaprendas.model.Aluno

class PlayerChooserScreen : AppCompatActivity() {

    private lateinit var spinner1: Spinner
    private lateinit var spinner2: Spinner
    private lateinit var btJogar: Button

    private var cpu = false;

    private var listaPlayers = mutableListOf("Escolha um jogador")

    val listaAlunos = mutableListOf(
        Aluno(1, "Gustavo", 0),
        Aluno(2, "Roberto", 0),
        Aluno(3, "Felipe", 0),
        Aluno(4, "Murilo", 0),
        Aluno(5, "Eduardo", 0),
        Aluno(6, "Gabriel", 0)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_chooser_screen)


        if (intent.extras?.getBoolean("cpu") != null) {
            cpu = intent.extras!!.getBoolean("cpu")
        }
        spinner1 = findViewById(R.id.sp_player1)
        spinner2 = findViewById(R.id.sp_player2)
        btJogar = findViewById(R.id.bt_jogar)
        popularSpinners()

        btJogar.setOnClickListener {
            jogar()
        }

    }

    private fun jogar() {
        val intent = Intent(this@PlayerChooserScreen, GameActivity::class.java)

        if (cpu) {
            //Utilizaremos o array id 7 para identificar q é a CPU
            if (spinner1.selectedItemPosition != 0) {
                intent.putExtra("player2", 7)
                intent.putExtra("player1", spinner1.selectedItemPosition)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, selecione um jogador", Toast.LENGTH_LONG).show()
            }
        }

    }

    fun popularSpinners() {
        //(Esperando ficar pronto o banco para fazer os inserts dos itens)

        for (i in 0 until listaAlunos.size) {
            listaPlayers.add(listaAlunos.get(i).nome)

        }
        //Caso seja player x cpu ele remove o botão
        spinner1.adapter = ArrayAdapter(
            this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, listaPlayers
        )


        //Configura spinner para caso seja CPU
        if (cpu) {
            spinner2.visibility = View.GONE
        } else {
            spinner2.adapter = ArrayAdapter(
                this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, listaPlayers
            )
        }
    }

}