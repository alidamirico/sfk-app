// code and design by Ali Damiri
package com.mysfk.android.frogments

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import com.mysfk.android.FaNum
import com.mysfk.android.R
import com.mysfk.android.bokhriActivity
import com.mysfk.android.setnumberActivity
import com.mysfk.android.smsActivity
import saman.zamani.persiandate.PersianDate
import saman.zamani.persiandate.PersianDateFormat


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_home, container, false).apply {
        val timeUpdate = findViewById<TextView>(R.id.testGetD)

        val receivedMsg = findViewById<TextView>(R.id.last_receive)
        val lastSent = findViewById<TextView>(R.id.last_sent)
        val numberText = findViewById<TextView>(R.id.showNumber)
        val addNum = findViewById<Button>(R.id.goSetNum)


        val pdate = PersianDate()
        val pdformater = PersianDateFormat()
        pdformater.format(pdate)
        val pdformater2 = PersianDateFormat("j F Y")
        val pdformater3 = PersianDateFormat("H:i")
        val data = FaNum.convert(pdformater2.format(pdate))
        val H = FaNum.convert(pdformater3.format(pdate))
        timeUpdate.text = "امروز $data و ساعت $H  "

        val sharedPeref = requireActivity().getSharedPreferences("setNumber", AppCompatActivity.MODE_PRIVATE)
        val nums = "+98" + sharedPeref.getString("number", getString(R.string.messageShowNumAlert))
        val num2 = sharedPeref.getString("number", getString(R.string.messageShowNumAlert))
        val numShow = "0" + sharedPeref.getString("number", getString(R.string.messageShowNumAlert))


        if (numShow.length == 11) {
            numberText.text = FaNum.convert(numShow)
            addNum.setVisibility(View.GONE);
        } else {
            numberText.text = "جهت اضافه کردن شماره سیستم از دکمه زیر استفاده کنید"
            numberText.setTextSize(14F)
        }

        addNum.setOnClickListener {
            activity?.let {
                val intent = Intent(it, setnumberActivity::class.java)
                it.startActivity(intent)
            }
        }

        if (nums.length == 13) {
            val cursor: Cursor? = requireActivity().contentResolver.query(
                Uri.parse("content://sms"),
                null,
                "address='$nums'",
                null,
                null
            )

            if (cursor != null && cursor.moveToFirst()) {
                val messageSend = cursor?.getString(12)
                receivedMsg.text = "آخرین دریافتی : \n$messageSend"

            } else {
                receivedMsg.text = "آخرین جواب دریافتی : \n اخیرا جوابی دریافت نشده "
            }

            var count = FaNum.convert(cursor?.count.toString())
            val counterrecevicd = findViewById<TextView>(R.id.count_receive)

            counterrecevicd.text = "جواب های دریافتی : \n $count عدد "


        } else {
            receivedMsg.text = "آخرین جواب دریافتی :\nشماره سیستمی ثبت نشده است !"

        }


        if (num2?.length == 10) {

            val cursor2: Cursor? = requireActivity().contentResolver.query(
                Uri.parse("content://sms"),
                null,
                "address='$num2'",
                null,
                null
            )
            if (cursor2 != null && cursor2.moveToFirst()) {
                val messageSend2 = cursor2?.getString(12)
                lastSent.text = "آخرین ارسالی : \n$messageSend2"

            } else {
                lastSent.text = "آخرین دستور ارسالی : \n اخیرا دستوری ارسال نشده"
            }

            var count2 = FaNum.convert(cursor2?.count.toString())


            val countersent = findViewById<TextView>(R.id.count_sent)
            countersent.text = "دستورات ارسالی : \n $count2 عدد "


        } else {
            lastSent.text = "آخرین دستور ارسالی:\nشماره سیستمی ثبت نشده است !"
        }

    }

}