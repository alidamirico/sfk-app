package com.mysfk.android.frogments

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.telephony.SmsManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.mysfk.android.R
import com.mysfk.android.bokhriActivity
import com.mysfk.android.setnumberActivity
import com.mysfk.android.smsActivity
import java.io.File
import java.io.FileWriter


class MessageFragment: Fragment() {


    private var listPermissions = arrayOf(
        Manifest.permission.READ_SMS,
        Manifest.permission.SEND_SMS
    )
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_message, container, false).apply {


        val open = findViewById<LinearLayout>(R.id.chatAria)


        val sharedPeref = requireActivity().getSharedPreferences("setNumber", Context.MODE_PRIVATE)
        val nums ="+98"+sharedPeref.getString("number", getString(R.string.messageShowNumAlert))
        val numshow ="0"+sharedPeref.getString("number",getString(R.string.messageShowNumAlert))


        val textNum = findViewById<TextView>(R.id.textViewNumber)



        if (numshow.length == 11){

            textNum.text = numshow
        }else {
            textNum.text= getString(R.string.chatHeaderNumber)
        }



        open.setOnClickListener {



            if (checkPermissions()) {
                if (nums.length == 13){
                    activity?.let{
                        val intent = Intent (it, smsActivity::class.java)
                        it.startActivity(intent)
                    }
                }else{
                    activity?.let{
                        val intent = Intent (it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
            } else {
                requestPermissions()
            }






//


        }


    }

    private fun checkPermissions(): Boolean {
        return ActivityCompat.checkSelfPermission(
            requireContext(), Manifest.permission.READ_SMS) == PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(
            requireContext(), Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED

    }


    private val permissionRequest = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
        val granted = permissions.entries.all {
            it.value == true
        }
        permissions.entries.forEach {
            Log.e("LOG_TAG", "${it.key} = ${it.value}")
        }

        if (granted) {
            // your code if permission granted
        } else {
            // your code if permission denied
        }
    }
    private fun requestPermissions() {

        permissionRequest.launch(listPermissions)

    }
}