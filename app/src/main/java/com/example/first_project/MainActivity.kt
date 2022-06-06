package com.example.first_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightET: EditText = findViewById(R.id.heightET)
        val weightET = findViewById<EditText>(R.id.weightET)

        val resultBt = findViewById<Button>(R.id.resultButton)

        resultBt.setOnClickListener {
            if (heightET.text.isEmpty() || weightET.text.isEmpty()) {
                Toast.makeText(this, "빈 값이 있습니다", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val height: Int = heightET.text.toString().toInt()
            val weight: Int = weightET.text.toString().toInt()

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("height", height)
            intent.putExtra("weight", weight)

            startActivity(intent)

        }
    }

}