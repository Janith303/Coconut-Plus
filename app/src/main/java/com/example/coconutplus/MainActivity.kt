package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btn_reg:Button=findViewById(R.id.btn_reg)
        btn_reg.setOnClickListener {
            val intent = Intent(this,Singup::class.java)
            startActivity(intent)
        }

        var btn_log:Button=findViewById(R.id.btn_log)
        btn_log.setOnClickListener {
            val log = Intent(this,Home::class.java)
            startActivity(log)
        }
    }
}