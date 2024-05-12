package com.example.racetrakr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

private var isFavouriteSelected = false
private fun toggleFavourite(button: ImageButton) {
    isFavouriteSelected = !isFavouriteSelected
    if (isFavouriteSelected) {
        button.setImageResource(R.drawable.fav_blackred) // Replace with your selected image resource
    } else {
        button.setImageResource(R.drawable.fav_blackwhite) // Replace with your unselected image resource
    }
}

class F1_act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f1)
        val backbtn = findViewById<ImageButton>(R.id.backbtn)
        backbtn.setOnClickListener {
            finish()
        }

        val favbtn = findViewById<ImageButton>(R.id.fav_btn)
        favbtn.setOnClickListener {
            toggleFavourite(favbtn)
        }

    }
}