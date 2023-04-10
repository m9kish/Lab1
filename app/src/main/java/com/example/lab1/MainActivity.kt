
package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text: TextView = findViewById<TextView>(R.id.textView)


        var button: Button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val textInput: EditText = findViewById<EditText>(R.id.inputText)
            text.text = textInput.text.toString()
        }

    }
}