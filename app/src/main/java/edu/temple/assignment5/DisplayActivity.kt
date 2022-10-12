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

                var button: Button = findViewById(R.id._button)
                var placeName: TextView = findViewById(R.id._placeName)
                var placeImage: ImageView = findViewById(R.id._placeImage)


        val answer = intent.extras!!.getInt("SelectedImage1")
            placeImage.setImageResource(answer)

        val answer2 = intent.extras!!.getInt("SelectedImage2")
            placeImage.setImageResource(answer2)


//        var selectedNumber = 1
//        if (intent.extras != null) {
//            selectedNumber = intent.extras!!.getInt("SelectedImage")
//        }
////
//        when (selectedNumber) {
//            1 -> {R.drawable.dubai}
//        }
//
//        placeImage.setImageResource(selectedNumber)
////
////        placeName.text = name;
////        selectedNumber.setImageResource(image)






//        val name: String
//        val bundle = intent.extras
//        if (bundle != null) {
//            name = bundle.getInt("chicago").toString()
//        }


        }
//
//
//       val intent = Intent(this, SelectionActivity::class.java)
//      intent.putExtra("place", name)
//     startActivity(intent)
        }
