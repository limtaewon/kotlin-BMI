package com.example.first_project

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)

        val bmi = weight / (height / 100.0).pow(2.0)
        val resultText = when {
            bmi >= 35.0 -> "고도비만"
            bmi >= 30.0 -> "중정비만"
            bmi >= 25.0 -> "경도비만"
            bmi >= 23.0 -> "과체중"
            bmi >= 21.0 -> "정상체중"
            else -> "저체중"
        }
        val bmiTextview = findViewById<TextView>(R.id.BmiTextView)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        bmiTextview.text = bmi.toString()
        resultTextView.text = resultText.toString()

    }
}