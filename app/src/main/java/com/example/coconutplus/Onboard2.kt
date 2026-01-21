package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard2)

        var btn_next1: Button = findViewById(R.id.btn_next1)
        btn_next1.setOnClickListener {
            val next1 = Intent(this,MainActivity::class.java)
            startActivity(next1)
        }
    }
}