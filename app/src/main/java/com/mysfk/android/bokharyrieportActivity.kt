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

class bokharyrieportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bokharyrieport)
        val bokhari1 = findViewById<Button>(R.id.bokharReport1)
        val bokhari2 = findViewById<Button>(R.id.bokharReport2)
        val bokhari3 = findViewById<Button>(R.id.bokharReport3)
        val bokhari4 = findViewById<Button>(R.id.bokharReport4)
        val bokhari5 = findViewById<Button>(R.id.bokharReport5)
        val bokhari6 = findViewById<Button>(R.id.bokharReport6)
        val bokhari7 = findViewById<Button>(R.id.bokharReport7)
        val bokhari8 = findViewById<Button>(R.id.bokharReport8)
        val bokhari9 = findViewById<Button>(R.id.bokharReport9)
        val bokhari10 = findViewById<Button>(R.id.bokharReport10)
        val bokhari11 = findViewById<Button>(R.id.bokharReport11)
        val bokhari12 = findViewById<Button>(R.id.bokharReport12)
        val bokhari13 = findViewById<Button>(R.id.bokharReport13)
        val bokhari14 = findViewById<Button>(R.id.bokharReport14)
        val bokhari15 = findViewById<Button>(R.id.bokharReport15)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number", null)

        bokhari1.setOnClickListener {
            val btnText = bokhari1.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110301"
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
                loading()
                autoredirect()
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
        bokhari2.setOnClickListener {
            val btnText = bokhari2.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110302"
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
                loading()
                autoredirect()
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
        bokhari3.setOnClickListener {
            val btnText = bokhari3.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110303"
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
        bokhari4.setOnClickListener {
            val btnText = bokhari4.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110304"
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
        bokhari5.setOnClickListener {
            val btnText = bokhari5.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110305"
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
        bokhari6.setOnClickListener {
            val btnText = bokhari6.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110306"
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
        bokhari7.setOnClickListener {
            val btnText = bokhari7.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110307"
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
        bokhari8.setOnClickListener {
            val btnText = bokhari8.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110308"
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
        bokhari8.setOnClickListener {
            val btnText = bokhari8.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110308"
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
        bokhari9.setOnClickListener {
            val btnText = bokhari9.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110309"
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
        bokhari10.setOnClickListener {
            val btnText = bokhari10.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110310"
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
        bokhari11.setOnClickListener {
            val btnText = bokhari11.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110311"
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
        bokhari12.setOnClickListener {
            val btnText = bokhari12.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110312"
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
        bokhari13.setOnClickListener {
            val btnText = bokhari13.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110313"
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
        bokhari14.setOnClickListener {
            val btnText = bokhari14.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110314"
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
        bokhari15.setOnClickListener {
            val btnText = bokhari15.text.toString()
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110315"
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

            val builder = AlertDialog.Builder(this@bokharyrieportActivity, R.style.AlertDialogThemeAnswer)
            builder.setTitle("پاسخ دریافت شده")
            builder.setMessage(messageSend)
            builder.setPositiveButton("رفتن به ورودی ها(تایید)") { _: DialogInterface, _: Int ->
                val intent = Intent(this@bokharyrieportActivity, smsActivity::class.java)
                this@bokharyrieportActivity.startActivity(intent)
            }
            builder.setNegativeButton("خوانده شده (لغو)") { _: DialogInterface, _: Int ->
            }
            builder.show()

        }
    }
    fun loading(){
        val progressDialog = ProgressDialog(this@bokharyrieportActivity, R.style.AlertDialogThemeLoading)
        progressDialog.setTitle("سابرینا همراه در حال دریافت پاسخ")
        progressDialog.setMessage("حداقل زمان مورد نیاز برای دریافت پاسخ : 20 ثانیه ")
        progressDialog.show()
        progressDialog.setCancelable(false)
        val delayInMillis: Long = 19500
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                progressDialog.dismiss()
            }
        }, delayInMillis)
    }
}