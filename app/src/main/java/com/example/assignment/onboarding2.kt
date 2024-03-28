package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboarding2 : AppCompatActivity() {
    private lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)
        supportActionBar?.hide()
        btn = findViewById(R.id.btn2)
        btn.setOnClickListener {
            val intent = Intent(this,onboarding3::class.java)
            startActivity(intent)
        }
    }
}