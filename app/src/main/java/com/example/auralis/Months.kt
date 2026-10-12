package com.example.auralis

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Months : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_months)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.months)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Button click to go to tips page
        val nextPageBtn = findViewById<View>(R.id.nav_home)
        nextPageBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //  Button click to go to months  page
        val nextPageBtn2 = findViewById<View>(R.id.nav_tips)
        nextPageBtn2.setOnClickListener {
            val intent = Intent(this, Tips::class.java)
            startActivity(intent)
        }
        // Button click to go to profile page
        val nextPageBtn3 = findViewById<View>(R.id.nav_profile)
        nextPageBtn3.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        // Button click to go to profile page
        val nextPageBtn4 = findViewById<View>(R.id.january)
        nextPageBtn4.setOnClickListener {
            val intent = Intent(this, January_month::class.java)
            startActivity(intent)
        }
    }
}