package edu.temple.assignment5

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        var button: Button = findViewById(R.id._button)
        var placeName: TextView = findViewById(R.id._placeName)
        var placeImage: ImageView = findViewById(R.id._placeImage)

        val imagevalue: Int
        //placeImage.setImageResource(imageList);
        val bundle = intent.extras

        if (bundle != null) {
            imagevalue = bundle.getInt("image");
        }
    }
}