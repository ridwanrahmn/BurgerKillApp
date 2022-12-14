package com.example.foodbeverageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_signup_screen.*

class SignupScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen)

        val buttonbackview = findViewById<ImageButton>(R.id.buttonback)
        buttonbackview.setOnClickListener {
            startActivity(Intent(this, LoginScreen::class.java))
            finish()
        }

        btnSignupListener()
    }
    private fun btnSignupListener(){
        btn_signup.setOnClickListener{
            startActivity(Intent(this,LoginScreen::class.java))
            finish()
        }
    }
}