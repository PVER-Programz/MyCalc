package com.pver.mycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import androidx.compose.ui.semantics.text
import kotlin.text.append

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView: TextView = findViewById(R.id.myTextView)
        val myButton: Button = findViewById(R.id.myButton)
        val editTextText: EditText = findViewById(R.id.editTextText)

        val buttons = listOf(
            findViewById<Button>(R.id.button1),
            findViewById<Button>(R.id.button2),
            findViewById<Button>(R.id.button3),
            findViewById<Button>(R.id.button4),
            findViewById<Button>(R.id.button5),
            findViewById<Button>(R.id.button6),
            findViewById<Button>(R.id.button7),
            findViewById<Button>(R.id.button8),
            findViewById<Button>(R.id.button9)
        )

        for (x in buttons){
            x.setOnClickListener {
                editTextText.append(x.text)
            }
        }


        myButton.setOnClickListener {
            myTextView.text = "Hello, My name is PVER.!"
            Toast.makeText(this, myTextView.text, Toast.LENGTH_SHORT).show()
        }

//        button9.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
//        }
    }
}
