package com.bcebhagalpur.learnmykid.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.bcebhagalpur.learnmykid.R

class PoetryFragment : Fragment() {
    private lateinit var txt1: TextView
    private lateinit var txt2: TextView
    private lateinit var txt3: TextView
    private lateinit var txt4: TextView
    private lateinit var txt5: TextView
    private lateinit var txt6: TextView
    private lateinit var txt7: TextView
    private lateinit var txt8: TextView
    private lateinit var txt9: TextView
    private lateinit var txtHeader: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view= inflater.inflate(R.layout.activity_level6, container, false)

        txt1=view.findViewById(R.id.txt1)
        txt2=view.findViewById(R.id.txt2)
        txt3=view.findViewById(R.id.txt3)
        txt4=view.findViewById(R.id.txt4)
        txt5=view.findViewById(R.id.txt5)
        txt6=view.findViewById(R.id.txt6)
        txt7=view.findViewById(R.id.txt7)
        txt8=view.findViewById(R.id.txt8)
        txt9=view.findViewById(R.id.txt9)

        txtHeader=view.findViewById(R.id.txtHeader)
        txtHeader.text=""
        txt1.text=getString(R.string.twinkle_twinkle_little_star)
        txt2.text=getString(R.string.how_i_wonder_what_you_are)
        txt3.text=getString(R.string.up_above_the_world_so_high)
        txt4.text=getString(R.string.like_a_diamond_in_the_sky)
        txt5.text=getString(R.string.twinkle_twinkle_little_star)
        txt6.text=getString(R.string.how_i_wonder_what_you_are_1)
        txt7.text=getString(R.string.when_the_blazing_sun_is_gone)
        txt8.text=getString(R.string.when_he_nothing_shines_upon)
        txt9.text=getString(R.string.then_you_show)

        return view
    }

}
