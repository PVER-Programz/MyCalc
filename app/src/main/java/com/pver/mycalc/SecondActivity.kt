package com.pver.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack: TextView = findViewById(R.id.textView)

        btnBack.setOnClickListener {
            finish()
        }

        Toast.makeText(this, "Welcome to Second Activity!", Toast.LENGTH_SHORT).show()
    }
}
