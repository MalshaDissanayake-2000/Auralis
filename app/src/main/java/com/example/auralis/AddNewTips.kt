package com.example.auralis

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddNewTips : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_new_tips)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tipsPage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //  Button click to go to months  page
        val nextPageBtn2 = findViewById<View>(R.id.nav_month)
        nextPageBtn2.setOnClickListener {
            val intent = Intent(this, Months::class.java)
            startActivity(intent)
        }
        // Button click to go to profile page
        val nextPageBtn3 = findViewById<View>(R.id.nav_profile)
        nextPageBtn3.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        // Button click to go to tips page
        val nextPageBtn4 = findViewById<View>(R.id.nav_tips)
        nextPageBtn4.setOnClickListener {
            val intent = Intent(this, Tips::class.java)
            startActivity(intent)
        }
        // Button click to go to tips page
        val nextPageBtn5 = findViewById<View>(R.id.nav_home)
        nextPageBtn5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}