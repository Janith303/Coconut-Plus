package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CaddSucces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadd_succes)

        var btn_addok:Button = findViewById(R.id.btn_addok)
        btn_addok.setOnClickListener {
            val add =Intent(this,Coconut::class.java)
            startActivity(add)
        }
    }
}