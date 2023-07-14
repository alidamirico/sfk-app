package com.mysfk.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class numberShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_show)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val text1 = findViewById<TextView>(R.id.textTest)
        val btn = findViewById<Button>(R.id.buttonL)
        //btn.setOnClickListener {
        val getText= sharedPeref.getString("number",null)
            text1.text = getText
       // }
    }
}