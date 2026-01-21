package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Singup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_singup)

        var btn_sinup:Button=findViewById(R.id.btn_sinup)
        btn_sinup.setOnClickListener {
            val sin = Intent(this,SinupSucces::class.java)
            startActivity(sin)
        }
    }
}