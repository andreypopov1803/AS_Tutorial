package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Attributes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attributes)

        val linkToTextView: TextView = findViewById(R.id.link_to_textview)

        linkToTextView.setOnClickListener {
            val intent = Intent(this, TextViewAttributesActivity::class.java)
            startActivity(intent)
        }

        val linkToButton: TextView = findViewById(R.id.link_to_button)

        linkToButton.setOnClickListener {
            val intent = Intent(this, ButtonAttributesActivity::class.java)
            startActivity(intent)
        }


        val linkToBack: Button = findViewById(R.id.btn_back)

        linkToBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
        }
    }
}