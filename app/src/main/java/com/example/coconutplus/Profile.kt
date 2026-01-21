package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        var btn_back_h:ImageButton = findViewById(R.id.btn_back_h)
        btn_back_h.setOnClickListener {
            val back = Intent(this,Home::class.java)
            startActivity(back)
        }

        var btn_lout:Button = findViewById(R.id.btn_lout)
        btn_lout.setOnClickListener {
            val out= Intent(this,MainActivity::class.java)
            startActivity(out)
        }
    }
}