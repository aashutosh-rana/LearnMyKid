package com.bcebhagalpur.learnmykid.activity

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.bcebhagalpur.learnmykid.R
import com.bcebhagalpur.learnmykid.databinding.ActivityLevel3Binding

class Level3 : AppCompatActivity() {

    private lateinit var binding: ActivityLevel3Binding

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
    private lateinit var mediaPlayer: MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_level3)

        supportActionBar?.title ="Level 3"

        btn1=binding.btn1
        btn2=binding.btn2
        btn3=binding.btn3
        btn4=binding.btn4
        btn5=binding.btn5
        btn6=binding.btn6
        btn7=binding.btn7
        btn8=binding.btn8
        btn9=binding.btn9
        btn10=binding.btn10
        btn11=binding.btn11
        btn12=binding.btn12

        setMonthListener()
    }

    private fun changeMonthName(view: View){

        val randInt=(0..11).random()
        val monthList= arrayOf("JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER")
        val array= arrayOf(R.raw.january,R.raw.february,R.raw.march,R.raw.april,R.raw.may,R.raw.june, R.raw.july,R.raw.august,R.raw.september,R.raw.october,R.raw.november,R.raw.december)
        val colorList= arrayOf(Color.DKGRAY, Color.MAGENTA, Color.RED, Color.GREEN, Color.YELLOW, Color.TRANSPARENT, Color.CYAN, Color.WHITE, Color.LTGRAY, Color.GRAY, Color.BLUE, Color.RED)

        when(view.id){
            R.id.btn1->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn1.text=monthList[randInt]
            }
            R.id.btn2->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn2.text=monthList[randInt]
            }
            R.id.btn3->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn3.text=monthList[randInt]
            }
            R.id.btn4->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn4.text=monthList[randInt]
            }
            R.id.btn5->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn5.text=monthList[randInt]
            }
            R.id.btn6->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn6.text=monthList[randInt]
            }
            R.id.btn7->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn7.text=monthList[randInt]
            }
            R.id.btn8->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn8.text=monthList[randInt]
            }
            R.id.btn9->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn9.text=monthList[randInt]
            }
            R.id.btn10->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn10.text=monthList[randInt]
            }
            R.id.btn11->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn11.text=monthList[randInt]
            }
            R.id.btn12->{
                view.setBackgroundColor(colorList[randInt])
                mediaPlayer = MediaPlayer.create(this, array[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                btn12.text=monthList[randInt]
            }

        }
        val listBtn= arrayOf(btn1.text,btn2.text,btn3.text,btn4.text,btn5.text,btn6.text,btn7.text,btn8.text,btn9.text,btn10.text,btn11.text,btn12.text)
        if(listBtn.contentEquals(monthList)){
            Handler().postDelayed({
                val intent= Intent(this,CongratulationActivity::class.java)
                startActivity(intent)
                finish()
            },1000)
        }
    }
    private fun setMonthListener(){
        val idList= listOf<View>(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn9,btn10,btn11,btn12)
        for (item in idList){
            item.setOnClickListener { changeMonthName(it) }
        }
    }
}
