package com.mysfk.android

import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.telephony.SmsManager
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.mysfk.android.databinding.ItemMessageReceiveBinding
import com.mysfk.android.databinding.ItemMessageSendBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.databinding.BindableItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

class smsActivity : AppCompatActivity() {

    private val messageAdapter = GroupAdapter<GroupieViewHolder>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms)



        val toolbar: Toolbar = findViewById(R.id.sms_toolbar)
        setSupportActionBar(toolbar)

        toolbar.setNavigationOnClickListener {
            super.onBackPressed();
        }

        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_LTR

        val recyclerView = findViewById<RecyclerView>(R.id.listmessage)
        val button = findViewById<Button>(R.id.button)
        val editmessage = findViewById<EditText>(R.id.editText)
        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
        val number = sharedPeref.getString("number", null)
//        val numberShow = "0" + sharedPeref.getString("number", null)
//        val textNum = findViewById<TextView>(R.id.textNumber)
//        textNum.text = numberShow






        recyclerView.adapter = messageAdapter
        populateData()


        receiveAutoResponse()
//        receiveAutosended()
//        val backbtn = findViewById<ImageButton>(R.id.btnBack)
//
//        backbtn.setOnClickListener {
//            finish()
//        }

        button.setOnClickListener {
            val message = Message(text = editmessage.text.toString(), sendBy = "me")
            val smssend = editmessage.text.toString()
            val sendMessageItem = SendMessageItem(message)

            messageAdapter.add(sendMessageItem)
            editmessage.text.clear()
//          receiveclickResponse()
            recyclerView.scrollToPosition(messageAdapter.getItemCount() - 1);



            try {
                val smsManager: SmsManager = SmsManager.getDefault()
                smsManager.sendTextMessage(number, null, smssend, null, null)
            } catch (e: Exception) {
                Toast.makeText(
                    applicationContext,
                    "لطفا  ابتدا شماره سیستم را وارد کنید !",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this, setnumberActivity::class.java)
                this.startActivity(intent)
            }
        }
    }


//    override fun onResume() {
//        super.onResume()
//
//        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_LTR
//
//        val recyclerView = findViewById<RecyclerView>(R.id.listmessage)
//        val button = findViewById<Button>(R.id.button)
//        val editmessage = findViewById<EditText>(R.id.editText)
//        val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
//        val number = sharedPeref.getString("number", null)
//        val numberShow = "0" + sharedPeref.getString("number", null)
//        val textNum = findViewById<TextView>(R.id.textNumber)
//        textNum.text = numberShow
//
//
//
//
//
//
//        recyclerView.adapter = messageAdapter
//        populateData()
//
//
//        receiveAutoResponse()
////        receiveAutosended()
//        val backbtn = findViewById<ImageButton>(R.id.btnBack)
//
//        backbtn.setOnClickListener {
//            finish()
//        }
//
//        button.setOnClickListener {
//            val message = Message(text = editmessage.text.toString(), sendBy = "me")
//            val smssend = editmessage.text.toString()
//            val sendMessageItem = SendMessageItem(message)
//
//            messageAdapter.add(sendMessageItem)
//            editmessage.text.clear()
//            receiveclickResponse()
//            recyclerView.scrollToPosition(messageAdapter.getItemCount() - 1);
//
//
//
//            try {
//                val smsManager: SmsManager = SmsManager.getDefault()
//                smsManager.sendTextMessage(number, null, smssend, null, null)
//            } catch (e: Exception) {
//                Toast.makeText(
//                    applicationContext,
//                    "لطفا  ابتدا شماره سیستم را وارد کنید !",
//                    Toast.LENGTH_SHORT
//                ).show()
//                val intent = Intent(this, setnumberActivity::class.java)
//                this.startActivity(intent)
//            }
//        }
//
//
//    }

    private fun populateData() {
        val data = listOf<Message>()
        data.forEach {
            if (it.sendBy == "me") {
                messageAdapter.add(SendMessageItem(it))
            } else {
                messageAdapter.add(ReceiveMessageItem(it))
            }
        }
    }


    private fun receiveclickResponse() {

        GlobalScope.launch(Dispatchers.Main) {
            delay(2000)
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

            val receive = Message(text = "$messageSend", sendBy = "me")
            val receiveItem = ReceiveMessageItem(receive)

            messageAdapter.add(receiveItem)
            val recyclerView = findViewById<RecyclerView>(R.id.listmessage)
            recyclerView.scrollToPosition(messageAdapter.getItemCount() - 1);
        }

    }


    private fun receiveAutoResponse() {

        GlobalScope.launch(Dispatchers.Main) {
            delay(100)
            val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
            val nums = "+98" + sharedPeref.getString("number", null)
            val cursor: Cursor? = getContentResolver().query(
                Uri.parse("content://sms"),
                null,
                "address='$nums'",
                null,
                null
            )

            val  smsList = ArrayList<String>()
            while (cursor?.moveToNext() == true) {
                val messageSend = cursor?.getString(12)
                smsList.add(messageSend)

            }
            smsList.reverse()
            for (x in smsList){
                val receive = Message(text = "$x", sendBy = "me")
                val receiveItem = ReceiveMessageItem(receive)
                messageAdapter.add(receiveItem)
                val recyclerView = findViewById<RecyclerView>(R.id.listmessage)
                recyclerView.scrollToPosition(messageAdapter.getItemCount() - 1);
            }


        }

    }

    private fun receiveAutosended() {

        GlobalScope.launch(Dispatchers.Main) {
            delay(100)
            val sharedPeref = getSharedPreferences("setNumber", MODE_PRIVATE)
            val nums =sharedPeref.getString("number", null)
            val cursor: Cursor? = getContentResolver().query(
                Uri.parse("content://sms/sent"),
                null,
                "address='$nums'",
                null,
                null
            )


            val  smsList = ArrayList<String>()
            while (cursor?.moveToNext() == true) {
                val messageSend = cursor?.getString(12)
                smsList.add(messageSend)

            }
            smsList.reverse()
            for (x in smsList){
                val receive = Message(text = "$x", sendBy = "")
                val receiveItem = SendMessageItem(receive)
                messageAdapter.add(receiveItem)
                val recyclerView = findViewById<RecyclerView>(R.id.listmessage)
                recyclerView.scrollToPosition(messageAdapter.getItemCount() - 1);
            }


//            while (cursor?.moveToNext() == true) {
//                val messageSend = cursor?.getString(12)
//                val receive = Message(text = "$messageSend", sendBy = "")
//                val receiveItem = SendMessageItem(receive)
//                messageAdapter.add(receiveItem)
//                val recyclerView = findViewById<RecyclerView>(R.id.listmessage)
//                recyclerView.scrollToPosition(messageAdapter.getItemCount() - 1);
//
//            }

        }

    }

}


class SendMessageItem(private val message: Message) : BindableItem<ItemMessageSendBinding>() {

    override fun getLayout(): Int {
        return R.layout.item_message_send
    }

    override fun bind(viewBinding: ItemMessageSendBinding, position: Int) {
        viewBinding.message = message
    }
}

class ReceiveMessageItem(private val message: Message) : BindableItem<ItemMessageReceiveBinding>() {
    override fun getLayout(): Int {
        return R.layout.item_message_receive

    }

    override fun bind(viewBinding: ItemMessageReceiveBinding, position: Int) {
        viewBinding.message = message
    }
}
