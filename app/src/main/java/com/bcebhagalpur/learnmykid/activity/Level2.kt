package com.bcebhagalpur.learnmykid.activity

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import com.bcebhagalpur.learnmykid.R

class Level2 : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level2)
        supportActionBar?.title ="Level 2"


        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
        btn4=findViewById(R.id.btn4)
        btn5=findViewById(R.id.btn5)
        btn6=findViewById(R.id.btn6)
        btn7=findViewById(R.id.btn7)

        setDayListener()
    }

    private fun changeWeekDay(view: View){
        val randInt=(0..6).random()
        val dayList= arrayOf("SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY")
        val colorList= arrayOf(Color.DKGRAY, Color.MAGENTA, Color.RED, Color.GREEN, Color.YELLOW, Color.TRANSPARENT, Color.CYAN)
        val array= arrayOf(R.raw.sunday,R.raw.monday,R.raw.tuesday,R.raw.wednesday,R.raw.thursday,R.raw.friday,
        R.raw.saturday)
        when(view.id){
            R.id.btn1->{view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }

                btn1.text=dayList[randInt]
            }
            R.id.btn2->{view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt])
                mediaPlayer.start()
                btn2.text=dayList[randInt]
            }
            R.id.btn3->{view.setBackgroundColor(colorList[randInt])
                mediaPlayer=MediaPlayer.create(this,array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                btn3.text=dayList[randInt]
            }
            R.id.btn4->{view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                btn4.text=dayList[randInt]
            }
            R.id.btn5->{view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                btn5.text=dayList[randInt]
            }
            R.id.btn6->{view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                btn6.text=dayList[randInt]
            }
            R.id.btn7->{view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                btn7.text=dayList[randInt]
            }
        }

        if (btn1.text=="SUNDAY"&&btn2.text=="MONDAY"&&btn3.text=="TUESDAY"&&btn4.text=="WEDNESDAY"&&btn5.text=="THURSDAY"&&btn6.text=="FRIDAY"&&btn7.text=="SATURDAY"){
            Handler().postDelayed({
                val intent= Intent(this,CongratulationActivity::class.java)
                startActivity(intent)
                finish()
            },1000)
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
