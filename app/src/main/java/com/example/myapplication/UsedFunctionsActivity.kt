package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UsedFunctionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.used_functions)

        val linkToBack: Button = findViewById(R.id.btn_back)
        linkToBack.setOnClickListener {
            val intent = Intent(this, Functions ::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
        }
    }
}