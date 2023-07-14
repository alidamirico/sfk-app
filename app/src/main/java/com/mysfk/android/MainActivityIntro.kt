package com.mysfk.android

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.github.paolorotolo.appintro.AppIntro2
import com.github.paolorotolo.appintro.AppIntro2Fragment
import com.github.paolorotolo.appintro.model.SliderPagerBuilder


class WelcomeActivity : AppIntro2() {


    private fun goToMain() {
        startActivity(Intent(this,passwordActivity::class.java))
    }

 //override fun onSkipPressed(currentFragment: Fragment?) {
     // super.onSkipPressed(currentFragment)
//        goToMain()
//    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        goToMain()
    }

            @RequiresApi(Build.VERSION_CODES.M)
            private fun showIntroSlides() {
//                manager.setFirstRun()

                val pageOne = SliderPagerBuilder()
                    .title(getString(R.string.slide_one_top_text))
                    .description(getString(R.string.slide_one_down_text))
                    .imageDrawable(R.drawable.logo)
                    .titleColor(getColor(R.color.tittles))
                    .descColor(getColor(R.color.tittles))
                    .bgColor(getColor(R.color.slide_one))
                    .build()

                val pageTwo = SliderPagerBuilder()
                    .title(getString(R.string.slide_two_top_text))
                    .description(getString(R.string.slide_two_down_text))
                    .imageDrawable(R.drawable.logo2)
                    .bgColor(getColor(R.color.slide_one))
                    .titleColor(getColor(R.color.tittles))
                    .descColor(getColor(R.color.tittles))
                    .build()

                val pageThree = SliderPagerBuilder()
                    .title(getString(R.string.slide_three_top_text))
                    .description(getString(R.string.slide_three_down_text))
                    .imageDrawable(R.drawable.logo3)
                    .titleColor(getColor(R.color.tittles))
                    .bgColor(getColor(R.color.slide_one))
                    .descColor(getColor(R.color.tittles))
                    .build()

                val pageFour= SliderPagerBuilder()
                    .title(getString(R.string.slide_four_top_text))
                    .description(getString(R.string.slide_four_down_text))
                    .imageDrawable(R.drawable.page4)
                    .titleColor(getColor(R.color.tittles))
                    .bgColor(getColor(R.color.slide_one))
                    .descColor(getColor(R.color.tittles))
                    .build()

                val pageFive= SliderPagerBuilder()
                    .title(getString(R.string.slide_five_top_text))
                    .description(getString(R.string.slide_five_down_text))
                    .imageDrawable(R.drawable.page5)
                    .titleColor(getColor(R.color.tittles))
                    .bgColor(getColor(R.color.slide_one))
                    .descColor(getColor(R.color.tittles))
                    .build()

                val pageSix= SliderPagerBuilder()
                    .title(getString(R.string.slide_Six_top_text))
                    .description(getString(R.string.slide_Six_down_text))
                    .imageDrawable(R.drawable.page6)
                    .titleColor(getColor(R.color.tittles))
                    .bgColor(getColor(R.color.slide_one))
                    .descColor(getColor(R.color.tittles))
                    .build()


                addSlide(AppIntro2Fragment.newInstance(pageOne))
                addSlide(AppIntro2Fragment.newInstance(pageTwo))
                addSlide(AppIntro2Fragment.newInstance(pageThree))
                addSlide(AppIntro2Fragment.newInstance(pageFour))
                addSlide(AppIntro2Fragment.newInstance(pageFive))
                addSlide(AppIntro2Fragment.newInstance(pageSix))




            }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        showIntroSlides()



    }

    }





