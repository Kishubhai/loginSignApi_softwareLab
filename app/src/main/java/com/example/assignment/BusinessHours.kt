package com.example.assignment

data class BusinessHours(
    val fri: List<String>,
    val mon: List<String>,
    val sat: List<String>,
    val sun: List<String>,
    val thu: List<String>,
    val tue: List<String>,
    val wed: List<String>
)