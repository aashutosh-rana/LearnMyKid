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


class WeekFragment : Fragment() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var txtHeader:TextView
    private lateinit var mediaPlayer:MediaPlayer
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {val view=inflater.inflate(R.layout.activity_level2, container, false)

        btn1=view.findViewById(R.id.btn1)
        btn2=view.findViewById(R.id.btn2)
        btn3=view.findViewById(R.id.btn3)
        btn4=view.findViewById(R.id.btn4)
        btn5=view.findViewById(R.id.btn5)
        btn6=view.findViewById(R.id.btn6)
        btn7=view.findViewById(R.id.btn7)
        txtHeader=view.findViewById(R.id.txtHeader)

        btn1.text=getString(R.string.sunday)
        btn2.text=getString(R.string.monday)
        btn3.text=getString(R.string.tuesday)
        btn4.text=getString(R.string.wednesday)
        btn5.text=getString(R.string.thursday)
        btn6.text=getString(R.string.friday)
        btn7.text=getString(R.string.saturday)
        txtHeader.text=getString(R.string.week_name)
        setDayListener()
        return view
    }

    private fun changeWeekDay(view: View){
        val weekSound= arrayOf(R.raw.sunday,R.raw.monday,R.raw.tuesday,R.raw.wednesday,R.raw.thursday,R.raw.friday,
            R.raw.saturday)
        when(view.id){
            R.id.btn1->{
                mediaPlayer = MediaPlayer.create(activity as Context, weekSound[0]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }

            }
            R.id.btn2->{
                mediaPlayer = MediaPlayer.create(activity as Context, weekSound[1])
                mediaPlayer.start()
            }
            R.id.btn3->{
                mediaPlayer=MediaPlayer.create(activity as Context,weekSound[2]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
            }
            R.id.btn4->{
                mediaPlayer = MediaPlayer.create(activity as Context, weekSound[3]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
            }
            R.id.btn5->{
                mediaPlayer = MediaPlayer.create(activity as Context, weekSound[4]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
            }
            R.id.btn6->{
                mediaPlayer = MediaPlayer.create(activity as Context, weekSound[5]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
            }
            R.id.btn7->{
                mediaPlayer = MediaPlayer.create(activity as Context, weekSound[6]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
            }
        }


    }

    private fun setDayListener(){
        val idList= listOf<View>(btn1,btn2,btn3,btn4,btn5,btn6,btn7)
        for (item in idList){
            item.setOnClickListener {
                changeWeekDay(it)
            }
        }
    }

}
