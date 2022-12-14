package com.example.foodbeverageapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MenuScreenFood : AppCompatActivity() {
    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_screen_food)

        val buttonnextview = findViewById<ImageButton>(R.id.buttonnext1)
        buttonnextview.setOnClickListener {
            startActivity(Intent(this, FoodOneScreen::class.java))
        }
        val buttonnextview2 = findViewById<ImageButton>(R.id.buttonnext2)
        buttonnextview2.setOnClickListener {
            startActivity(Intent(this, FoodTwoScreen::class.java))
        }
        val buttonnextview3 = findViewById<ImageButton>(R.id.buttonnext3)
        buttonnextview3.setOnClickListener {
            startActivity(Intent(this, FoodThreeScreen::class.java))
        }
        val buttonnextview4 = findViewById<ImageButton>(R.id.buttonnext4)
        buttonnextview4.setOnClickListener {
            startActivity(Intent(this, FoodFourScreen::class.java))
        }
        val buttonnextview5 = findViewById<ImageButton>(R.id.buttonnext5)
        buttonnextview5.setOnClickListener {
            startActivity(Intent(this, FoodFiveScreen::class.java))
        }
        val buttonnextview6 = findViewById<ImageButton>(R.id.buttonnext6)
        buttonnextview6.setOnClickListener {
            startActivity(Intent(this, FoodSixScreen::class.java))
        }
        val buttonlogout = findViewById<ImageButton>(R.id.button_logout)
        buttonlogout.setOnClickListener {
            startActivity(Intent(this, LoginScreen::class.java))
            finish()
        }
        val buttonbeverage = findViewById<TextView>(R.id.beverage)
        buttonbeverage.setOnClickListener {
            startActivity(Intent(this, MenuScreenBeverage::class.java))
        }
    }

    override fun onBackPressed() {
        if (backPressedTime + 2000> System.currentTimeMillis()){
            super.onBackPressed()
        } else {
            Toast.makeText(applicationContext, "Press back again to exit", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}