package com.example.assignment.signupp
import com.example.assignment.data
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("register")
    fun register(@Body request: data): Call<data>
}
