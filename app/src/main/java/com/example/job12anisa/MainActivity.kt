package com.example.job12anisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnProfile = findViewById<Button>(R.id.buttonprofile)
        val btnSmk = findViewById<Button>(R.id.buttonsmk)

        btnProfile.setOnClickListener {
            val intent = Intent(this, activity_second::class.java)
            startActivity(intent)
        }

        btnSmk.setOnClickListener {
            val intent = Intent (this, activity_third::class.java)
            startActivity(intent)
        }
    }
}