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
        setContentView(R.layout.activity_dariche)

        radioGroup1 = findViewById(R.id.radioGroupD1)
        button1 = findViewById(R.id.sendButtonD1)
        val reset1 = findViewById<RadioButton>(R.id.resetD1)
        val auto1 = findViewById<RadioButton>(R.id.autoD1)
        var manual1 = findViewById<RadioButton>(R.id.manualD1)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number",null)
        val seekBar1 =findViewById<SeekBar>(R.id.seekBarD1)
        val textseekbar =findViewById<TextView>(R.id.showProgressD1)
        seekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textseekbar.text ="0"+p1.toString()+"0"
                if (textseekbar.text == "0100"){
                    textseekbar.text =p1.toString()+"0"}
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                manual1.isChecked = true

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })


        button1.setOnClickListener {
            val selectedOption: Int = radioGroup1!!.checkedRadioButtonId
            radioButton1 = findViewById(selectedOption)
            if (radioButton1 == reset1){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton1.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9904011"
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
                    val message = "#9904012"
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
            } else if (radioButton1 == manual1){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton1.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9904013"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message+textseekbar.text, null, null)
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

        radioGroup2 = findViewById(R.id.radioGroupD2)
        button2 = findViewById(R.id.sendButtonD2)
        val reset2 = findViewById<RadioButton>(R.id.resetD2)
        val auto2 = findViewById<RadioButton>(R.id.autoD2)
        var manual2 = findViewById<RadioButton>(R.id.manualD2)
        val seekBar2 =findViewById<SeekBar>(R.id.seekBarD2)
        val textseekbar2 =findViewById<TextView>(R.id.showProgressD2)
        seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textseekbar2.text ="0"+p1.toString()+"0"
                if (textseekbar2.text == "0100"){
                    textseekbar2.text =p1.toString()+"0"}
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                manual2.isChecked = true

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })


        button2.setOnClickListener {
            val selectedOption: Int = radioGroup2!!.checkedRadioButtonId
            radioButton2 = findViewById(selectedOption)
            if (radioButton2 == reset2){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton2.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9904021"
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
                    val message = "#9904022"
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
            } else if (radioButton2 == manual2){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton2.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9904023"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message+textseekbar2.text, null, null)
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

        radioGroup3 = findViewById(R.id.radioGroupD3)
        button3 = findViewById(R.id.sendButtonD3)
        val reset3 = findViewById<RadioButton>(R.id.resetD3)
        val auto3 = findViewById<RadioButton>(R.id.autoD3)
        var manual3 = findViewById<RadioButton>(R.id.manualD3)
        val seekBar3 =findViewById<SeekBar>(R.id.seekBarD3)
        val textseekbar3 =findViewById<TextView>(R.id.showProgressD3)
        seekBar3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textseekbar3.text ="0"+p1.toString()+"0"
                if (textseekbar3.text == "0100"){
                    textseekbar3.text =p1.toString()+"0"}
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                manual3.isChecked = true

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })


        button3.setOnClickListener {
            val selectedOption: Int = radioGroup3!!.checkedRadioButtonId
            radioButton3 = findViewById(selectedOption)
            if (radioButton3 == reset3){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton3.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9904031"
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
                    val message = "#9904032"
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
            } else if (radioButton3 == manual3){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton3.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9904033"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message+textseekbar3.text, null, null)
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

        radioGroup4 = findViewById(R.id.radioGroupD4)
        button4 = findViewById(R.id.sendButtonD4)
        val reset4 = findViewById<RadioButton>(R.id.resetD4)
        val auto4 = findViewById<RadioButton>(R.id.autoD4)
        var manual4 = findViewById<RadioButton>(R.id.manualD4)
        val seekBar4 =findViewById<SeekBar>(R.id.seekBarD4)
        val textseekbar4 =findViewById<TextView>(R.id.showProgressD4)
        seekBar4.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                textseekbar4.text ="0"+p1.toString()+"0"
                if (textseekbar4.text == "0100"){
                    textseekbar4.text =p1.toString()+"0"}
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                manual4.isChecked = true

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })


        button4.setOnClickListener {
            val selectedOption: Int = radioGroup4!!.checkedRadioButtonId
            radioButton4 = findViewById(selectedOption)
            if (radioButton4 == reset4){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton4.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9904041"
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
                    val message = "#9904042"
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
            } else if (radioButton4 == manual4){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton4.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9904043"
                    try {
                        val smsManager: SmsManager = SmsManager.getDefault()
                        smsManager.sendTextMessage(number, null, message+textseekbar4.text, null, null)
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