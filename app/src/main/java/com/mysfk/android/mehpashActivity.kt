package com.mysfk.android

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.*
import androidx.appcompat.app.AlertDialog

class mehpashActivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_mehpash)

        radioGroup1 = findViewById(R.id.radioGroup1)
        button1 = findViewById(R.id.sendButton1)
        val reset1 = findViewById<RadioButton>(R.id.reset1)
        val auto1 = findViewById<RadioButton>(R.id.automatic1)
        var mamual1 = findViewById<RadioButton>(R.id.manual1)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number",null)

        var  mehpash = findViewById<ToggleButton>(R.id.option11)
        mehpash.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual1.isChecked = true }
            else{ mamual1.isChecked = true }
        }
        var  movaled = findViewById<ToggleButton>(R.id.option21)
        movaled.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual1.isChecked = true }
            else{ mamual1.isChecked = true}
        }

        button1.setOnClickListener {
            val selectedOption: Int = radioGroup1!!.checkedRadioButtonId
            radioButton1 = findViewById(selectedOption)
            if (radioButton1 == reset1){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton1.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9909011"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message, null, null)
                        Toast.makeText(
                            applicationContext,
                            " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                            Toast.LENGTH_LONG
                        ).show()
                    } catch (e: Exception) {
                                                Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                    }
                }
                builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                    Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                        .show()
                }
                builder.show()
            } else if (radioButton1 == auto1) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton1.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9909012"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message, null, null)
                        Toast.makeText(
                            applicationContext,
                            " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                            Toast.LENGTH_LONG
                        ).show()
                    } catch (e: Exception) {
                                                Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                    }
                }
                builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                    Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                        .show()
                }
                builder.show()
            } else if (radioButton1 == mamual1){
                if (mehpash.isChecked == false && movaled.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990901300"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                } else if ( mehpash.isChecked == true && movaled.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990901310"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()

                }else if (mehpash.isChecked == false && movaled.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990901301"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                } else if(mehpash.isChecked == true && movaled.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990901311"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
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

        var  mehpash2 = findViewById<ToggleButton>(R.id.option12)
        mehpash2.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual2.isChecked = true }
            else{ mamual2.isChecked = true }
        }
        var  movaled2 = findViewById<ToggleButton>(R.id.option22)
        movaled2.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual2.isChecked = true }
            else{ mamual2.isChecked = true}
        }

        button2.setOnClickListener {
            val selectedOption: Int = radioGroup2!!.checkedRadioButtonId
            radioButton2 = findViewById(selectedOption)
            if (radioButton2 == reset2){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton2.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9909021"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message, null, null)
                        Toast.makeText(
                            applicationContext,
                            " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                            Toast.LENGTH_LONG
                        ).show()
                    } catch (e: Exception) {
                                                Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                    }
                }
                builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                    Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                        .show()
                }
                builder.show()
            } else if (radioButton2 == auto2) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton2.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9909022"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message, null, null)
                        Toast.makeText(
                            applicationContext,
                            " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                            Toast.LENGTH_LONG
                        ).show()
                    } catch (e: Exception) {
                                                Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                    }
                }
                builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                    Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                        .show()
                }
                builder.show()
            } else if (radioButton2 == mamual2){
                if (mehpash2.isChecked == false && movaled2.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990902300"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                } else if ( mehpash2.isChecked == true && movaled2.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990902310"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()

                }else if (mehpash2.isChecked == false && movaled2.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990902301"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                } else if(mehpash2.isChecked == true && movaled2.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990902311"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
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

        var  mehpash3 = findViewById<ToggleButton>(R.id.option13)
        mehpash3.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual3.isChecked = true }
            else{ mamual3.isChecked = true }
        }
        var  movaled3 = findViewById<ToggleButton>(R.id.option23)
        movaled3.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual3.isChecked = true }
            else{ mamual3.isChecked = true}
        }

        button3.setOnClickListener {
            val selectedOption: Int = radioGroup3!!.checkedRadioButtonId
            radioButton3 = findViewById(selectedOption)
            if (radioButton3 == reset3){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton3.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9909031"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message, null, null)
                        Toast.makeText(
                            applicationContext,
                            " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                            Toast.LENGTH_LONG
                        ).show()
                    } catch (e: Exception) {
                                                Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                    }
                }
                builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                    Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                        .show()
                }
                builder.show()
            } else if (radioButton3 == auto3) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton3.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9909032"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message, null, null)
                        Toast.makeText(
                            applicationContext,
                            " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                            Toast.LENGTH_LONG
                        ).show()
                    } catch (e: Exception) {
                                                Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                    }
                }
                builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                    Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                        .show()
                }
                builder.show()
            } else if (radioButton3 == mamual3){
                if (mehpash3.isChecked == false && movaled3.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990903300"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                } else if ( mehpash3.isChecked == true && movaled3.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990903310"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()

                }else if (mehpash3.isChecked == false && movaled3.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990903301"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                } else if(mehpash3.isChecked == true && movaled3.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990903311"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
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

        var  mehpash4 = findViewById<ToggleButton>(R.id.option14)
        mehpash4.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual4.isChecked = true }
            else{ mamual4.isChecked = true }
        }
        var  movaled4 = findViewById<ToggleButton>(R.id.option24)
        movaled4.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual4.isChecked = true }
            else{ mamual4.isChecked = true}
        }

        button4.setOnClickListener {
            val selectedOption: Int = radioGroup4!!.checkedRadioButtonId
            radioButton4 = findViewById(selectedOption)
            if (radioButton4 == reset4){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton4.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9909041"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message, null, null)
                        Toast.makeText(
                            applicationContext,
                            " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                            Toast.LENGTH_LONG
                        ).show()
                    } catch (e: Exception) {
                                                Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                    }
                }
                builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                    Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                        .show()
                }
                builder.show()
            } else if (radioButton4 == auto4) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton4.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9909042"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message, null, null)
                        Toast.makeText(
                            applicationContext,
                            " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                            Toast.LENGTH_LONG
                        ).show()
                    } catch (e: Exception) {
                                                Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                    }
                }
                builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                    Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                        .show()
                }
                builder.show()
            } else if (radioButton4 == mamual4){
                if (mehpash4.isChecked == false && movaled4.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990904300"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                } else if ( mehpash4.isChecked == true && movaled4.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990904310"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()

                }else if (mehpash4.isChecked == false && movaled4.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990904301"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                } else if(mehpash4.isChecked == true && movaled4.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990904311"
                        try {
                            val smsManager: SmsManager = SmsManager.getDefault()
                            smsManager.sendTextMessage(number, null, message, null, null)
                            Toast.makeText(
                                applicationContext,
                                " ارسال شد، لطفا برای ارسال دستور بعدی کمی صبر کنید",
                                Toast.LENGTH_LONG
                            ).show()
                        } catch (e: Exception) {
                                                    Toast.makeText(applicationContext, "لطفا  ابتدا شماره سیستم را وارد کنید !", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent (this, setnumberActivity::class.java)
                        this.startActivity(intent)
                        }
                    }
                    builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                        Toast.makeText(applicationContext, "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                            .show()
                    }
                    builder.show()
                }
            }
        }

    }
}