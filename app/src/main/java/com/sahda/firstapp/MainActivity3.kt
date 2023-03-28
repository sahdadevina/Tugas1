package com.sahda.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {

    private lateinit var edit1:EditText
    private lateinit var edit2:EditText
    private lateinit var button: Button


    private fun inComp(){
        edit1 = findViewById(R.id.edit)
        edit2 = findViewById(R.id.edit2)
        button = findViewById(R.id.Button04)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        inComp()

        button.setOnClickListener{
            startActivity(Intent(this, MainActivity4::class.java)
                .putExtra("nama", edit1.text.toString())
                .putExtra("username", edit2.text.toString()))
        }
    }
}