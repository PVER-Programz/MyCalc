package com.pver.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // UI Elements
        val myButton: Button = findViewById(R.id.myButton)
        val myTextView: TextView = findViewById(R.id.myTextView)

        myButton.setOnClickListener {
            myTextView.text = "Hello, My name is PVER.!"
            Toast.makeText(this, myTextView.text, Toast.LENGTH_SHORT).show()
        }
    }
}
