package com.mysfk.android

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement


class aboutUsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)


        val toolbar: Toolbar = findViewById(R.id.my_toolbar)
        setSupportActionBar(toolbar)

        toolbar.setNavigationOnClickListener {
            super.onBackPressed();
        }
        val call = findViewById<TextView>(R.id.calladmin)
        val update = findViewById<TextView>(R.id.update)
        val sendLog = findViewById<TextView>(R.id.reportText)
        call.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.call_icon, 0);
        update.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.update_logo, 0);
        sendLog.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.report_icon, 0);
        call.setOnClickListener {
            val calls = Intent(Intent.ACTION_DIAL)
            calls.setData(Uri.parse("tel:09139519536"));
            startActivity(calls)
        }
        update.setOnClickListener {

            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://mysfk.com/sabrinahamrah/"))
            startActivity(browserIntent)

        }

        val sendReport = findViewById<Button>(R.id.sendReport)
        sendReport.setOnClickListener {


            val subject = findViewById<EditText>(R.id.subject)
            val dis = findViewById<EditText>(R.id.disc)
            val email = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:alidamiri@gmail.com")
                putExtra(Intent.EXTRA_SUBJECT, "$subject")
                putExtra(Intent.EXTRA_TEXT, "$dis")
            }
            startActivity(email)
        }


    }
}