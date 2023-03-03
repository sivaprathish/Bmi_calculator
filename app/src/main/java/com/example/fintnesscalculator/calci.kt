package com.example.fintnesscalculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.pow

class calci : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calci)
        var height=findViewById<EditText>(R.id.H)
        var weight=findViewById<EditText>(R.id.W)
        var button=findViewById<Button>(R.id.cal)




        button.setOnClickListener {
            var Intnum1 = height.text.toString().toFloat()
            var Intnum2 = weight.text.toString().toFloat()

            val BMI = (Intnum2/(Intnum1.pow(2)))*10000
            val bmi= BMI.toString()



            val myvalue=bmi
            val myActivity = Intent(applicationContext, result::class.java)
            myActivity.putExtra("value",myvalue)
            startActivity(myActivity)
        }

    }
}