package com.msamil.pisagorucgeni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.*
import kotlin.math.sqrt

class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hesapla.setOnClickListener {

            if (!abSide.equals("") && !bcSide.equals("")){
                val ab = abSide.text.toString().toFloat()
                val bc = bcSide.text.toString().toFloat()

                val sonuc = hesap(ab,bc)

                sonucText.text = "Sonuç : ${sonuc}"

            }




        }
    }

    fun hesap (ab:Float,bc:Float):Float {
        val ca2 = (ab*ab)+(bc*bc)
        val sonuc = sqrt(ca2)

        return sonuc
    }
}