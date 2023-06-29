package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);

        val linkToTextView: TextView = findViewById(R.id.link_to_textview)

        linkToTextView.setOnClickListener {
            val intent = Intent(this, TextViewAttributesActivity::class.java)
            startActivity(intent)
        }
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);




    }

}