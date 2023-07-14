package com.mysfk.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.TypedValue
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.mysfk.android.databinding.ActivitySetnumberBinding


class setnumberActivity : AppCompatActivity() {
    lateinit var binding: ActivitySetnumberBinding
    lateinit var radioButton1: RadioButton
    lateinit var radioButtonselect: RadioButton

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySetnumberBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val share = getSharedPreferences("num1", MODE_PRIVATE)
        val editor = share.edit()
        val share2 = getSharedPreferences("setNumber", MODE_PRIVATE)
        val editor2 = share2.edit()

        binding.apply {
            val rdBtn = findViewById<RadioGroup>(R.id.radioGroupNums)
            val num1 = findViewById<RadioButton>(R.id.num1)
            val num2 = findViewById<RadioButton>(R.id.num2)
            val num3 = findViewById<RadioButton>(R.id.num3)
            val num4 = findViewById<RadioButton>(R.id.num4)
            val editnum = findViewById<EditText>(R.id.setNumberText)
            saveBtn.setOnClickListener {
                val selectedOption: Int = rdBtn!!.checkedRadioButtonId
                radioButton1 = findViewById(selectedOption)
                if (radioButton1 == num1){
                    val editednum= editnum.text.toString()
                    editor.apply(){
                    putString("num1", editednum)
                    apply()
                    }
                    val getText= share.getString("num1", getString(R.string.num1))
                    num1.text=getText.toString()
                    num1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)
                    rdBtn.check(selectedOption)
                }else if (radioButton1 == num2){
                    val editednum= editnum.text.toString()
                    editor.apply(){
                        putString("num2", editednum)
                        apply()
                    }
                    val getText= share.getString("num2", getString(R.string.num2))
                    num2.text=getText.toString()
                    num2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)

                }else if (radioButton1 == num3){
                    val editednum= editnum.text.toString()
                    editor.apply(){
                        putString("num3", editednum)
                        apply()
                    }
                    val getText= share.getString("num3", getString(R.string.num3))
                    num3.text=getText.toString()
                    num3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)

                }else if (radioButton1 == num4){
                    val editednum= editnum.text.toString()
                    editor.apply(){
                        putString("num4", editednum)
                        apply()
                    }
                    val getText= share.getString("num4", getString(R.string.num4))
                    num4.text=getText.toString()
                    num4.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20F)

                }
            }



            val getnum1 = share.getString("num1", getString(R.string.num1))
            num1.text=getnum1.toString()
            num1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15F)
            val getnum2= share.getString("num2", getString(R.string.num2))
            num2.text=getnum2.toString()
            num2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15F)
            val getnum3= share.getString("num3", getString(R.string.num3))
            num3.text=getnum3.toString()
            num3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15F)
            val getnum4= share.getString("num4", getString(R.string.num4))
            num4.text=getnum4.toString()
            num4.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15F)


            selectBtn.setOnClickListener {
                val selectedOption: Int = rdBtn!!.checkedRadioButtonId
                radioButtonselect = findViewById(selectedOption)
                if (radioButtonselect == num1) {
                   val num1saved = share.getString("num1", getString(R.string.num1))
                    val number =num1saved
                    editor2.apply() {
                        putString("number", number)
                        apply()
                    }
                    Toast.makeText(this@setnumberActivity, number +" "+ getString(R.string.choosenum) , Toast.LENGTH_SHORT).show()
                    rdBtn.check(num1.id)
                }else if(radioButtonselect == num2){
                    val num2saved = share.getString("num2", getString(R.string.num2))
                    val number =num2saved
                    editor2.apply() {
                        putString("number", number)
                        apply()
                    }
                    Toast.makeText(this@setnumberActivity,  number +" "+ getString(R.string.choosenum) , Toast.LENGTH_SHORT).show()
                    rdBtn.check(num2.id)
                }else if(radioButtonselect == num3){
                    val num3saved = share.getString("num3", getString(R.string.num3))
                    val number =num3saved
                    editor2.apply() {
                        putString("number", number)
                        apply()
                        rdBtn.check(num3.id)
                    }
                    Toast.makeText(this@setnumberActivity,  number +" "+ getString(R.string.choosenum)  , Toast.LENGTH_SHORT).show()
                }else if(radioButtonselect == num4){
                    val num4saved = share.getString("num4", getString(R.string.num4))
                    val number =num4saved
                    editor2.apply() {
                        putString("number", number)
                        apply()
                    }
                    Toast.makeText(this@setnumberActivity,  number +" "+ getString(R.string.choosenum) , Toast.LENGTH_SHORT).show()
                }
                finish()
            }

            val getText= share2.getString("number", getString(R.string.shownumdef))
            val text1 = findViewById<TextView>(R.id.selectText)
            text1.text = getText
            text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15F)

            if (text1.text == num1.text){
                rdBtn.check(num1.id)
            } else if (text1.text == num2.text){
                rdBtn.check(num2.id)
            }else if (text1.text == num3.text){
                rdBtn.check(num3.id)
            }else if (text1.text == num4.text){
                rdBtn.check(num4.id)
            }
        }
    }
}