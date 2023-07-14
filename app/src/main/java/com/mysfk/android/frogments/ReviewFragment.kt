package com.mysfk.android.frogments

import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.telephony.SmsManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mysfk.android.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Timer
import java.util.TimerTask

class ReviewFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_review, container, false).apply {

        val openBokhary = findViewById<Button>(R.id.heatersReview)
        val sharedPeref = requireActivity().getSharedPreferences("setNumber", Context.MODE_PRIVATE)
        val nums = sharedPeref.getString("number", null)
        openBokhary.setOnClickListener {
            activity?.let {
                val intent = Intent(it, bokharyrieportActivity::class.java)
                it.startActivity(intent)
            }
        }
        val alaram = findViewById<Button>(R.id.alarmreport)
        alaram.setOnClickListener {
            val btnText = alaram.text.toString()
            val builder = AlertDialog.Builder(requireActivity(), R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#03"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(nums, null, message, null, null)
                    Toast.makeText(
                        getActivity(),
                        "دستور ارسال شد ، لطفا منتظر پاسخ بمانید",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(
                        getActivity(),
                        "لطفا ابتدا شماره سیستم را وارد کیند",
                        Toast.LENGTH_SHORT
                    ).show()
                    activity?.let {
                        val intent = Intent(it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
                loading()
                autoredirect()
            }
            builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                Toast.makeText(getActivity(), "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        }


        val weatherstation = findViewById<Button>(R.id.weatherstationReview)
        weatherstation.setOnClickListener {
            val btnText = weatherstation.text.toString()
            val builder = AlertDialog.Builder(requireActivity(), R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#110101"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(nums, null, message, null, null)
                    Toast.makeText(
                        getActivity(),
                        "دستور ارسال شد ، لطفا منتظر پاسخ بمانید",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(
                        getActivity(),
                        "لطفا ابتدا شماره سیستم را وارد کیند",
                        Toast.LENGTH_SHORT
                    ).show()
                    activity?.let {
                        val intent = Intent(it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
                autoredirect()
                loading()
            }
            builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                Toast.makeText(getActivity(), "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        }
        val openmesuring = findViewById<Button>(R.id.measuringstationReview)
        openmesuring.setOnClickListener {
            activity?.let {
                val intent = Intent(it, mesuringActivity::class.java)
                it.startActivity(intent)
            }
        }
        val opendarich = findViewById<Button>(R.id.ventsReview)
        opendarich.setOnClickListener {
            activity?.let {
                val intent = Intent(it, daricheReportActivity::class.java)
                it.startActivity(intent)
            }
        }
        val openfans = findViewById<Button>(R.id.fansReview)
        openfans.setOnClickListener {
            activity?.let {
                val intent = Intent(it, fansReviewActivity::class.java)
                it.startActivity(intent)
            }
        }
        val openabyari = findViewById<Button>(R.id.abyariReview)
        openabyari.setOnClickListener {
            activity?.let {
                val intent = Intent(it, abyariReviewActivity::class.java)
                it.startActivity(intent)
            }
        }
        val opengardshi = findViewById<Button>(R.id.gardshiReview)
        opengardshi.setOnClickListener {
            activity?.let {
                val intent = Intent(it, gardshiReviewActivity::class.java)
                it.startActivity(intent)
            }
        }
        val openmehpash = findViewById<Button>(R.id.mehpashReview)
        openmehpash.setOnClickListener {
            activity?.let {
                val intent = Intent(it, mehpashReviewActivity::class.java)
                it.startActivity(intent)
            }
        }
        val openshades = findViewById<Button>(R.id.shadesReview)
        openshades.setOnClickListener {
            activity?.let {
                val intent = Intent(it, shadesReviewActivity::class.java)
                it.startActivity(intent)
            }
        }
    }

    private fun autoredirect() {
        GlobalScope.launch(Dispatchers.Main) {
            delay(20000)
            val sharedPeref =
                requireActivity().getSharedPreferences("setNumber", AppCompatActivity.MODE_PRIVATE)
            val nums = "+98" + sharedPeref.getString("number", null)
            val cursor: Cursor? = requireActivity().getContentResolver().query(
                Uri.parse("content://sms"),
                null,
                "address='$nums'",
                null,
                null
            )
            cursor?.moveToFirst()
            val messageSend = cursor?.getString(12)

            val builder = AlertDialog.Builder(requireActivity(), R.style.AlertDialogThemeAnswer)
            builder.setTitle("پاسخ دریافت شده")
            builder.setMessage(messageSend)
            builder.setPositiveButton("رفتن به ورودی ها(تایید)") { _: DialogInterface, _: Int ->
                activity?.let {
                    val intent = Intent(it, smsActivity::class.java)
                    it.startActivity(intent)
                }
            }
            builder.setNegativeButton("خوانده شده (لغو)") { _: DialogInterface, _: Int ->
            }
            builder.show()

        }
    }

    fun loading() {
        val progressDialog = ProgressDialog(activity, R.style.AlertDialogThemeLoading)
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
