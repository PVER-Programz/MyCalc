package com.pver.mycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder
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
            findViewById<Button>(R.id.button0),
            findViewById<Button>(R.id.button1),
            findViewById<Button>(R.id.button2),
            findViewById<Button>(R.id.button3),
            findViewById<Button>(R.id.button4),
            findViewById<Button>(R.id.button5),
            findViewById<Button>(R.id.button6),
            findViewById<Button>(R.id.button7),
            findViewById<Button>(R.id.button8),
            findViewById<Button>(R.id.button9),
            findViewById<Button>(R.id.buttonPlus),
            findViewById<Button>(R.id.buttonMin),
            findViewById<Button>(R.id.buttonMul),
            findViewById<Button>(R.id.buttonDiv)
        )

        for (x in buttons){
            x.setOnClickListener {
                editTextText.append(x.text)
            }
        }


        myButton.setOnClickListener {
//            myTextView.text = "Hello, My name is always PVER.!"
//            Toast.makeText(this, myTextView.text, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val buttonClr = findViewById<Button>(R.id.buttonClr)
        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonClr.setOnClickListener {
            editTextText.setText("")
        }
        buttonBack.setOnClickListener {
            editTextText.setText(editTextText.text.dropLast(1))
        }

        val buttonEqual = findViewById<Button>(R.id.buttonEqual)
        buttonEqual.setOnClickListener {
            val expression = ExpressionBuilder(editTextText.text.toString()).build()
            val result = expression.evaluate()
            editTextText.setText(result.toString())
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
        }
    }
}
