package edu.temple.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        lateinit var placeName: TextView

        placeName = findViewById(R.id._placeName)

        //creating list of string names that represent the images
        val placeName = listOf<String>("Chicago","New York","Paris", "Dubai", "Korea", "Istanbul","Toronto","Egypt","California","Antalya")

    }
}