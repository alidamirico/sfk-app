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

class shadesReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shades_review)
        val shadesreort1 = findViewById<Button>(R.id.shadesReport1)
        val shadesreort2 = findViewById<Button>(R.id.shadesReport2)
        val shadesreort3 = findViewById<Button>(R.id.shadesReport3)
        val shadesreort4 = findViewById<Button>(R.id.shadesReport4)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number", null)
        shadesreort1.setOnClickListener {
            val btnText = shadesreort1.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#111001"
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
        shadesreort2.setOnClickListener {
            val btnText = shadesreort2.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#111002"
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
        shadesreort3.setOnClickListener {
            val btnText = shadesreort3.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#111003"
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
        shadesreort4.setOnClickListener {
            val btnText = shadesreort4.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#111004"
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

            val builder =
                AlertDialog.Builder(this@shadesReviewActivity, R.style.AlertDialogThemeAnswer)
            builder.setTitle("پاسخ دریافت شده")
            builder.setMessage(messageSend)
            builder.setPositiveButton("رفتن به ورودی ها(تایید)") { _: DialogInterface, _: Int ->
                val intent = Intent(this@shadesReviewActivity, smsActivity::class.java)
                this@shadesReviewActivity.startActivity(intent)
            }
            builder.setNegativeButton("خوانده شده (لغو)") { _: DialogInterface, _: Int ->
            }
            builder.show()

        }
    }
    fun loading(){
        val progressDialog = ProgressDialog(this@shadesReviewActivity, R.style.AlertDialogThemeLoading)
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