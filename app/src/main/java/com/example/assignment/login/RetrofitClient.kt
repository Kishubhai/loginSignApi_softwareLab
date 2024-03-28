package com.example.assignment.login
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "sowlab.com/assignment/user/"

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://sowlab.com/assignment/user/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: loginApiInterface by lazy {
        retrofit.create(loginApiInterface::class.java)
    }
}
