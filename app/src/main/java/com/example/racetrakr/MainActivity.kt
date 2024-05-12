package com.example.racetrakr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.PopupWindow
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var popupWindow: PopupWindow? = null

    private fun showPopupWindow() {
        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.activity_popup, null)

        popupWindow = PopupWindow(view, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, true)
        popupWindow?.showAtLocation(view, Gravity.CENTER, 0, 0)

    }
//    Favourites Button

    private var isFavouriteSelected = false
    private fun toggleFavourite(button: ImageButton) {
        isFavouriteSelected = !isFavouriteSelected
        if (isFavouriteSelected) {
            button.setImageResource(R.drawable.togglefav_active) // Replace with your selected image resource
        } else {
            button.setImageResource(R.drawable.togglefav) // Replace with your unselected image resource
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Favourites
        val favBtn = findViewById<ImageButton>(R.id.fav_btn)
        favBtn.setOnClickListener{
            toggleFavourite(favBtn)
        }

        //Popup Info Button
        val infobtn = findViewById<ImageButton>(R.id.PopupBtn)
        infobtn.setOnClickListener{
            showPopupWindow()
        }

//        F1 Activity Button
        val f1btn = findViewById<ImageButton>(R.id.f1)
        f1btn.setOnClickListener{
            val intent = Intent(this@MainActivity, F1_act::class.java)
            startActivity(intent)
        }

        //        F2 Activity Button
        val f2btn = findViewById<ImageButton>(R.id.f2)
        f2btn.setOnClickListener{
            val intent = Intent(this@MainActivity, F2_act::class.java)
            startActivity(intent)
        }

        //        F3 Activity Button
        val f3btn = findViewById<ImageButton>(R.id.f3)
        f3btn.setOnClickListener{
            val intent = Intent(this@MainActivity, F3_act::class.java)
            startActivity(intent)
        }

        //        FE Activity Button
        val febtn = findViewById<ImageButton>(R.id.fe)
        febtn.setOnClickListener{
            val intent = Intent(this@MainActivity, FE_act::class.java)
            startActivity(intent)
        }

        //        WEC Activity Button
        val wecbtn = findViewById<ImageButton>(R.id.wec)
        wecbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, WEC_act::class.java)
            startActivity(intent)
        }

        //        WRX Activity Button
        val wrxbtn = findViewById<ImageButton>(R.id.wrx)
        wrxbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, WRX_act::class.java)
            startActivity(intent)
        }

        //        IndyCar Activity Button
        val icbtn = findViewById<ImageButton>(R.id.indy)
         icbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, IC_act::class.java)
            startActivity(intent)
        }

        //        F2 Activity Button
        val nscrbtn = findViewById<ImageButton>(R.id.nascar)
        nscrbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, NSCR_act::class.java)
            startActivity(intent)
        }

    }
}