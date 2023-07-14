package com.mysfk.android

import android.app.ProgressDialog
import android.content.DialogInterface
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Timer
import java.util.TimerTask

class daricheReportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dariche_report)
        val darichereort1 = findViewById<Button>(R.id.daricheReport1)
        val darichereort2 = findViewById<Button>(R.id.daricheReport2)
        val darichereort3 = findViewById<Button>(R.id.daricheReport3)
        val darichereort4 = findViewById<Button>(R.id.daricheReport4)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number", null)
        darichereort1.setOnClickListener {
            val btnText = darichereort1.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110401"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(number, null, message, null, null)
                    Toast.makeText(
                        applicationContext,
                        "دستور ارسال شد ، لطفا منتظر پاسخ بمانید",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(
                        applicationContext,
                        "لطفا  ابتدا شماره سیستم را وارد کنید !",
                        Toast.LENGTH_SHORT
                    ).show()
                    val intent = Intent(this, setnumberActivity::class.java)
                    this.startActivity(intent)
                }
                autoredirect()
                loading()
                loading()
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
        darichereort2.setOnClickListener {
            val btnText = darichereort2.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110402"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(number, null, message, null, null)
                    Toast.makeText(
                        applicationContext,
                        "دستور ارسال شد ، لطفا منتظر پاسخ بمانید",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(
                        applicationContext,
                        "لطفا  ابتدا شماره سیستم را وارد کنید !",
                        Toast.LENGTH_SHORT
                    ).show()
                    val intent = Intent(this, setnumberActivity::class.java)
                    this.startActivity(intent)
                }
                autoredirect()
                loading()
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
        darichereort3.setOnClickListener {
            val btnText = darichereort3.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110403"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(number, null, message, null, null)
                    Toast.makeText(
                        applicationContext,
                        "دستور ارسال شد ، لطفا منتظر پاسخ بمانید",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(
                        applicationContext,
                        "لطفا  ابتدا شماره سیستم را وارد کنید !",
                        Toast.LENGTH_SHORT
                    ).show()
                    val intent = Intent(this, setnumberActivity::class.java)
                    this.startActivity(intent)
                }
                autoredirect()
                loading()
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
        darichereort4.setOnClickListener {
            val btnText = darichereort4.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110404"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(number, null, message, null, null)
                    Toast.makeText(
                        applicationContext,
                        "دستور ارسال شد ، لطفا منتظر پاسخ بمانید",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(
                        applicationContext,
                        "لطفا  ابتدا شماره سیستم را وارد کنید !",
                        Toast.LENGTH_SHORT
                    ).show()
                    val intent = Intent(this, setnumberActivity::class.java)
                    this.startActivity(intent)
                }
                autoredirect()
                loading()
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

    private fun autoredirect() {
        GlobalScope.launch(Dispatchers.Main) {
            delay(20000)
            val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
            val nums = "+98" + sharedPeref.getString("number", null)
            val cursor: Cursor? = getContentResolver().query(
                Uri.parse("content://sms"),
                null,
                "address='$nums'",
                null,
                null
            )
            cursor?.moveToFirst()
            val messageSend = cursor?.getString(12)

            val builder = AlertDialog.Builder(this@daricheReportActivity, R.style.AlertDialogThemeAnswer)
            builder.setTitle("پاسخ دریافت شده")
            builder.setMessage(messageSend)
            builder.setPositiveButton("رفتن به ورودی ها(تایید)") { _: DialogInterface, _: Int ->
                val intent = Intent(this@daricheReportActivity, smsActivity::class.java)
                this@daricheReportActivity.startActivity(intent)
            }
            builder.setNegativeButton("خوانده شده (لغو)") { _: DialogInterface, _: Int ->
            }
            builder.show()

        }
    }
    fun loading(){
        val progressDialog = ProgressDialog(this@daricheReportActivity, R.style.AlertDialogThemeLoading)
        progressDialog.setTitle("سابرینا همراه در حال دریافت پاسخ")
        progressDialog.setMessage("حداقل زمان مورد نیاز برای دریافت پاسخ : 20 ثانیه ")
        progressDialog.show()
        progressDialog.setCancelable(false)

        val delayInMillis: Long = 20000
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                progressDialog.dismiss()
            }
        }, delayInMillis)
    }
}