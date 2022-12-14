package com.example.foodbeverageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class OpeningScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opening_screen)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}