package com.mysfk.android.frogments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.mysfk.android.*

class ControlFragment: Fragment() {


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_order, container, false).apply {

        val openBohary= findViewById<Button>(R.id.heaters)
        openBohary.setOnClickListener {
            activity?.let{
                val intent = Intent (it, bokhriActivity::class.java)
                it.startActivity(intent)
            }
        }
        val openDariche =findViewById<Button>(R.id.vents)
        openDariche.setOnClickListener {
            activity?.let{
                val intent = Intent (it, daricheActivity::class.java)
                it.startActivity(intent)
            }
        }

        val openFanPads =findViewById<Button>(R.id.fans)
        openFanPads.setOnClickListener {
            activity?.let{
                val intent = Intent (it, fanPadsActivity::class.java)
                it.startActivity(intent)
            }
        }

        val openabyari =findViewById<Button>(R.id.abyari)
        openabyari.setOnClickListener {
            activity?.let{
                val intent = Intent (it, abyariActivity::class.java)
                it.startActivity(intent)
            }
        }

        val openshades =findViewById<Button>(R.id.shades)
        openshades.setOnClickListener {
            activity?.let{
                val intent = Intent (it, shadesActivity::class.java)
                it.startActivity(intent)
            }
        }

        val openmehpash =findViewById<Button>(R.id.mehpash)
        openmehpash.setOnClickListener {
            activity?.let{
                val intent = Intent (it, mehpashActivity::class.java)
                it.startActivity(intent)
            }
        }

        val opencharkheshi =findViewById<Button>(R.id.charkheshi)
        opencharkheshi.setOnClickListener {
            activity?.let{
                val intent = Intent (it, charkheshiActivity::class.java)
                it.startActivity(intent)
            }
        }


    }
}