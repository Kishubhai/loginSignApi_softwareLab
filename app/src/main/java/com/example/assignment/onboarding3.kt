package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.assignment.login.LoginActivity
import com.example.assignment.signupp.signup

class onboarding3 : AppCompatActivity() {
    private lateinit var btn:Button
    private lateinit var btn_login:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_onboarding3)
        btn = findViewById(R.id.btn3)
        btn_login = findViewById(R.id.login_et)

        btn.setOnClickListener {
            val intent= Intent(this,signup::class.java)
            startActivity(intent)
        }
        btn_login.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}