package com.example.foodbeverageapp

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class FoodSixScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_six_screen)

        val buttonbackview = findViewById<ImageButton>(R.id.buttonback)
        buttonbackview.setOnClickListener {
            startActivity(Intent(this, MenuScreenFood::class.java))
            finish()
        }
        val btn_order = findViewById<Button>(R.id.btn_order)
        btn_order.setOnClickListener{
            val dialogBinding = layoutInflater.inflate(R.layout.popup_dialog,null)
            val mydialog = Dialog(this)
            mydialog.setContentView(dialogBinding)

            mydialog.setCancelable(true)
            mydialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialog.show()

            val btn_yes = dialogBinding.findViewById<Button>(R.id.btn_yes)
            btn_yes.setOnClickListener{
                mydialog.dismiss()
            }
        }
    }
}