package com.mysfk.android

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.app.ActivityCompat

class passwordActivity : AppCompatActivity() {

    private var listPermissions = arrayOf(
        Manifest.permission.READ_SMS,
        Manifest.permission.SEND_SMS
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        val passBtn = findViewById<Button>(R.id.pass)
        val sharedPeref = getSharedPreferences("setpassword", MODE_PRIVATE)
        val passtext = sharedPeref.getString("password","2")
        passBtn.setOnClickListener {
            if (checkPermissions()) {
                val password = passtext.toString()
                val enterPass = findViewById<EditText>(R.id.PassText)
                val ps = enterPass.text.toString()
                if (ps.trim() == password){
                    val intent = Intent (this, MainActivity::class.java)
                    this.startActivity(intent)
                    finish()
                } else {
                    val showError = findViewById<TextView>(R.id.showError)
                    showError.text ="رمز وارد شده صحیح نمی باشد ، لطفا مجددا تلاش فرمایید"
                }

            } else {
                Toast.makeText(this, "لطفا دسترسی های مورد نیاز را بدهید", Toast.LENGTH_SHORT).show()
                requestPermissions()
            }

        }

        val isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
            .getBoolean("isFirstRun", true)

        if (isFirstRun) {
            //show start activity
            startActivity(Intent(this@passwordActivity, WelcomeActivity::class.java))
        }
        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
            .putBoolean("isFirstRun", false).commit()


    }

    private fun checkPermissions(): Boolean {
        return ActivityCompat.checkSelfPermission(
            this, Manifest.permission.READ_SMS) == PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(
            this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED

    }


    private val permissionRequest = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
        val granted = permissions.entries.all {
            it.value == true
        }
        permissions.entries.forEach {
            Log.e("LOG_TAG", "${it.key} = ${it.value}")
        }

        if (granted) {
            // your code if permission granted
        } else {
            // your code if permission denied
        }
    }
    private fun requestPermissions() {

        permissionRequest.launch(listPermissions)

    }
}
