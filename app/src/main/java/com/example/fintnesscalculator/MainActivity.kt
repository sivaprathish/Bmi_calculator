package com.example.fintnesscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button=findViewById<Button>(R.id.bmi)

        button.setOnClickListener {

            val intent = Intent(applicationContext, calci::class.java)

            startActivity(intent)
        }

    }
}