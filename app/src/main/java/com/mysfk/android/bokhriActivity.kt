package com.mysfk.android
//alidamiri test

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import ir.hamsaa.RtlMaterialSpinner

class bokhriActivity : AppCompatActivity() {
    var radioGroup1: RadioGroup? = null
    lateinit var radioButton1: RadioButton
    private lateinit var button1: Button



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

        val items = listOf("بخاری اول", "بخاری دوم", "بخاری سوم","بخاری چهارم","بخاری پنجم","بخاری ششم","بخاری هفتم","بخاری هشتم","بخاری نهم","بخاری دهم","بخاری یازدهم","بخاری دوازدهم","بخاری سیزدهم","بخاری چهاردهم","بخاری پانزدهم")
        val spinner = findViewById<AutoCompleteTextView>(R.id.dropDown)
        spinner.isFocusable = false
        val adapter = ArrayAdapter(this, R.layout.dropdown_items, items)
        adapter.setDropDownViewResource(R.layout.dropdown_items)
        spinner.setAdapter(adapter)

        var Itemselected =""

        button1.setOnClickListener {
          val position = spinner.text.toString()
            if (position == "بخاری اول"){
                 Itemselected="01"
            }else if (position == "بخاری دوم"){
                 Itemselected="02"

            }else if (position == "بخاری سوم"){
                 Itemselected="03"

            }else if (position == "بخاری چهارم"){
                Itemselected="04"

            }else if (position == "بخاری پنجم"){
                 Itemselected="05"

            }else if (position == "بخاری ششم"){
                 Itemselected="06"

            }else if (position == "بخاری هفتم"){
                 Itemselected="07"

            }else if (position == "بخاری هشتم"){
                 Itemselected="08"

            }else if (position == "بخاری نهم"){
                 Itemselected="09"

            }else if (position == "بخاری دهم"){
                 Itemselected="10"

            }else if (position == "بخاری یازدهم"){
                 Itemselected="11"

            }else if (position == "بخاری دوازدهم"){
                Itemselected="12"

            }else if (position == "بخاری سیزدهم"){
                 Itemselected="13"

            }else if (position == "بخاری چهاردهم"){
                 Itemselected="14"

            }else if (position == "بخاری پانزدهم"){
                Itemselected="15"

            }
            if (Itemselected.length ==2){
                val selectedOption: Int = radioGroup1!!.checkedRadioButtonId
                radioButton1 = findViewById(selectedOption)
                if (radioButton1 == reset1){
                    val builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
                    builder.setTitle(radioButton1.text)
                    builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
                    builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                        val message = "#9903${Itemselected}1"
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
                        val message = "#9903${Itemselected}2"
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
                            val message = "#9903${Itemselected}300"
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
                            val message = "#9903${Itemselected}310"
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
                            val message = "#9903${Itemselected}301"
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
                            val message = "#9903${Itemselected}311"
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
            } else {
                Toast.makeText(applicationContext, "لطفا یک آیتم را انتخاب کنید", Toast.LENGTH_SHORT).show()
            }

        }
    }
}