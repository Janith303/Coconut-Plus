package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Report : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_report)

        var btn_home:ImageButton = findViewById(R.id.btn_home)
        btn_home.setOnClickListener {
            val hom = Intent(this,Home::class.java)
            startActivity(hom)
        }
    }
}