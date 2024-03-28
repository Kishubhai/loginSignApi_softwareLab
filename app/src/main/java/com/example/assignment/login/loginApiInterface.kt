package com.example.assignment.login

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface loginApiInterface {

    @POST("login")
    fun login(@Body request: logindata): Call<LoginResponseX>

}