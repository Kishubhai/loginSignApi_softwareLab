package com.example.assignment.signupp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import androidx.cardview.widget.CardView
import com.example.assignment.BusinessHours
import com.example.assignment.R
import com.example.assignment.RegistrationViewModel
import com.example.assignment.data
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Sign_Hours : AppCompatActivity() {
    private lateinit var mon:CardView
    private lateinit var tues:CardView
    private lateinit var wed:CardView
    private lateinit var thurs:CardView
    private lateinit var fri:CardView
    private lateinit var sat:CardView
    private lateinit var sund:CardView

    private lateinit var etam:CardView
    private lateinit var tenam:CardView
    private lateinit var ekam:CardView
    private lateinit var fouram:CardView
    private lateinit var sevenam:CardView

    private lateinit var btnsign:Button

    val viewModel: RegistrationViewModel by viewModels()

    private lateinit var apiService: ApiService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_hours)

        btnsign = findViewById(R.id.btn_signup)

        mon = findViewById(R.id.monn)
        tues = findViewById(R.id.tuess)
        wed = findViewById(R.id.wedd)
        fri = findViewById(R.id.frii)
        thurs = findViewById(R.id.thurss)
        sat = findViewById(R.id.satt)
        sund = findViewById(R.id.sunn)

        val mon_list= mutableListOf<String>()
        val tues_list= mutableListOf<String>()
        val wed_list= mutableListOf<String>()
        val thurs_list= mutableListOf<String>()
        val fri_list= mutableListOf<String>()
        val sat_list= mutableListOf<String>()
        val sun_list= mutableListOf<String>()

        etam = findViewById(R.id.eight_am)
        tenam = findViewById(R.id.ten_am)
        ekam = findViewById(R.id.one_pm)
        fouram = findViewById(R.id.four_pm)
        sevenam = findViewById(R.id.seven_pm)

        mon.setOnClickListener {
            mon.setCardBackgroundColor(resources.getColor(R.color.orange))
            etam.setOnClickListener {
                etam.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("8am - 10am")
            }
            tenam.setOnClickListener {
                tenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("10am - 1pm")
            }
            ekam.setOnClickListener {
                ekam.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("1pm - 4pm")
            }
            fouram.setOnClickListener {
                fouram.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("4pm - 7pm")
            }
            sevenam.setOnClickListener {
                sevenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("7pm - 10pm")
            }


        }
        mon.setOnClickListener {
            mon.setCardBackgroundColor(resources.getColor(R.color.orange))
            etam.setOnClickListener {
                etam.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("8am - 10am")
            }
            tenam.setOnClickListener {
                tenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("10am - 1pm")
            }
            ekam.setOnClickListener {
                ekam.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("1pm - 4pm")
            }
            fouram.setOnClickListener {
                fouram.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("4pm - 7pm")
            }
            sevenam.setOnClickListener {
                sevenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                mon_list.add("7pm - 10pm")
            }


        }
        tues.setOnClickListener {
            etam.setCardBackgroundColor(resources.getColor(R.color.white))
            tenam.setCardBackgroundColor(resources.getColor(R.color.white))
            ekam.setCardBackgroundColor(resources.getColor(R.color.white))
            fouram.setCardBackgroundColor(resources.getColor(R.color.white))
            sevenam.setCardBackgroundColor(resources.getColor(R.color.white))

            tues.setCardBackgroundColor(resources.getColor(R.color.orange))
            etam.setOnClickListener {
                etam.setCardBackgroundColor(resources.getColor(R.color.orange))
                tues_list.add("8am - 10am")
            }
            tenam.setOnClickListener {
                tenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                tues_list.add("10am - 1pm")
            }
            ekam.setOnClickListener {
                ekam.setCardBackgroundColor(resources.getColor(R.color.orange))
                tues_list.add("1pm - 4pm")
            }
            fouram.setOnClickListener {
                fouram.setCardBackgroundColor(resources.getColor(R.color.orange))
                tues_list.add("4pm - 7pm")
            }
            sevenam.setOnClickListener {
                sevenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                tues_list.add("7pm - 10pm")
            }


        }
        wed.setOnClickListener {
            etam.setCardBackgroundColor(resources.getColor(R.color.white))
            tenam.setCardBackgroundColor(resources.getColor(R.color.white))
            ekam.setCardBackgroundColor(resources.getColor(R.color.white))
            fouram.setCardBackgroundColor(resources.getColor(R.color.white))
            sevenam.setCardBackgroundColor(resources.getColor(R.color.white))

            wed.setCardBackgroundColor(resources.getColor(R.color.orange))
            etam.setOnClickListener {
                etam.setCardBackgroundColor(resources.getColor(R.color.orange))
                wed_list.add("8am - 10am")
            }
            tenam.setOnClickListener {
                tenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                wed_list.add("10am - 1pm")
            }
            ekam.setOnClickListener {
                ekam.setCardBackgroundColor(resources.getColor(R.color.orange))
                wed_list.add("1pm - 4pm")
            }
            fouram.setOnClickListener {
                fouram.setCardBackgroundColor(resources.getColor(R.color.orange))
                wed_list.add("4pm - 7pm")
            }
            sevenam.setOnClickListener {
                sevenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                wed_list.add("7pm - 10pm")
            }


        }
        thurs.setOnClickListener {
            etam.setCardBackgroundColor(resources.getColor(R.color.white))
            tenam.setCardBackgroundColor(resources.getColor(R.color.white))
            ekam.setCardBackgroundColor(resources.getColor(R.color.white))
            fouram.setCardBackgroundColor(resources.getColor(R.color.white))
            sevenam.setCardBackgroundColor(resources.getColor(R.color.white))

            thurs.setCardBackgroundColor(resources.getColor(R.color.orange))
            etam.setOnClickListener {
                etam.setCardBackgroundColor(resources.getColor(R.color.orange))
                thurs_list.add("8am - 10am")
            }
            tenam.setOnClickListener {
                tenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                thurs_list.add("10am - 1pm")
            }
            ekam.setOnClickListener {
                ekam.setCardBackgroundColor(resources.getColor(R.color.orange))
                thurs_list.add("1pm - 4pm")
            }
            fouram.setOnClickListener {
                fouram.setCardBackgroundColor(resources.getColor(R.color.orange))
                thurs_list.add("4pm - 7pm")
            }
            sevenam.setOnClickListener {
                sevenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                thurs_list.add("7pm - 10pm")
            }


        }
        fri.setOnClickListener {
            etam.setCardBackgroundColor(resources.getColor(R.color.white))
            tenam.setCardBackgroundColor(resources.getColor(R.color.white))
            ekam.setCardBackgroundColor(resources.getColor(R.color.white))
            fouram.setCardBackgroundColor(resources.getColor(R.color.white))
            sevenam.setCardBackgroundColor(resources.getColor(R.color.white))

            fri.setCardBackgroundColor(resources.getColor(R.color.orange))
            etam.setOnClickListener {
                etam.setCardBackgroundColor(resources.getColor(R.color.orange))
                fri_list.add("8am - 10am")
            }
            tenam.setOnClickListener {
                tenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                fri_list.add("10am - 1pm")
            }
            ekam.setOnClickListener {
                ekam.setCardBackgroundColor(resources.getColor(R.color.orange))
                fri_list.add("1pm - 4pm")
            }
            fouram.setOnClickListener {
                fouram.setCardBackgroundColor(resources.getColor(R.color.orange))
                fri_list.add("4pm - 7pm")
            }
            sevenam.setOnClickListener {
                sevenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                fri_list.add("7pm - 10pm")
            }


        }
        sat.setOnClickListener {
            etam.setCardBackgroundColor(resources.getColor(R.color.white))
            tenam.setCardBackgroundColor(resources.getColor(R.color.white))
            ekam.setCardBackgroundColor(resources.getColor(R.color.white))
            fouram.setCardBackgroundColor(resources.getColor(R.color.white))
            sevenam.setCardBackgroundColor(resources.getColor(R.color.white))

            sat.setCardBackgroundColor(resources.getColor(R.color.orange))
            etam.setOnClickListener {
                etam.setCardBackgroundColor(resources.getColor(R.color.orange))
                sat_list.add("8am - 10am")
            }
            tenam.setOnClickListener {
                tenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                sat_list.add("10am - 1pm")
            }
            ekam.setOnClickListener {
                ekam.setCardBackgroundColor(resources.getColor(R.color.orange))
                sat_list.add("1pm - 4pm")
            }
            fouram.setOnClickListener {
                fouram.setCardBackgroundColor(resources.getColor(R.color.orange))
                sat_list.add("4pm - 7pm")
            }
            sevenam.setOnClickListener {
                sevenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                sat_list.add("7pm - 10pm")
            }


        }
        sund.setOnClickListener {
            etam.setCardBackgroundColor(resources.getColor(R.color.white))
            tenam.setCardBackgroundColor(resources.getColor(R.color.white))
            ekam.setCardBackgroundColor(resources.getColor(R.color.white))
            fouram.setCardBackgroundColor(resources.getColor(R.color.white))
            sevenam.setCardBackgroundColor(resources.getColor(R.color.white))

            sund.setCardBackgroundColor(resources.getColor(R.color.orange))
            etam.setOnClickListener {
                etam.setCardBackgroundColor(resources.getColor(R.color.orange))
                sun_list.add("8am - 10am")
            }
            tenam.setOnClickListener {
                tenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                sun_list.add("10am - 1pm")
            }
            ekam.setOnClickListener {
                ekam.setCardBackgroundColor(resources.getColor(R.color.orange))
                sun_list.add("1pm - 4pm")
            }
            fouram.setOnClickListener {
                fouram.setCardBackgroundColor(resources.getColor(R.color.orange))
                sun_list.add("4pm - 7pm")
            }
            sevenam.setOnClickListener {
                sevenam.setCardBackgroundColor(resources.getColor(R.color.orange))
                sun_list.add("7pm - 10pm")
            }


        }
        val userData = data(
            address = "", // Provide appropriate values for each field
            business_hours = BusinessHours(mon_list, tues_list,wed_list,thurs_list, fri_list,sat_list,sun_list), // Assuming BusinessHours is another data class
            business_name = "",
            city = "",
            device_token = "",
            email = "", // Get the text from TextInputEditText
            full_name = "",
            informal_name = "",
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

        val retrofit = Retrofit.Builder()
            .baseUrl("https://sowlab.com/assignment/user/") // Replace with your base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        apiService = retrofit.create(ApiService::class.java)
        val UserData = viewModel.data

        btnsign.setOnClickListener {
            uploadDataToApi(UserData!!)
        }

    }


    private fun uploadDataToApi(userData: data) {
        val call: Call<data> = apiService.register(userData)

        call.enqueue(object : Callback<data> {
            override fun onResponse(call: Call<data>, response: Response<data>) {
                // Handle response
                if (response.isSuccessful) {
                    // Upload successful
                    Toast.makeText(this@Sign_Hours, "Registered successfully", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@Sign_Hours,signConfirmation::class.java)
                    startActivity(intent)
                } else {
                    // Upload failed
                    Toast.makeText(this@Sign_Hours, "Not Registered successfully", Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<data>, t: Throwable) {
                // Handle failure
            }
        })
    }
}