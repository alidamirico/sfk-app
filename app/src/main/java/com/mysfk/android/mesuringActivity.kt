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

class mesuringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mesuring)
        val mesuringreort1 = findViewById<Button>(R.id.mesuringReport1)
        val mesuringreort2 = findViewById<Button>(R.id.mesuringReport2)
        val mesuringreort3 = findViewById<Button>(R.id.mesuringReport3)
        val mesuringreort4 = findViewById<Button>(R.id.mesuringReport4)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number", null)
        mesuringreort1.setOnClickListener {
            val btnText = mesuringreort1.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110201"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(number, null, message, null, null)
                    Toast.makeText(
                        applicationContext,
                        "ایستگاه اندازی گیری 1 =دریافت گزارش ✅ دریافت گزارش چندین ثانیه زمان می برد ، لطفا برای ارسال دستور بعدی کمی صبر کنید",
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
        mesuringreort2.setOnClickListener {
            val btnText = mesuringreort2.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110202"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(number, null, message, null, null)
                    Toast.makeText(
                        applicationContext,
                        "ایستگاه اندازه گیری 2 =دریافت گزارش ✅ دریافت گزارش چندین ثانیه زمان می برد ، لطفا برای ارسال دستور بعدی کمی صبر کنید",
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
        mesuringreort3.setOnClickListener {
            val btnText = mesuringreort3.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110203"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(number, null, message, null, null)
                    Toast.makeText(
                        applicationContext,
                        "ایستگاه اندازه گیری 3 =دریافت گزارش ✅ دریافت گزارش چندین ثانیه زمان می برد ، لطفا برای ارسال دستور بعدی کمی صبر کنید",
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
        mesuringreort4.setOnClickListener {
            val btnText = mesuringreort4.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110204"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(number, null, message, null, null)
                    Toast.makeText(
                        applicationContext,
                        "ایستگاه اندازه گیری 4 =دریافت گزارش ✅ دریافت گزارش چندین ثانیه زمان می برد ، لطفا برای ارسال دستور بعدی کمی صبر کنید",
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
                AlertDialog.Builder(this@mesuringActivity, R.style.AlertDialogThemeAnswer)
            builder.setTitle("پاسخ دریافت شده")
            builder.setMessage(messageSend)
            builder.setPositiveButton("رفتن به ورودی ها(تایید)") { _: DialogInterface, _: Int ->
                val intent = Intent(this@mesuringActivity, smsActivity::class.java)
                this@mesuringActivity.startActivity(intent)
            }
            builder.setNegativeButton("خوانده شده (لغو)") { _: DialogInterface, _: Int ->
            }
            builder.show()

        }
    }
    fun loading(){
        val progressDialog = ProgressDialog(this@mesuringActivity, R.style.AlertDialogThemeLoading)
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