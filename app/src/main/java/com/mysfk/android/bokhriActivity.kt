package com.mysfk.android

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class bokhriActivity : AppCompatActivity() {
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

    var radioGroup5: RadioGroup? = null
    lateinit var radioButton5: RadioButton
    private lateinit var button5: Button

    var radioGroup6: RadioGroup? = null
    lateinit var radioButton6: RadioButton
    private lateinit var Button6: Button

    var radioGroup7: RadioGroup? = null
    lateinit var radioButton7: RadioButton
    private lateinit var Button7: Button

    var radioGroup8: RadioGroup? = null
    lateinit var radioButton8: RadioButton
    private lateinit var Button8: Button

    var radioGroup9: RadioGroup? = null
    lateinit var radioButton9: RadioButton
    private lateinit var Button9: Button

    var radioGroup10: RadioGroup? = null
    lateinit var radioButton10: RadioButton
    private lateinit var Button10: Button

    var radioGroup11: RadioGroup? = null
    lateinit var radioButton11: RadioButton
    private lateinit var Button11: Button

    var radioGroup12: RadioGroup? = null
    lateinit var radioButton12: RadioButton
    private lateinit var Button12: Button

    var radioGroup13: RadioGroup? = null
    lateinit var radioButton13: RadioButton
    private lateinit var Button13: Button

    var radioGroup14: RadioGroup? = null
    lateinit var radioButton14: RadioButton
    private lateinit var Button14: Button

    var radioGroup15: RadioGroup? = null
    lateinit var radioButton15: RadioButton
    private lateinit var Button15: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bokhri)
        radioGroup1 = findViewById(R.id.radioGroup1)
        button1 = findViewById(R.id.sendButton1)
        val reset1 = findViewById<RadioButton>(R.id.reset1)
        val auto1 = findViewById<RadioButton>(R.id.automatic1)
        var mamual1 = findViewById<RadioButton>(R.id.manual1)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number",null)

        var  mashal = findViewById<ToggleButton>(R.id.option11)
        mashal.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual1.isChecked = true }
            else{ mamual1.isChecked = true }
        }
        var  fan = findViewById<ToggleButton>(R.id.option21)
        fan.setOnCheckedChangeListener { _, isChecked ->
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
                    val message = "#9903011"
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
                    val message = "#9903012"
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
                if (mashal.isChecked == false && fan.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990301300"
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
                } else if ( mashal.isChecked == true && fan.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990301310"
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

                }else if (mashal.isChecked == false && fan.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990301301"
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
                } else if(mashal.isChecked == true && fan.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990301311"
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

        var  mashal2 = findViewById<ToggleButton>(R.id.option12)
        mashal2.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual2.isChecked = true }
            else{ mamual2.isChecked = true }
        }
        var  fan2 = findViewById<ToggleButton>(R.id.option22)
        fan2.setOnCheckedChangeListener { _, isChecked ->
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
                    val message = "#9903021"
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
                    val message = "#9903022"
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
                if (mashal2.isChecked == false && fan2.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990302300"
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
                } else if ( mashal2.isChecked == true && fan2.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990302310"
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

                }else if (mashal2.isChecked == false && fan2.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990302301"
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
                } else if(mashal2.isChecked == true && fan2.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton2.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990302311"
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

        var  mashal3 = findViewById<ToggleButton>(R.id.option13)
        mashal3.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual3.isChecked = true }
            else{ mamual3.isChecked = true }
        }
        var  fan3 = findViewById<ToggleButton>(R.id.option23)
        fan3.setOnCheckedChangeListener { _, isChecked ->
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
                    val message = "#9903031"
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
                    val message = "#9903032"
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
                if (mashal3.isChecked == false && fan3.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990303300"
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
                } else if ( mashal3.isChecked == true && fan3.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990303310"
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

                }else if (mashal3.isChecked == false && fan3.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990303301"
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
                } else if(mashal3.isChecked == true && fan3.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton3.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990303311"
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

        var  mashal4 = findViewById<ToggleButton>(R.id.option14)
        mashal4.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual4.isChecked = true }
            else{ mamual4.isChecked = true }
        }
        var  fan4 = findViewById<ToggleButton>(R.id.option24)
        fan4.setOnCheckedChangeListener { _, isChecked ->
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
                    val message = "#9903041"
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
                    val message = "#9903042"
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
                if (mashal4.isChecked == false && fan4.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990304300"
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
                } else if ( mashal4.isChecked == true && fan4.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990304310"
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

                }else if (mashal4.isChecked == false && fan4.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990304301"
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
                } else if(mashal4.isChecked == true && fan4.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton4.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990304311"
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

        radioGroup5 = findViewById(R.id.radioGroup5)
        button5 = findViewById(R.id.sendButton5)
        val reset5 = findViewById<RadioButton>(R.id.reset5)
        val auto5 = findViewById<RadioButton>(R.id.automatic5)
        var mamual5 = findViewById<RadioButton>(R.id.manual5)

        var  mashal5 = findViewById<ToggleButton>(R.id.option15)
        mashal5.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual5.isChecked = true }
            else{ mamual5.isChecked = true }
        }
        var  fan5 = findViewById<ToggleButton>(R.id.option25)
        fan5.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual5.isChecked = true }
            else{ mamual5.isChecked = true}
        }

        button5.setOnClickListener {
            val selectedOption: Int = radioGroup5!!.checkedRadioButtonId
            radioButton5 = findViewById(selectedOption)
            if (radioButton5 == reset5){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton5.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903051"
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
            } else if (radioButton5 == auto5) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton5.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903052"
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
            } else if (radioButton5 == mamual5){
                if (mashal5.isChecked == false && fan5.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton5.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990305300"
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
                } else if ( mashal5.isChecked == true && fan5.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton5.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990305310"
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

                }else if (mashal5.isChecked == false && fan5.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton5.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990305301"
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
                } else if(mashal5.isChecked == true && fan5.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton5.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990305311"
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


        radioGroup6 = findViewById(R.id.radioGroup6)
        Button6 = findViewById(R.id.sendButton6)
        val reset6 = findViewById<RadioButton>(R.id.reset6)
        val auto6 = findViewById<RadioButton>(R.id.automatic6)
        var mamual6 = findViewById<RadioButton>(R.id.manual6)

        var  mashal6 = findViewById<ToggleButton>(R.id.option16)
        mashal6.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual6.isChecked = true }
            else{ mamual6.isChecked = true }
        }
        var  fan6 = findViewById<ToggleButton>(R.id.option26)
        fan6.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual6.isChecked = true }
            else{ mamual6.isChecked = true}
        }

        Button6.setOnClickListener {
            val selectedOption: Int = radioGroup6!!.checkedRadioButtonId
            radioButton6 = findViewById(selectedOption)
            if (radioButton6 == reset6){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton6.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903061"
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
            } else if (radioButton6 == auto6) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton6.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903062"
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
            } else if (radioButton6 == mamual6){
                if (mashal6.isChecked == false && fan6.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton6.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990306300"
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
                } else if ( mashal6.isChecked == true && fan6.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton6.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990306310"
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

                }else if (mashal6.isChecked == false && fan6.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton6.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990306301"
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
                } else if(mashal6.isChecked == true && fan6.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton6.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990306311"
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

        radioGroup7 = findViewById(R.id.radioGroup7)
        Button7 = findViewById(R.id.sendButton7)
        val reset7 = findViewById<RadioButton>(R.id.reset7)
        val auto7 = findViewById<RadioButton>(R.id.automatic7)
        var mamual7 = findViewById<RadioButton>(R.id.manual7)

        var  mashal7 = findViewById<ToggleButton>(R.id.option17)
        mashal7.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual7.isChecked = true }
            else{ mamual7.isChecked = true }
        }
        var  fan7 = findViewById<ToggleButton>(R.id.option27)
        fan7.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual7.isChecked = true }
            else{ mamual7.isChecked = true}
        }

        Button7.setOnClickListener {
            val selectedOption: Int = radioGroup7!!.checkedRadioButtonId
            radioButton7 = findViewById(selectedOption)
            if (radioButton7 == reset7){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton7.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903071"
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
            } else if (radioButton7 == auto7) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton7.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903072"
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
            } else if (radioButton7 == mamual7){
                if (mashal7.isChecked == false && fan7.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton7.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990307300"
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
                } else if ( mashal7.isChecked == true && fan7.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton7.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990307310"
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

                }else if (mashal7.isChecked == false && fan7.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton7.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990307301"
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
                } else if(mashal7.isChecked == true && fan7.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton7.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990307311"
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

        radioGroup8 = findViewById(R.id.radioGroup8)
        Button8 = findViewById(R.id.sendButton8)
        val reset8 = findViewById<RadioButton>(R.id.reset8)
        val auto8 = findViewById<RadioButton>(R.id.automatic8)
        var mamual8 = findViewById<RadioButton>(R.id.manual8)
        var  mashal8 = findViewById<ToggleButton>(R.id.option18)
        mashal8.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual8.isChecked = true }
            else{ mamual8.isChecked = true }
        }
        var  fan8 = findViewById<ToggleButton>(R.id.option28)
        fan8.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual8.isChecked = true }
            else{ mamual8.isChecked = true}
        }

        Button8.setOnClickListener {
            val selectedOption: Int = radioGroup8!!.checkedRadioButtonId
            radioButton8 = findViewById(selectedOption)
            if (radioButton8 == reset8){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton8.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903081"
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
            } else if (radioButton8 == auto8) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton8.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903082"
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
            } else if (radioButton8 == mamual8){
                if (mashal8.isChecked == false && fan8.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton8.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990308300"
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
                } else if ( mashal8.isChecked == true && fan8.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton8.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990308310"
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

                }else if (mashal8.isChecked == false && fan8.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton8.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990308301"
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
                } else if(mashal8.isChecked == true && fan8.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton8.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990308311"
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

        radioGroup9 = findViewById(R.id.radioGroup9)
        Button9 = findViewById(R.id.sendButton9)
        val reset9 = findViewById<RadioButton>(R.id.reset9)
        val auto9 = findViewById<RadioButton>(R.id.automatic9)
        var mamual9 = findViewById<RadioButton>(R.id.manual9)
        var  mashal9 = findViewById<ToggleButton>(R.id.option19)
        mashal9.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual9.isChecked = true }
            else{ mamual9.isChecked = true }
        }
        var  fan9 = findViewById<ToggleButton>(R.id.option29)
        fan9.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual9.isChecked = true }
            else{ mamual9.isChecked = true}
        }

        Button9.setOnClickListener {
            val selectedOption: Int = radioGroup9!!.checkedRadioButtonId
            radioButton9 = findViewById(selectedOption)
            if (radioButton9 == reset9){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton9.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903091"
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
            } else if (radioButton9 == auto9) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton9.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903092"
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
            } else if (radioButton9 == mamual9){
                if (mashal9.isChecked == false && fan9.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton9.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990309300"
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
                } else if ( mashal9.isChecked == true && fan9.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton9.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990309310"
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

                }else if (mashal9.isChecked == false && fan9.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton9.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990309301"
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
                } else if(mashal9.isChecked == true && fan9.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton9.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990309311"
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


        radioGroup10 = findViewById(R.id.radioGroup10)
        Button10 = findViewById(R.id.sendButton10)
        val reset10 = findViewById<RadioButton>(R.id.reset10)
        val auto10 = findViewById<RadioButton>(R.id.automatic10)
        var mamual10 = findViewById<RadioButton>(R.id.manual10)
        var  mashal10 = findViewById<ToggleButton>(R.id.option110)
        mashal10.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual10.isChecked = true }
            else{ mamual10.isChecked = true }
        }
        var  fan10 = findViewById<ToggleButton>(R.id.option210)
        fan10.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual10.isChecked = true }
            else{ mamual10.isChecked = true}
        }

        Button10.setOnClickListener {
            val selectedOption: Int = radioGroup10!!.checkedRadioButtonId
            radioButton10 = findViewById(selectedOption)
            if (radioButton10 == reset10){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton10.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903101"
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
            } else if (radioButton10 == auto10) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton10.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903102"
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
            } else if (radioButton10 == mamual10){
                if (mashal10.isChecked == false && fan10.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton10.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990310300"
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
                } else if ( mashal10.isChecked == true && fan10.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton10.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990310310"
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

                }else if (mashal10.isChecked == false && fan10.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton10.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990310301"
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
                } else if(mashal10.isChecked == true && fan10.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton10.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990310311"
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

        radioGroup11 = findViewById(R.id.radioGroup11)
        Button11 = findViewById(R.id.sendButton11)
        val reset11 = findViewById<RadioButton>(R.id.reset11)
        val auto11 = findViewById<RadioButton>(R.id.automatic11)
        var mamual11 = findViewById<RadioButton>(R.id.manual11)
        var  mashal11 = findViewById<ToggleButton>(R.id.option111)
        mashal11.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual11.isChecked = true }
            else{ mamual11.isChecked = true }
        }
        var  fan11 = findViewById<ToggleButton>(R.id.option211)
        fan11.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual11.isChecked = true }
            else{ mamual11.isChecked = true}
        }

        Button11.setOnClickListener {
            val selectedOption: Int = radioGroup11!!.checkedRadioButtonId
            radioButton11 = findViewById(selectedOption)
            if (radioButton11 == reset11){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton11.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903111"
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
            } else if (radioButton11 == auto11) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton11.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903112"
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
            } else if (radioButton11 == mamual11){
                if (mashal11.isChecked == false && fan11.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton11.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990311300"
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
                } else if ( mashal11.isChecked == true && fan11.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton11.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990311310"
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

                }else if (mashal11.isChecked == false && fan11.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton11.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990311301"
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
                } else if(mashal11.isChecked == true && fan11.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton11.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990311311"
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

        radioGroup12 = findViewById(R.id.radioGroup12)
        Button12 = findViewById(R.id.sendButton12)
        val reset12 = findViewById<RadioButton>(R.id.reset12)
        val auto12 = findViewById<RadioButton>(R.id.automatic12)
        var mamual12 = findViewById<RadioButton>(R.id.manual12)
        var  mashal12 = findViewById<ToggleButton>(R.id.option112)
        mashal12.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual12.isChecked = true }
            else{ mamual12.isChecked = true }
        }
        var  fan12 = findViewById<ToggleButton>(R.id.option212)
        fan12.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual12.isChecked = true }
            else{ mamual12.isChecked = true}
        }

        Button12.setOnClickListener {
            val selectedOption: Int = radioGroup12!!.checkedRadioButtonId
            radioButton12 = findViewById(selectedOption)
            if (radioButton12 == reset12){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton12.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903121"
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
            } else if (radioButton12 == auto12) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton12.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903122"
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
            } else if (radioButton12 == mamual12){
                if (mashal12.isChecked == false && fan12.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton12.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990312300"
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
                } else if ( mashal12.isChecked == true && fan12.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton12.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990312310"
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

                }else if (mashal12.isChecked == false && fan12.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton12.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990312301"
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
                } else if(mashal12.isChecked == true && fan12.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton12.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990312311"
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

        radioGroup13 = findViewById(R.id.radioGroup13)
        Button13 = findViewById(R.id.sendButton13)
        val reset13 = findViewById<RadioButton>(R.id.reset13)
        val auto13 = findViewById<RadioButton>(R.id.automatic13)
        var mamual13 = findViewById<RadioButton>(R.id.manual13)
        var  mashal13 = findViewById<ToggleButton>(R.id.option113)
        mashal13.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual13.isChecked = true }
            else{ mamual13.isChecked = true }
        }
        var  fan13 = findViewById<ToggleButton>(R.id.option213)
        fan13.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual13.isChecked = true }
            else{ mamual13.isChecked = true}
        }

        Button13.setOnClickListener {
            val selectedOption: Int = radioGroup13!!.checkedRadioButtonId
            radioButton13 = findViewById(selectedOption)
            if (radioButton13 == reset13){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton13.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903131"
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
            } else if (radioButton13 == auto13) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton13.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903132"
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
            } else if (radioButton13 == mamual13){
                if (mashal13.isChecked == false && fan13.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton13.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990313300"
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
                } else if ( mashal13.isChecked == true && fan13.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton13.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990313310"
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

                }else if (mashal13.isChecked == false && fan13.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton13.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990313301"
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
                } else if(mashal13.isChecked == true && fan13.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton13.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990313311"
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

        radioGroup14 = findViewById(R.id.radioGroup14)
        Button14 = findViewById(R.id.sendButton14)
        val reset14 = findViewById<RadioButton>(R.id.reset14)
        val auto14 = findViewById<RadioButton>(R.id.automatic14)
        var mamual14 = findViewById<RadioButton>(R.id.manual14)
        var  mashal14 = findViewById<ToggleButton>(R.id.option114)
        mashal14.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual14.isChecked = true }
            else{ mamual14.isChecked = true }
        }
        var  fan14 = findViewById<ToggleButton>(R.id.option214)
        fan14.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual14.isChecked = true }
            else{ mamual14.isChecked = true}
        }

        Button14.setOnClickListener {
            val selectedOption: Int = radioGroup14!!.checkedRadioButtonId
            radioButton14 = findViewById(selectedOption)
            if (radioButton14 == reset14){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton14.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903141"
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
            } else if (radioButton14 == auto14) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton14.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903142"
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
            } else if (radioButton14 == mamual14){
                if (mashal14.isChecked == false && fan14.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton14.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990314300"
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
                } else if ( mashal14.isChecked == true && fan14.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton14.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990314310"
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

                }else if (mashal14.isChecked == false && fan14.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton14.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990314301"
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
                } else if(mashal14.isChecked == true && fan14.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton14.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990314311"
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

        radioGroup15 = findViewById(R.id.radioGroup15)
        Button15 = findViewById(R.id.sendButton15)
        val reset15 = findViewById<RadioButton>(R.id.reset15)
        val auto15 = findViewById<RadioButton>(R.id.automatic15)
        var mamual15 = findViewById<RadioButton>(R.id.manual15)
        var  mashal15 = findViewById<ToggleButton>(R.id.option115)
        mashal15.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual15.isChecked = true }
            else{ mamual15.isChecked = true }
        }
        var  fan15 = findViewById<ToggleButton>(R.id.option215)
        fan15.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){ mamual15.isChecked = true }
            else{ mamual15.isChecked = true}
        }

        Button15.setOnClickListener {
            val selectedOption: Int = radioGroup15!!.checkedRadioButtonId
            radioButton15 = findViewById(selectedOption)
            if (radioButton15 == reset15){
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton15.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903151"
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
            } else if (radioButton15 == auto15) {
                val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                builder.setTitle(radioButton15.text)
                builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                    val message = "#9903152"
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
            } else if (radioButton15 == mamual15){
                if (mashal15.isChecked == false && fan15.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton15.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990315300"
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
                } else if ( mashal15.isChecked == true && fan15.isChecked == false){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton15.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990315310"
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
                }else if (mashal15.isChecked == false && fan15.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton15.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990315301"
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
                } else if(mashal15.isChecked == true && fan15.isChecked == true){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton15.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#990315311"
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