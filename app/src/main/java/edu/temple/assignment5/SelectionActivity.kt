package edu.temple.assignment5

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SelectionActivity : AppCompatActivity() {

    lateinit var placeName: TextView
    lateinit var placeImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)

        //using grid layout manager and adding 5 images per row
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        //placeName = findViewById(R.id._placeName)
        //placeImage = findViewById(R.id._placeImage)

        //images list for pictures
        val imageList = listOf<Int>(
            R.drawable.chicago, R.drawable.nyc, R.drawable.paris, R.drawable.dubai,
            R.drawable.korea, R.drawable.istanbul, R.drawable.toronto, R.drawable.egypt, R.drawable.california, R.drawable.antalya)
        //image names
        val placeName = listOf<String>("Chicago","New York","Paris", "Dubai", "Korea", "Istanbul","Toronto","Egypt","California","Antalya")

        //custom adapter called image adapter
        recyclerView.adapter = ImageAdapter(this, imageList, placeName, this)
    }

        //function for text to show name of image
        fun onImageClicked(name: String, image: Int)
        {
            //image is clicked in recycler view, selected image and text
            //placeName.text = name;
            //placeImage.setImageResource(image)

            val intent = Intent(this@SelectionActivity, DisplayActivity::class.java)
            startActivity(intent)
        }
}