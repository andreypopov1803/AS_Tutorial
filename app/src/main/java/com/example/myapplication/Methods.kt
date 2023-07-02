package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Methods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.methods)

        Log.d("MyLogMethods", "onCreate" )


    }

    override fun onStart() {
        super.onStart()


        Log.d("MyLogMethods", "onStart" )
    }

    override fun onResume() {
        super.onResume()

        val linkToUsedFunctions: TextView = findViewById(R.id.link_to_usedfunctions)

        linkToUsedFunctions.setOnClickListener {
            val intent = Intent(this, MethodsActivity::class.java)
            startActivity(intent)
        }


        val linkToBack: Button = findViewById(R.id.btn_back)

        linkToBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
        }

        Log.d("MyLogMethods", "onResume" )
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogMethods", "onPause" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMethods", "onDestroy" )
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMethods", "onStop" )
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLogMethods", "onRestart" )
    }
}