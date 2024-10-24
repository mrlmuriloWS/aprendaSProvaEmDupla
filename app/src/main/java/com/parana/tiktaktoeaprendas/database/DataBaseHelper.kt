package com.parana.tiktaktoeaprendas.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
gu
class DataBaseHelper(context: Context): SQLiteOpenHelper(

    context, "aprendas.db", null, 1
) {

    override fun onCreate(db: SQLiteDatabase?) {
        var sql = "CREATE TABLE IF NOT EXISTS alunos (" +
                "id integer NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "nome varchar(100)," +
                "pontos int" +
                ");"
        try{
            db?.execSQL( sql )
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}