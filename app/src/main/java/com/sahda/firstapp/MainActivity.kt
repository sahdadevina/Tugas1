package com.sahda.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    private fun initComp(){
        button = findViewById(R.id.button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        initComp()

        button.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}