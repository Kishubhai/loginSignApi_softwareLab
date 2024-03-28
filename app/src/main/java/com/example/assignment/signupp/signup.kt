package com.example.assignment.signupp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import com.example.assignment.BusinessHours
import com.example.assignment.R
import com.example.assignment.RegistrationViewModel
import com.example.assignment.data
import com.google.android.material.textfield.TextInputEditText

class signup : AppCompatActivity() {

    private lateinit var name:TextInputEditText
    private lateinit var email:TextInputEditText
    private lateinit var password:TextInputEditText
    private lateinit var phoneNumber:TextInputEditText

    private lateinit var btn:Button

//    val viewModel:RegistrationViewModel by viewModel
    val viewModel:RegistrationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_signup)

        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        phoneNumber = findViewById(R.id.number)
        password = findViewById(R.id.pass)

        btn = findViewById(R.id.btnn)

        val userData = data(
            address = "", // Provide appropriate values for each field
            business_hours = BusinessHours(listOf(""), listOf(""),listOf(""),listOf(""), listOf(""),listOf(""),listOf("")), // Assuming BusinessHours is another data class
            business_name = "",
            city = "",
            device_token = "",
            email = email.text.toString(), // Get the text from TextInputEditText
            full_name = name.text.toString(),
            informal_name = "",
            password = password.text.toString(),
            phone = phoneNumber.text.toString(),
            registration_proof = "",
            role = "",
            social_id = "",
            state = "",
            type = "",
            zip_code = 0 // Provide appropriate value
        )

        // Assign the userData instance to ViewModel
        viewModel.data = userData

        btn.setOnClickListener {
            // Perform actions after button click, such as navigation to the next screen
            val intent = Intent(this,signupfarminfo::class.java)
            startActivity(intent)
        }
    }
}