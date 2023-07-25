package com.mysfk.android

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.*
import androidx.appcompat.app.AlertDialog

class charkheshiActivity : AppCompatActivity() {
    var radioGroup1: RadioGroup? = null
    lateinit var radioButton1: RadioButton
    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charkheshi)

        radioGroup1 = findViewById(R.id.radioGroup1)
        button1 = findViewById(R.id.sendButton1)
        val reset1 = findViewById<RadioButton>(R.id.reset1)
        val auto1 = findViewById<RadioButton>(R.id.automatic1)
        var mamual1 = findViewById<RadioButton>(R.id.manual1)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number", null)

        var fan = findViewById<ToggleButton>(R.id.option11)
        fan.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual1.isChecked = true
            } else {
                mamual1.isChecked = true
            }
        }

        val items = listOf("فن چرخشی اول", "فن چرخشی دوم", "فن چرخشی سوم", "فن چرخشی چهارم")
        val spinner = findViewById<AutoCompleteTextView>(R.id.dropDown)
        spinner.isFocusable = false
        val adapter = ArrayAdapter(this, R.layout.dropdown_items, items)
        adapter.setDropDownViewResource(R.layout.dropdown_items)
        spinner.setAdapter(adapter)

        var Itemselected = ""

        button1.setOnClickListener {
            val position = spinner.text.toString()
            when (position) {
                "فن چرخشی اول" -> {
                    Itemselected = "01"
                }

                "فن چرخشی دوم" -> {
                    Itemselected = "02"

                }

                "فن چرخشی سوم" -> {
                    Itemselected = "03"

                }

                "فن چرخشی چهارم" -> {
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
                        val message = "#9908${Itemselected}1"
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
                        val message = "#9908${Itemselected}2"
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
                } else if (radioButton1 == mamual1) {
                    if (fan.isChecked == true) {
                        val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                        builder.setTitle(radioButton1.text)
                        builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                        builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                            val message = "#9908${Itemselected}31"
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
                    } else if (fan.isChecked == false) {
                        val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                        builder.setTitle(radioButton1.text)
                        builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                        builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                            val message = "#9908${Itemselected}30"
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

                    }
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
