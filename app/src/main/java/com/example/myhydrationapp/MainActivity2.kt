package com.example.myhydrationapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnNext = findViewById<Button>(R.id.btnNext)
        val button2 = findViewById<Button>(R.id.button2)
        val btnClear = findViewById<Button>(R.id.btnClear)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvResult2 = findViewById<TextView>(R.id.tvResult2)
        val tvResult4 = findViewById<TextView>(R.id.tvResult4)
        //Array of days
        val days = arrayOf(
            2024 - 4 - 2,
            2024 - 4 - 3,
            2024 - 4 - 3,
            2024 - 4 - 3,
            2024 - 4 - 3,
            2024 - 4 - 0,
            2024 - 4 - 3
        )
        //Array of morning intakes
        val morningIntake = arrayOf(0.3, 2, 4, 5, 2.5, 3.4, 0)
        //Array of of afternoon intakes
        val afternoonIntakes = arrayOf(5, 9, 4, 5, 3, 2, 0)
        // array of hydration notes
        val hydrationNotes = arrayOf(
            "Drank water with meals",
            "Infused water with citrus fruits", "Had a healthy balanced meal",
            "Went to the gym and drank water",
            "drank water in the morning and evening",
            "Infused water with protein snacks"
        )

        var size = morningIntake.size + afternoonIntakes.size
        var size1 =  morningIntake.size
        var size2 = afternoonIntakes.size

        //calculating average intake for the week
        var average = 0
        average = size / 7

        tvResult.text = "The average water intake for the week is $average"
        tvResult2.text = "Total  morning liter consuption for the week $size1"
        tvResult4.text = "Total  afternoon liter consuption for the week $size2 "
    }
}