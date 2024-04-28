package com.arcaios.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var tvMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMessage = findViewById(R.id.tvMessage)

        displayMessage("Hello World!!")
    }

    fun displayMessage(message: String) {
        tvMessage.text = message
    }
}

