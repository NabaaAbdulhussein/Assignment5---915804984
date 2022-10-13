package edu.temple.assignment5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        //to change title of activity
        val actionBar = supportActionBar
        actionBar!!.title = "Display location"

        var button: Button = findViewById(R.id._button)
        var placeName: TextView = findViewById(R.id._placeName)
        var placeImage: ImageView = findViewById(R.id._placeImage)


        val answer = intent.extras!!.getInt("SelectedImage1")
        placeImage.setImageResource(answer)

        val NameAnswer = intent.extras!!.getString("SelectedImage2")
        placeName.text = NameAnswer

        //Button to go back to previous activity
        button.setOnClickListener(){
            finish()
        }

    }
        }