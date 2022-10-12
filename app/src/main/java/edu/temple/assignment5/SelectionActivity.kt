package edu.temple.assignment5

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
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
        fun onImageClicked(name: String)
        {
            val intent = Intent(this@SelectionActivity, DisplayActivity::class.java)
            intent.putExtra("SelectedImage1", R.drawable.chicago)
            intent.putExtra("SelectedImage2", R.drawable.nyc)
//            intent.putExtra("SelectedImage3", R.drawable.paris)
//            intent.putExtra("SelectedImage4", R.drawable.dubai)
//            intent.putExtra("SelectedImage5", R.drawable.korea)
//            intent.putExtra("SelectedImage6", R.drawable.istanbul)
//            intent.putExtra("SelectedImage7", R.drawable.toronto)
//            intent.putExtra("SelectedImage8", R.drawable.egypt)
//            intent.putExtra("SelectedImage9", R.drawable.california)
//            intent.putExtra("SelectedImage10", R.drawable.antalya)
            startActivity(intent)


        }
}