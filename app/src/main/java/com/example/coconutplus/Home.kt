package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        var btn_report:ImageButton = findViewById(R.id.btn_report)
        btn_report.setOnClickListener {
            val rep = Intent(this,Report::class.java)
            startActivity(rep)
        }

        val btn_noty:ImageButton = findViewById(R.id.btn_noty)
        btn_noty.setOnClickListener {
            val menu = Intent(this,Profile::class.java)
            startActivity(menu)
        }

        val btn_c_count:ImageButton = findViewById(R.id.btn_c_count)
        btn_c_count.setOnClickListener {
            val count = Intent(this,Coconut::class.java)
            startActivity(count)
        }
    }
}