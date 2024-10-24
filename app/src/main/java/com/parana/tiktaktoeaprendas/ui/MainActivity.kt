package com.parana.tiktaktoeaprendas.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.parana.tiktaktoeaprendas.R
import com.parana.tiktaktoeaprendas.database.DataBaseHelper

class MainActivity : AppCompatActivity() {

    private val bancoDados by lazy{
        DataBaseHelper(this)
    }
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
//Método para popular os jogadores da DataBase
        populaDataBaseUser()
       


    }

    private fun populaDataBaseUser() {
        try {

//            bancoDados.readableDatabase.execSQL(
//                "SELECT COUNT id FROM alunos;"
//            )


            bancoDados.writableDatabase.execSQL(
                "INSERT INTO alunos VALUES(null, 'Gustavo', 0);"
            )
            bancoDados.writableDatabase.execSQL(
                "INSERT INTO alunos VALUES(null, 'Roberto', 0);"
            )
            bancoDados.writableDatabase.execSQL(
                "INSERT INTO alunos VALUES(null, 'Felipe', 0);"
            )
            bancoDados.writableDatabase.execSQL(
                "INSERT INTO alunos VALUES(null, 'Murilo', 0);"
            )
            bancoDados.writableDatabase.execSQL(
                "INSERT INTO alunos VALUES(null, 'Eduardo', 0);"
            )
            bancoDados.writableDatabase.execSQL(
                "INSERT INTO alunos VALUES(null, 'Gabriel', 0);"
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }



}