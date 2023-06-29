package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linkToTextView: TextView = findViewById(R.id.link_to_textview)

        linkToTextView.setOnClickListener {
            val intent = Intent(this, TextViewAttributesActivity::class.java)
            startActivity(intent)
        }
    }
}