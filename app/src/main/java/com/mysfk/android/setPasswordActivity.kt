package com.mysfk.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.mysfk.android.databinding.ActivitySetPasswordBinding
import com.mysfk.android.databinding.ActivitySetnumberBinding

class setPasswordActivity : AppCompatActivity() {

    lateinit var binding: ActivitySetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPeref = getSharedPreferences("setpassword", MODE_PRIVATE)
        val editor = sharedPeref.edit()

        binding.apply {
            savePassBtn.setOnClickListener {
                val psfind =setPasswordText.text.toString()
                editor.apply(){
                    putString("password", psfind)
                    apply()
                }
                Toast.makeText(applicationContext, "رمز عبور با موفقیت تغییر کرد ✅", Toast.LENGTH_LONG).show()
                finish()

        }
    }
 }
}