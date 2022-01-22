package com.bcebhagalpur.learnmykid.activity

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bcebhagalpur.learnmykid.R

class Level5 : AppCompatActivity() {

    private lateinit var txt1: TextView
    private lateinit var txt2: TextView
    private lateinit var txt3: TextView
    private lateinit var txt4: TextView
    private lateinit var txt5: TextView
    private lateinit var txt6: TextView
    private lateinit var txt7: TextView
    private lateinit var txt8: TextView
    private lateinit var txt9: TextView
    private lateinit var txt10: TextView
    private lateinit var txt11: TextView
    private lateinit var txt12: TextView
    private lateinit var txt13:TextView
    private lateinit var txt14:TextView

    private lateinit var img1: ImageView
    private lateinit var img2: ImageView
    private lateinit var img3: ImageView
    private lateinit var img4: ImageView
    private lateinit var img5: ImageView
    private lateinit var img6: ImageView
    private lateinit var img7: ImageView
    private lateinit var img8: ImageView
    private lateinit var img9: ImageView
    private lateinit var img10: ImageView
    private lateinit var img11: ImageView
    private lateinit var img12: ImageView
    private lateinit var img13: ImageView
    private lateinit var img14: ImageView
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level5)

        supportActionBar?.title ="Level 5"

        txt1=findViewById(R.id.txt1)
        txt2=findViewById(R.id.txt2)
        txt3=findViewById(R.id.txt3)
        txt4=findViewById(R.id.txt4)
        txt5=findViewById(R.id.txt5)
        txt6=findViewById(R.id.txt6)
        txt7=findViewById(R.id.txt7)
        txt8=findViewById(R.id.txt8)
        txt9=findViewById(R.id.txt9)
        txt10=findViewById(R.id.txt10)
        txt11=findViewById(R.id.txt11)
        txt12=findViewById(R.id.txt12)
        txt13=findViewById(R.id.txt13)
        txt14=findViewById(R.id.txt14)

        img1=findViewById(R.id.img1)
        img2=findViewById(R.id.img2)
        img3=findViewById(R.id.img3)
        img4=findViewById(R.id.img4)
        img5=findViewById(R.id.img5)
        img6=findViewById(R.id.img6)
        img7=findViewById(R.id.img7)
        img8=findViewById(R.id.img8)
        img9=findViewById(R.id.img9)
        img10=findViewById(R.id.img10)
        img11=findViewById(R.id.img11)
        img12=findViewById(R.id.img12)
        img13=findViewById(R.id.img13)
        img14=findViewById(R.id.img14)

        setImageListener()
    }

    private fun changeImage(view: View){
        val randInt=(0..13).random()
        val shapeName= arrayOf("TRIANGLE","TRAPEZED","POLYGON","HEXAGON","PENTAGON","RING","RIGHT TRIANGLE",
            "CROSS","RECTANGLE","SQUARE","ARROW","ELLIPSE","STAR","CIRCLE")
        when(view.id){
            R.id.img1->{
                txt1.text=shapeName[randInt]
                mediaPlayer = if (txt1.text==shapeName[0]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img2->{
                txt2.text=shapeName[randInt]
                mediaPlayer = if (txt2.text==shapeName[1]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }

            }
            R.id.img3->{
                txt3.text=shapeName[randInt]
                mediaPlayer = if (txt3.text==shapeName[2]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img4->{
                txt4.text=shapeName[randInt]
                mediaPlayer = if (txt4.text==shapeName[3]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img5->{
                txt5.text=shapeName[randInt]
                mediaPlayer = if (txt5.text==shapeName[4]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img6->{
                txt6.text=shapeName[randInt]
                mediaPlayer = if (txt6.text==shapeName[5]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
                }
            R.id.img7->{
                txt7.text=shapeName[randInt]
                mediaPlayer = if (txt7.text==shapeName[6]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img8->{
                txt8.text=shapeName[randInt]
                mediaPlayer = if (txt8.text==shapeName[7]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img9->{
                txt9.text=shapeName[randInt]
                mediaPlayer = if (txt9.text==shapeName[8]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img10->{ txt10.text=shapeName[randInt]
                mediaPlayer = if (txt10.text==shapeName[9]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img11->{
                txt11.text=shapeName[randInt]
                mediaPlayer = if (txt11.text==shapeName[10]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img12->{
                txt12.text=shapeName[randInt]
                mediaPlayer = if (txt12.text==shapeName[11]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img13->{txt13.text=shapeName[randInt]
                mediaPlayer = if (txt13.text==shapeName[12]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
            R.id.img14->{ txt14.text=shapeName[randInt]
                mediaPlayer = if (txt14.text==shapeName[13]){
                    MediaPlayer.create(this,R.raw.right).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }else{
                    MediaPlayer.create(this,R.raw.wrong).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }
            }
        }

        if (txt1.text=="TRIANGLE"&&txt2.text=="TRAPEZED"&&txt3.text=="POLYGON"&&txt4.text=="HEXAGON"
            &&txt5.text=="PENTAGON"&&txt6.text=="RING"&&
            txt7.text=="RIGHT TRIANGLE"&&txt8.text=="CROSS"&&txt9.text=="RECTANGLE"
            &&txt10.text=="SQUARE"&&txt11.text=="ARROW"&&txt12.text=="ELLIPSE"&&txt13.text=="STAR"&&txt14.text=="CIRCLE")
        {
            Handler().postDelayed({
                val intent= Intent(this,CongratulationActivity::class.java)
                startActivity(intent)
                finish()
            },1000)
        }

    }

    private fun setImageListener(){

        val idList= listOf<View>(img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14)
        for (item in idList) {
            item.setOnClickListener { changeImage(it) }
        }
    }
}
