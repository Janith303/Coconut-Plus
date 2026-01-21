package com.example.coconutplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SinupSucces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sinup_succes)

        var btn_regok: Button =findViewById(R.id.btn_regok)
        btn_regok.setOnClickListener {
            val sinok = Intent(this,Onboard1::class.java)
            startActivity(sinok)
        }

    }
}