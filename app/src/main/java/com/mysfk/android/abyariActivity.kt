package com.mysfk.android

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class abyariActivity : AppCompatActivity() {
    var radioGroup1: RadioGroup? = null
    lateinit var radioButton1: RadioButton
    private lateinit var button1: Button

    var radioGroup2: RadioGroup? = null
    lateinit var radioButton2: RadioButton
    private lateinit var button2: Button

    var radioGroup3: RadioGroup? = null
    lateinit var radioButton3: RadioButton
    private lateinit var button3: Button

    var radioGroup4: RadioGroup? = null
    lateinit var radioButton4: RadioButton
    private lateinit var button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abyari)

        radioGroup1 = findViewById(R.id.radioGroup1)
        button1 = findViewById(R.id.sendButton1)
        val reset1 = findViewById<RadioButton>(R.id.reset1)
        val auto1 = findViewById<RadioButton>(R.id.automatic1)
        var mamual1 = findViewById<RadioButton>(R.id.manual1)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number", null)

        var shirbarghiA1 = findViewById<ToggleButton>(R.id.option11)
        shirbarghiA1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual1.isChecked = true
            } else {
                mamual1.isChecked = true
            }
        }
        var shirbarghiB1 = findViewById<ToggleButton>(R.id.option21)
        shirbarghiB1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual1.isChecked = true
            } else {
                mamual1.isChecked = true
            }
        }

        button1.setOnClickListener {
            val selectedOption: Int = radioGroup1!!.checkedRadioButtonId
            radioButton1 = findViewById(selectedOption)
            if (radioButton1 == reset1) {
                val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                builder.setTitle(radioButton1.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9907011"
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
                    val message = "#9907012"
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
                if (shirbarghiA1.isChecked == false && shirbarghiB1.isChecked == false) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990701300"
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

                } else if (shirbarghiA1.isChecked == true && shirbarghiB1.isChecked == false) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990701310"
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

                } else if (shirbarghiA1.isChecked == false && shirbarghiB1.isChecked == true) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990701301"
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
                } else if (shirbarghiA1.isChecked == true && shirbarghiB1.isChecked == true) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990701311"
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
        }


        radioGroup2 = findViewById(R.id.radioGroup2)
        button2 = findViewById(R.id.sendButton2)
        val reset2 = findViewById<RadioButton>(R.id.reset2)
        val auto2 = findViewById<RadioButton>(R.id.automatic2)
        var mamual2 = findViewById<RadioButton>(R.id.manual2)

        var shirbarghiA2 = findViewById<ToggleButton>(R.id.option12)
        shirbarghiA2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual2.isChecked = true
            } else {
                mamual2.isChecked = true
            }
        }
        var shirbarghiB2 = findViewById<ToggleButton>(R.id.option22)
        shirbarghiB2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual2.isChecked = true
            } else {
                mamual2.isChecked = true
            }
        }

        button2.setOnClickListener {
            val selectedOption: Int = radioGroup2!!.checkedRadioButtonId
            radioButton2 = findViewById(selectedOption)
            if (radioButton2 == reset2) {
                val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                builder.setTitle(radioButton2.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9907021"
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
            } else if (radioButton2 == auto2) {
                val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                builder.setTitle(radioButton2.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9907022"
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
            } else if (radioButton2 == mamual2) {
                if (shirbarghiA2.isChecked == false && shirbarghiB2.isChecked == false) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990702300"
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
                } else if (shirbarghiA2.isChecked == true && shirbarghiB2.isChecked == false) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990702310"
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

                } else if (shirbarghiA2.isChecked == false && shirbarghiB2.isChecked == true) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990702301"
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
                } else if (shirbarghiA2.isChecked == true && shirbarghiB2.isChecked == true) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990702311"
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
        }

        radioGroup3 = findViewById(R.id.radioGroup3)
        button3 = findViewById(R.id.sendButton3)
        val reset3 = findViewById<RadioButton>(R.id.reset3)
        val auto3 = findViewById<RadioButton>(R.id.automatic3)
        var mamual3 = findViewById<RadioButton>(R.id.manual3)

        var shirbarghiA3 = findViewById<ToggleButton>(R.id.option13)
        shirbarghiA3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual3.isChecked = true
            } else {
                mamual3.isChecked = true
            }
        }
        var shirbarghiB3 = findViewById<ToggleButton>(R.id.option23)
        shirbarghiB3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual3.isChecked = true
            } else {
                mamual3.isChecked = true
            }
        }

        button3.setOnClickListener {
            val selectedOption: Int = radioGroup3!!.checkedRadioButtonId
            radioButton3 = findViewById(selectedOption)
            if (radioButton3 == reset3) {
                val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                builder.setTitle(radioButton3.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9907031"
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
            } else if (radioButton3 == auto3) {
                val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                builder.setTitle(radioButton3.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9907032"
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
            } else if (radioButton3 == mamual3) {
                if (shirbarghiA3.isChecked == false && shirbarghiB3.isChecked == false) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990703300"
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
                } else if (shirbarghiA3.isChecked == true && shirbarghiB3.isChecked == false) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990703310"
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

                } else if (shirbarghiA3.isChecked == false && shirbarghiB3.isChecked == true) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990703301"
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
                } else if (shirbarghiA3.isChecked == true && shirbarghiB3.isChecked == true) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990703311"
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
        }

        radioGroup4 = findViewById(R.id.radioGroup4)
        button4 = findViewById(R.id.sendButton4)
        val reset4 = findViewById<RadioButton>(R.id.reset4)
        val auto4 = findViewById<RadioButton>(R.id.automatic4)
        var mamual4 = findViewById<RadioButton>(R.id.manual4)

        var shirbarghiA4 = findViewById<ToggleButton>(R.id.option14)
        shirbarghiA4.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual4.isChecked = true
            } else {
                mamual4.isChecked = true
            }
        }
        var shirbarghiB4 = findViewById<ToggleButton>(R.id.option24)
        shirbarghiB4.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                mamual4.isChecked = true
            } else {
                mamual4.isChecked = true
            }
        }

        button4.setOnClickListener {
            val selectedOption: Int = radioGroup4!!.checkedRadioButtonId
            radioButton4 = findViewById(selectedOption)
            if (radioButton4 == reset4) {
                val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                builder.setTitle(radioButton4.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9907041"
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
            } else if (radioButton4 == auto4) {
                val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                builder.setTitle(radioButton4.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9907042"
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
            } else if (radioButton4 == mamual4) {
                if (shirbarghiA4.isChecked == false && shirbarghiB4.isChecked == false) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990704300"
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
                } else if (shirbarghiA4.isChecked == true && shirbarghiB4.isChecked == false) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990704310"
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

                } else if (shirbarghiA4.isChecked == false && shirbarghiB4.isChecked == true) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990704301"
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
                } else if (shirbarghiA4.isChecked == true && shirbarghiB4.isChecked == true) {
                    val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990704311"
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
        }


    }
}