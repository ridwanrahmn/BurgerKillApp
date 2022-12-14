package com.example.foodbeverageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val buatakuntextview = findViewById<TextView>(R.id.buatakun)
        buatakuntextview.setOnClickListener{
            startActivity(Intent(this,SignupScreen::class.java))
            finish()
        }
        btnLoginListener()
    }
    private fun btnLoginListener(){
        btn_login.setOnClickListener{
            startActivity(Intent(this,MenuScreenFood::class.java))
            finish()
        }
    }
}