package edu.temple.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        var button: Button = findViewById(R.id._button)
        var placeName: TextView = findViewById(R.id._placeName)
        var placeImage: ImageView = findViewById(R.id._placeImage)

    }
}