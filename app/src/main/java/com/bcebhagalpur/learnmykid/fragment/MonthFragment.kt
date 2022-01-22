package com.bcebhagalpur.learnmykid.fragment

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import com.bcebhagalpur.learnmykid.R

class MonthFragment : Fragment() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn10: Button
    private lateinit var btn11: Button
    private lateinit var btn12: Button
    private lateinit var txtHeader:TextView
    private lateinit var mediaPlayer:MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view= inflater.inflate(R.layout.activity_level3, container, false)
        btn1=view.findViewById(R.id.btn1)
        btn2=view.findViewById(R.id.btn2)
        btn3=view.findViewById(R.id.btn3)
        btn4=view.findViewById(R.id.btn4)
        btn5=view.findViewById(R.id.btn5)
        btn6=view.findViewById(R.id.btn6)
        btn7=view.findViewById(R.id.btn7)
        btn8=view.findViewById(R.id.btn8)
        btn9=view.findViewById(R.id.btn9)
        btn10=view.findViewById(R.id.btn10)
        btn11=view.findViewById(R.id.btn11)
        btn12=view.findViewById(R.id.btn12)
        txtHeader=view.findViewById(R.id.txtHeader)

        btn1.text=getString(R.string.january)
        btn2.text=getString(R.string.february)
        btn3.text=getString(R.string.march)
        btn4.text=getString(R.string.april)
        btn5.text=getString(R.string.may)
        btn6.text=getString(R.string.june)
        btn7.text=getString(R.string.july)
        btn8.text=getString(R.string.august)
        btn9.text=getString(R.string.september)
        btn10.text=getString(R.string.october)
        btn11.text=getString(R.string.november)
        btn12.text=getString(R.string.december)
        txtHeader.text=getString(R.string.month_name)

        setMonthListener()

        return view
    }

    private fun changeMonthName(view: View){

        val monthSound= arrayOf(R.raw.january,R.raw.february,R.raw.march,R.raw.april,R.raw.may,R.raw.june, R.raw.july,R.raw.august,R.raw.september,R.raw.october,R.raw.november,R.raw.december)
        when(view.id){
            R.id.btn1->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[0]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn2->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[1]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn3->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[2]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn4->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[3]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn5->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[4]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn6->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[5]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn7->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[6]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn8->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[7]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn9->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[8]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn10->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[9]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn11->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[10]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.btn12->{
                mediaPlayer = MediaPlayer.create(activity as Context, monthSound[11]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }

        }
    }
    private fun setMonthListener(){
        val idList= listOf<View>(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn9,btn10,btn11,btn12)
        for (item in idList){
            item.setOnClickListener { changeMonthName(it) }
        }
    }

}
