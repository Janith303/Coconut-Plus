package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Coconut : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coconut)

        var btn_back:ImageButton = findViewById(R.id.btn_back)
        btn_back.setOnClickListener {
            val back = Intent(this,Home::class.java)
            startActivity(back)
        }

        var btn_add:Button = findViewById(R.id.btn_add)
        btn_add.setOnClickListener {
            val ok = Intent(this,CaddSucces::class.java)
            startActivity(ok)
        }

    }
}