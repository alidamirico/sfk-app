package com.mysfk.android

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class fanPadsActivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_fan_pads)

        radioGroup1 = findViewById(R.id.radioGroup1)
        button1 = findViewById(R.id.sendButton1)
        val reset1 = findViewById<RadioButton>(R.id.reset1)
        val auto1 = findViewById<RadioButton>(R.id.automatic1)
        var mamual1 = findViewById<RadioButton>(R.id.manual1)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number",null)

        var  pomp = findViewById<ToggleButton>(R.id.option11)
        pomp.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual1.isChecked = true }
            else{ mamual1.isChecked = true }
        }
        var  fan1 = findViewById<ToggleButton>(R.id.option21)
        fan1.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual1.isChecked = true }
            else{ mamual1.isChecked = true}
        }
        var  fan2 = findViewById<ToggleButton>(R.id.option31)
        fan2.setOnCheckedChangeListener { _, isChecked ->
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
                    val message = "#9906011"
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
                    val message = "#9906012"
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
                if (pomp.isChecked == true && fan1.isChecked == false && fan2.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906013100"
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
                } else if ( pomp.isChecked == false && fan1.isChecked == true && fan2.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906013010"
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

                }else if ( pomp.isChecked == false && fan1.isChecked == false && fan2.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906013001"
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
                } else if( pomp.isChecked == false && fan1.isChecked == true && fan2.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906013011"
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
                }else if( pomp.isChecked == true && fan1.isChecked == false && fan2.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906013101"
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
                } else if( pomp.isChecked == true && fan1.isChecked == true && fan2.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906013110"
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
                }else if( pomp.isChecked == true && fan1.isChecked == true && fan2.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906013111"
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
                }else if( pomp.isChecked == false && fan1.isChecked == false && fan2.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906013000"
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

        var  pomp2 = findViewById<ToggleButton>(R.id.option12)
        pomp2.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual2.isChecked = true }
            else{ mamual2.isChecked = true }
        }
        var  fan12 = findViewById<ToggleButton>(R.id.option22)
        fan12.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual2.isChecked = true }
            else{ mamual2.isChecked = true}
        }
        var  fan22 = findViewById<ToggleButton>(R.id.option32)
        fan22.setOnCheckedChangeListener { _, isChecked ->
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
                    val message = "#9906021"
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
                    val message = "#9906022"
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
                if (pomp2.isChecked == true && fan12.isChecked == false && fan22.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906023100"
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
                } else if ( pomp2.isChecked == false && fan12.isChecked == true && fan22.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906023010"
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

                }else if ( pomp2.isChecked == false && fan12.isChecked == false && fan22.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906023001"
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
                } else if( pomp2.isChecked == false && fan12.isChecked == true && fan22.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906023011"
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
                }else if( pomp2.isChecked == true && fan12.isChecked == false && fan22.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906023101"
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
                } else if( pomp2.isChecked == true && fan12.isChecked == true && fan22.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906023110"
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
                }else if( pomp2.isChecked == true && fan12.isChecked == true && fan22.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906023111"
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
                }else if( pomp2.isChecked == false && fan12.isChecked == false && fan22.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906023000"
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

        var  pomp3 = findViewById<ToggleButton>(R.id.option13)
        pomp3.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual3.isChecked = true }
            else{ mamual3.isChecked = true }
        }
        var  fan13 = findViewById<ToggleButton>(R.id.option23)
        fan13.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual3.isChecked = true }
            else{ mamual3.isChecked = true}
        }
        var  fan23 = findViewById<ToggleButton>(R.id.option33)
        fan23.setOnCheckedChangeListener { _, isChecked ->
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
                    val message = "#9906031"
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
                    val message = "#9906032"
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
                if (pomp3.isChecked == true && fan13.isChecked == false && fan23.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906033100"
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
                } else if ( pomp3.isChecked == false && fan13.isChecked == true && fan23.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906033010"
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

                }else if ( pomp3.isChecked == false && fan13.isChecked == false && fan23.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906033001"
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
                } else if( pomp3.isChecked == false && fan13.isChecked == true && fan23.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906033011"
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
                }else if( pomp3.isChecked == true && fan13.isChecked == false && fan23.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906033101"
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
                } else if( pomp3.isChecked == true && fan13.isChecked == true && fan23.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906033110"
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
                }else if( pomp3.isChecked == true && fan13.isChecked == true && fan23.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906033111"
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
                }else if( pomp3.isChecked == false && fan13.isChecked == false && fan23.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906033000"
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

        var  pomp4 = findViewById<ToggleButton>(R.id.option14)
        pomp4.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual4.isChecked = true }
            else{ mamual4.isChecked = true }
        }
        var  fan14 = findViewById<ToggleButton>(R.id.option24)
        fan14.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual4.isChecked = true }
            else{ mamual4.isChecked = true}
        }
        var  fan24 = findViewById<ToggleButton>(R.id.option34)
        fan24.setOnCheckedChangeListener { _, isChecked ->
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
                    val message = "#9906041"
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
                    val message = "#9906042"
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
                if (pomp4.isChecked == true && fan14.isChecked == false && fan24.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906043100"
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
                } else if ( pomp4.isChecked == false && fan14.isChecked == true && fan24.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906043010"
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

                }else if ( pomp4.isChecked == false && fan14.isChecked == false && fan24.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906043001"
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
                } else if( pomp4.isChecked == false && fan14.isChecked == true && fan24.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906043011"
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
                }else if( pomp4.isChecked == true && fan14.isChecked == false && fan24.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906043101"
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
                } else if( pomp4.isChecked == true && fan14.isChecked == true && fan24.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906043110"
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
                }else if( pomp4.isChecked == true && fan14.isChecked == true && fan24.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906043111"
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
                }else if( pomp4.isChecked == false && fan14.isChecked == false && fan24.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9906043000"
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