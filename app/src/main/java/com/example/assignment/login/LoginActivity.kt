package com.example.assignment.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.assignment.R
import com.example.assignment.signupp.signConfirmation
import com.google.android.material.textfield.TextInputEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    private lateinit var email: TextInputEditText
    private lateinit var password: TextInputEditText

    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.email)
        password = findViewById(R.id.pass)

        btn = findViewById(R.id.btn_login)

        btn.setOnClickListener {
            val userEmail = email.text.toString().trim()
            val userPassword = password.text.toString().trim()

            // Call your login function with the provided email and password
            login(userEmail, userPassword)
        }

    }

    private fun login(email: String, password: String) {
        val apiService = RetrofitClient.apiService
        val loginData = logindata(
            device_token = "",
            email = email,
            password = password,
            role = "user",
            social_id = "",
            type = "normal"
        )

        val call = apiService.login(loginData)

        call.enqueue(object : Callback<LoginResponseX> {
            override fun onResponse(call: Call<LoginResponseX>, response: Response<LoginResponseX>) {
                if (response.isSuccessful) {
                    Toast.makeText(this@LoginActivity, "Successfully logged in !!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@LoginActivity,signConfirmation::class.java)
                    startActivity(intent)

//                    val loginResponse = response.body()
//                    if (loginResponse!!.success == true) {
//                        // Login successful
//                         // Handle token
//                        Toast.makeText(this@LoginActivity, "Success !!", Toast.LENGTH_SHORT).show()
//                    } else {
//                        // Login failed
//                        val message = loginResponse?.message ?: "Unknown error"
//                        // Display error message to the user
//                        Toast.makeText(this@LoginActivity, message, Toast.LENGTH_SHORT).show()
//                    }
                } else {
                    // Handle server error
                         Toast.makeText(this@LoginActivity, "Something weint wrong", Toast.LENGTH_SHORT).show()
//
                }
            }

            override fun onFailure(call: Call<LoginResponseX>, t: Throwable) {
                // Handle network or unexpected errors
            }
        })

    }


}