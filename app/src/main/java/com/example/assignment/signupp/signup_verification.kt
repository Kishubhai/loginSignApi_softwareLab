package com.example.assignment.signupp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.assignment.R

class signup_verification : AppCompatActivity() {
    private lateinit var btn:CardView
    private lateinit var img:ImageView
    private lateinit var forward:Button

    private val PICK_IMAGE_REQUEST = 1 // Request code for image picker


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_verification)

        btn =findViewById(R.id.ic_capture)
        img = findViewById(R.id.imgview)
        forward = findViewById(R.id.btnn)

        btn.setOnClickListener {
            openImagePicker()
        }
        forward.setOnClickListener {
            val intent = Intent(this,Sign_Hours::class.java)
            startActivity(intent)
        }
    }

    private fun openImagePicker() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, PICK_IMAGE_REQUEST)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
            val selectedImageUri: Uri? = data.data
            selectedImageUri?.let {
                img.setImageURI(selectedImageUri)
                img.visibility = ImageView.VISIBLE
            }
        }
}
}