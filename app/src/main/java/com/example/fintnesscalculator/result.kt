package com.example.fintnesscalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class result : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var sat=findViewById<TextView>(R.id.sat)
        var res=findViewById<TextView>(R.id.result)
        val data = intent.getStringExtra("value")

        val BMI= data.toString().toFloat()

        val status= if (BMI < 18.5) {
            sat.setText("under weight")
        } else if (BMI >= 18.5 && BMI < 24.9) {
            sat.setText("Healthy")
        } else if (BMI >= 24.9 && BMI < 30) {
            sat.setText("Overweight")
        } else if (BMI >= 30) {
            sat.setText("Suffering from Obesity")
        }else{
            sat.setText("NULL")
        }


        res.setText(data.toString())
    }
}