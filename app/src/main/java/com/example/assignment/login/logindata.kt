package com.example.assignment.login

data class logindata(
    val device_token: String,
    val email: String,
    val password: String,
    val role: String,
    val social_id: String,
    val type: String
)