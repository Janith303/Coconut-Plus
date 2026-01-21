package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard1)

        var btn_next: Button = findViewById(R.id.btn_next)
        btn_next.setOnClickListener {
            val next = Intent(this,Onboard2::class.java)
            startActivity(next)
            //overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)

        }

    }
}