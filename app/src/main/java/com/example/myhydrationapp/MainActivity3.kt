package com.example.myhydrationapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tvResult3 = findViewById<TextView>(R.id.tvResult3)
        val tvResult4 = findViewById<TextView>(R.id.tvResult4)
        val textView9= findViewById<TextView>(R.id.textView9)
        val textView10 = findViewById<TextView>(R.id.textView10)

        val days = arrayOf(
            2024 - 4 - 2,
            2024 - 4 - 3,
            2024 - 4 - 3,
            2024 - 4 - 3,
            2024 - 4 - 3,
            2024 - 4 - 0,
            2024 - 4 - 3
        )
        //Array of morning intake
        val morningIntake = arrayOf(0.3, 2, 4, 5, 2.5, 3.4, 0)
        //Array of of afternoon intakes
        val afternoonIntakes = arrayOf(5, 9, 4, 5, 3, 2, 0)
        // array of hydration notes
        val hydrationNotes = arrayOf(
            "Drank water with meals",
            "Infused water with citrus fruits", "Had a healthy balanced meal",
            "Went to the gym and drank water",
            "drank water in the morning and evening",
            "Infused water with protein snacks")

        tvResult3.text = days.toString()
        tvResult4.text = morningIntake.toString()
        textView9.text= afternoonIntakes.toString()
        textView10.text = hydrationNotes.toString()

    }
}