package com.sahda.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button2: Button

    private fun inComp(){
        button = findViewById(R.id.Button02)
        button2 = findViewById(R.id.Button03)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        inComp()

        button.setOnClickListener{
            startActivity(Intent(this, MainActivity3::class.java))
        }

    }
}