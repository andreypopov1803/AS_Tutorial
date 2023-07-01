package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MethodsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.methods_of_activity)

        val linkToBack: Button = findViewById(R.id.btn_back)
        linkToBack.setOnClickListener {
            val intent = Intent(this, Methods ::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
        }
    }
}