package com.mysfk.android.frogments

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.telephony.SmsManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.mysfk.android.*


class SettingsFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View?
            = inflater.inflate(R.layout.fragment_settings, container, false).apply {


        val sharedPeref = requireActivity().getSharedPreferences("setNumber", Context.MODE_PRIVATE)
        val nums = sharedPeref.getString("number",null)


        val opensetpass = findViewById<Button>(R.id.password)
        opensetpass.setOnClickListener {
            activity?.let {
                val intent = Intent(it, setPasswordActivity::class.java)
                it.startActivity(intent)
            }
        }

        val opensetnumber = findViewById<Button>(R.id.systemNumber)
        opensetnumber.setOnClickListener {
            activity?.let {
                val intent = Intent(it, setnumberActivity::class.java)
                it.startActivity(intent)
            }
        }

        val openaboutus = findViewById<Button>(R.id.aboutUs)
        openaboutus.setOnClickListener {
            activity?.let {
                val intent = Intent(it, aboutUsActivity::class.java)
                it.startActivity(intent)
            }
        }

        val numregester = findViewById<Button>(R.id.rigster)
        numregester.setOnClickListener {
            val btnText = numregester.text.toString()
            val builder = AlertDialog.Builder(requireActivity(),R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#050"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()

                    smsManager.sendTextMessage(nums, null, message, null, null)
                    Toast.makeText(
                        getActivity(),
                        "دستور ارسال شد ✅",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(getActivity(), "لطفا ابتدا شماره سیستم را وارد کیند", Toast.LENGTH_SHORT).show()
                    activity?.let {
                        val intent = Intent(it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
            }
            builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                Toast.makeText(getActivity(), "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        }

        val numdelet = findViewById<Button>(R.id.deletNaumber)
        numdelet.setOnClickListener {
            val btnText = numdelet.text.toString()
            val builder = AlertDialog.Builder(requireActivity(),R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#055"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()
                    smsManager.sendTextMessage(nums, null, message, null, null)
                    Toast.makeText(
                        getActivity(),
                        "دستور ارسال شد ✅",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(getActivity(), "لطفا ابتدا شماره سیستم را وارد کیند", Toast.LENGTH_SHORT).show()
                    activity?.let {
                        val intent = Intent(it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
            }
            builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                Toast.makeText(getActivity(), "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        }


        val mci = findViewById<Button>(R.id.mci)
        mci.setOnClickListener {
            val btnText = mci.text.toString()
            val builder = AlertDialog.Builder(requireActivity(),R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#02"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()
                    smsManager.sendTextMessage(nums, null, message, null, null)
                    Toast.makeText(
                        getActivity(),
                        "دستور ارسال شد ✅",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(getActivity(), "لطفا ابتدا شماره سیستم را وارد کیند", Toast.LENGTH_SHORT).show()
                    activity?.let {
                        val intent = Intent(it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
            }
            builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                Toast.makeText(getActivity(), "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        }

        val mtn = findViewById<Button>(R.id.mtn)
        mtn.setOnClickListener {
            val btnText = mtn.text.toString()
            val builder = AlertDialog.Builder(requireActivity(),R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#01"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()
                    smsManager.sendTextMessage(nums, null, message, null, null)
                    Toast.makeText(
                        getActivity(),
                        "دستور ارسال شد ✅",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(getActivity(), "لطفا ابتدا شماره سیستم را وارد کیند", Toast.LENGTH_SHORT).show()
                    activity?.let {
                        val intent = Intent(it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
            }
            builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                Toast.makeText(getActivity(), "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        }

        val gsmTest = findViewById<Button>(R.id.gsmTest)
        gsmTest.setOnClickListener {
            val btnText = gsmTest.text.toString()
            val builder = AlertDialog.Builder(requireActivity(),R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#06"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()
                    smsManager.sendTextMessage(nums, null, message, null, null)
                    Toast.makeText(
                        getActivity(),
                        "دستور ارسال شد ✅",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(getActivity(), "لطفا ابتدا شماره سیستم را وارد کیند", Toast.LENGTH_SHORT).show()
                    activity?.let {
                        val intent = Intent(it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
            }
            builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                Toast.makeText(getActivity(), "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        }


        val gsmVersion = findViewById<Button>(R.id.gsmVersion)
        gsmVersion.setOnClickListener {
            val btnText = gsmVersion.text.toString()
            val builder = AlertDialog.Builder(requireActivity(),R.style.AlertDialogTheme)
            builder.setTitle(btnText)
            builder.setMessage("آیا برای ارسال دستور مطمئنید ؟")
            builder.setPositiveButton("بلی") { _: DialogInterface, _: Int ->
                val message = "#09"
                try {
                    val smsManager: SmsManager = SmsManager.getDefault()
                    smsManager.sendTextMessage(nums, null, message, null, null)
                    Toast.makeText(
                        getActivity(),
                        "دستور ارسال شد ✅",
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: Exception) {
                    Toast.makeText(getActivity(), "لطفا ابتدا شماره سیستم را وارد کیند", Toast.LENGTH_SHORT).show()
                    activity?.let {
                        val intent = Intent(it, setnumberActivity::class.java)
                        it.startActivity(intent)
                    }
                }
            }
            builder.setNegativeButton("خیر") { _: DialogInterface, _: Int ->
                Toast.makeText(getActivity(), "شما از ارسال دستور منصرف شدید", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        }










    }
}
