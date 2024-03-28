package com.example.assignment.signupp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.assignment.MainActivity
import com.example.assignment.R

class signConfirmation : AppCompatActivity() {
    private lateinit var btnn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_confirmation)
        btnn = findViewById(R.id.btnn)

        btnn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}