package com.mysfk.android

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.*
import androidx.appcompat.app.AlertDialog

class daricheActivity : AppCompatActivity() {
    var radioGroup1: RadioGroup? = null
    lateinit var radioButton1: RadioButton
    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dariche)

        radioGroup1 = findViewById(R.id.radioGroupD1)
        button1 = findViewById(R.id.sendButtonD1)
        val reset1 = findViewById<RadioButton>(R.id.resetD1)
        val auto1 = findViewById<RadioButton>(R.id.autoD1)
        var manual1 = findViewById<RadioButton>(R.id.manualD1)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number", null)
        val seekBar1 = findViewById<SeekBar>(R.id.seekBarD1)
        val textseekbar = findViewById<TextView>(R.id.showProgressD1)
        seekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textseekbar.text = "0" + p1.toString() + "0"
                if (textseekbar.text == "0100") {
                    textseekbar.text = p1.toString() + "0"
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                manual1.isChecked = true

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        val items = listOf("دریچه اول", "دریچه دوم", "دریچه سوم", "دریچه چهارم")
        val spinner = findViewById<AutoCompleteTextView>(R.id.dropDown)
        spinner.isFocusable = false
        val adapter = ArrayAdapter(this, R.layout.dropdown_items, items)
        adapter.setDropDownViewResource(R.layout.dropdown_items)
        spinner.setAdapter(adapter)

        var Itemselected = ""


        button1.setOnClickListener {

            val position = spinner.text.toString()
            when (position) {
                "دریچه اول" -> {
                    Itemselected = "01"
                }

                "دریچه دوم" -> {
                    Itemselected = "02"

                }

                "دریچه سوم" -> {
                    Itemselected = "03"

                }

                "دریچه چهارم" -> {
                    Itemselected = "04"

                }
            }

            if (Itemselected.length == 2) {

                val selectedOption: Int = radioGroup1!!.checkedRadioButtonId
                radioButton1 = findViewById(selectedOption)
                if (radioButton1 == reset1) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9904${Itemselected}1"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                            Toast.makeText(
                                applicationContext,
                                "لطفا  ابتدا شماره سیستم را وارد کنید !",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                            val intent = Intent(this, setnumberActivity::class.java)
                            this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(
                            applicationContext,
                            "شما از ارسال دستور منصرف شدید",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    builder.show()
                } else if (radioButton1 == auto1) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9904${Itemselected}2"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                            Toast.makeText(
                                applicationContext,
                                "لطفا  ابتدا شماره سیستم را وارد کنید !",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                            val intent = Intent(this, setnumberActivity::class.java)
                            this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(
                            applicationContext,
                            "شما از ارسال دستور منصرف شدید",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    builder.show()
                } else if (radioButton1 == manual1) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9904${Itemselected}3"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(
                                number,
                                null,
                                message + textseekbar.text,
                                null,
                                null
                            )
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                            Toast.makeText(
                                applicationContext,
                                "لطفا  ابتدا شماره سیستم را وارد کنید !",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                            val intent = Intent(this, setnumberActivity::class.java)
                            this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(
                            applicationContext,
                            "شما از ارسال دستور منصرف شدید",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    builder.show()
                }


            } else {
                Toast.makeText(
                    applicationContext,
                    "لطفا یک آیتم را انتخاب کنید",
                    Toast.LENGTH_SHORT
                ).show()
            }


        }

    }
}