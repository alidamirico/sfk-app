package com.mysfk.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class spinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val items = listOf("بخاری 1", "بخاری 2", "بخاری3")
        val spinner = findViewById<Spinner>(R.id.dropDown)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val button = findViewById<Button>(R.id.buttonSpinner)
        button.setOnClickListener {
            val selectedItem = spinner.selectedItem.toString()
            val position = spinner.selectedItemPosition
            if ( position == 0){
                Toast.makeText(this, "بخاری1", Toast.LENGTH_SHORT).show()

            }else if ( position == 1){
                Toast.makeText(this, "بخاری2", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "بخاری دیگه", Toast.LENGTH_SHORT).show()

            }
        }


    }
}