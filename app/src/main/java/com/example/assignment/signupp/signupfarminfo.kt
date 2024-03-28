package com.example.assignment.signupp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import com.example.assignment.BusinessHours
import com.example.assignment.R
import com.example.assignment.RegistrationViewModel
import com.example.assignment.data
import com.google.android.material.textfield.TextInputEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class signupfarminfo : AppCompatActivity() {
    private lateinit var bussiness:TextInputEditText
    private lateinit var name:TextInputEditText
    private lateinit var address:TextInputEditText
    private lateinit var city:TextInputEditText

    private lateinit var btn: Button



    val viewModel: RegistrationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupfarminfo)

        bussiness = findViewById(R.id.bussi)
        name = findViewById(R.id.informalName)
        address = findViewById(R.id.address)
        city = findViewById(R.id.city)

        btn = findViewById(R.id.btn)



        val userData = data(
            address = address.text.toString(), // Provide appropriate values for each field
            business_hours = BusinessHours(listOf(""), listOf(""),listOf(""),listOf(""), listOf(""),listOf(""),listOf("")), // Assuming BusinessHours is another data class
            business_name = bussiness.text.toString(),
            city = city.text.toString(),
            device_token = "",
            email = "", // Get the text from TextInputEditText
            full_name = "",
            informal_name = name.text.toString(),
            password = "",
            phone = "",
            registration_proof = "",
            role = "",
            social_id = "",
            state = "",
            type = "",
            zip_code = 0 // Provide appropriate value
        )

        viewModel.data = userData

        val UserData = viewModel.data

        btn.setOnClickListener {
            val intent = Intent(this,signup_verification::class.java)
            startActivity(intent)
        }

    }
}