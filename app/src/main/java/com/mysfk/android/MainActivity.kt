package com.mysfk.android

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.mysfk.android.databinding.ActivityMainBinding
import com.mysfk.android.frogments.HomeFragment
import com.mysfk.android.frogments.MessageFragment
import com.mysfk.android.frogments.ControlFragment
import com.mysfk.android.frogments.SettingsFragment
import com.mysfk.android.frogments.ReviewFragment


class MainActivity : AppCompatActivity() {

//    lateinit var phoneEdt: EditText
//    lateinit var secComend: Button
//    lateinit var treeComend: Button
//    lateinit var firstComend : Button

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())


        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_LTR


        binding.bottomNavigation.setItemSelected(R.id.home, true)
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it) {
                R.id.home   -> {
                    binding.headerTitle.text = "خـانـه"
                    binding.headerTitle.setTextColor(getResources().getColor(R.color.home_iconc))
                    replaceFragment(HomeFragment())
                }
                R.id.review -> {
                    binding.headerTitle.text = "مـنو بـازبیـنی"
                    binding.headerTitle.setTextColor(getResources().getColor(R.color.review_icon))
                    replaceFragment(ReviewFragment())
                }
                R.id.control -> {
                    binding.headerTitle.text = "مـنو کـنترل"
                    binding.headerTitle.setTextColor(getResources().getColor(R.color.control_icon))
                    replaceFragment(ControlFragment())
                }
                R.id.message -> {
                    binding.headerTitle.text = "گـفتگو با سـابرینا"
                    binding.headerTitle.setTextColor(getResources().getColor(R.color.chat_icon))
                    replaceFragment(MessageFragment())
                }
                R.id.settings -> {
                    binding.headerTitle.text = "تنظیـمات نـرم افزار"
                    binding.headerTitle.setTextColor(getResources().getColor(R.color.settings_icon))
                    replaceFragment(SettingsFragment())
                }
                else -> {

                }
            }
            true
        }

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//        val isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
//            .getBoolean("isFirstRun", true)
//
//        if (isFirstRun) {
//            //show start activity
//            startActivity(Intent(this@MainActivity, WelcomeActivity::class.java))
//        }
//        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
//            .putBoolean("isFirstRun", false).commit()

    }



    private fun replaceFragment(fragment : Fragment){
        val fragmentManger = supportFragmentManager
        val  fragmentTransaction = fragmentManger.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.commit()
    }

}