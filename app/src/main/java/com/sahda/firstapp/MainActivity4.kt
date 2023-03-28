package com.sahda.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {

    private lateinit var showtext:TextView
    private lateinit var showtext2:TextView

    private fun inComp(){
        showtext = findViewById(R.id.showName)
        showtext2 = findViewById(R.id.showUser)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        inComp()

        val showName = intent.getStringExtra("nama")
        val showUser = intent.getStringExtra("username")

        showtext.text = resources.getString(R.string.showname, showName)
        showtext2.text = resources.getString(R.string.showusername, showUser)

    }
}