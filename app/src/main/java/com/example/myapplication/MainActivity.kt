package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Log.d("MyLogMainAct", "onCreate" )
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLogMainAct", "onStart" )
    }

    override fun onResume() {
        super.onResume()

        setContentView(R.layout.activity_main)

        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);

        val linkToAttributes: TextView = findViewById(R.id.link_to_attributes)

        linkToAttributes.setOnClickListener {
            val intent = Intent(this, Attributes::class.java)
            startActivity(intent)
        }
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);

        val linkToFunction: TextView = findViewById(R.id.link_to_function)

        linkToFunction.setOnClickListener {
            val intent = Intent(this, Methods::class.java)
            startActivity(intent)
        }
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);

        Log.d("MyLogMainAct", "onResume" )
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogMainAct", "onPause" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMainAct", "onDestroy" )
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMainAct", "onStop" )
    }

    override fun onRestart() {
        super.onRestart()


//        val test = findViewById<TextView>(R.id.textView2)
//        test.text = "Вы вернулись"

        Log.d("MyLogMainAct", "onRestart" )
    }
}