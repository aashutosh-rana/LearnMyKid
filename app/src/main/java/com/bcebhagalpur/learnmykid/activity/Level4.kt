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

class Level4 : AppCompatActivity() {

    private lateinit var txtMainText: TextView
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

    private lateinit var imgMainImage: ImageView
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
    private lateinit var mediaPlayer: MediaPlayer

    private val randInt=(0..11).random()
    private val animalsName = arrayOf("BEAR","ZEBRA","ELEPHANT","TIGER","LION","LEOPARD","GIRAFFE","RHINOCEROS","FOX","WOLF","GORILLA","KANGAROO")
    private val imageList= arrayOf(R.drawable.bear,R.drawable.zebra,R.drawable.elephant,R.drawable.tiger,
        R.drawable.lion,R.drawable.leopard,R.drawable.jiraf,R.drawable.rhinoceros,R.drawable.fox,R.drawable.wolf,R.drawable.gorila,R.drawable.kangaroo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level4)

        supportActionBar?.title ="Level 4"

        txtMainText=findViewById(R.id.txtMainText)
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

        imgMainImage=findViewById(R.id.imgMainImage)
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

        imgMainImage.setBackgroundResource(imageList[randInt])
        txtMainText.text=animalsName[randInt]

        setImageListener()
    }

    private fun changeImage(view: View){
        val animalSound= arrayOf(R.raw.bear,R.raw.zebra,R.raw.elephant,R.raw.tiger
            ,R.raw.lion,R.raw.leopard,R.raw.jiraff,R.raw.rhinoceros,R.raw.fox,R.raw.wolf,R.raw.gorilla,R.raw.kangaroo)

        val imageList= arrayOf(R.drawable.bear,R.drawable.zebra,R.drawable.elephant,R.drawable.tiger,
            R.drawable.lion,R.drawable.leopard,R.drawable.jiraf,R.drawable.rhinoceros,R.drawable.fox,R.drawable.wolf,R.drawable.gorila,R.drawable.kangaroo)
        val randInt=(0..11).random()
        val animalsName= arrayOf("BEAR","ZEBRA","ELEPHANT","TIGER","LION","LEOPARD","GIRAFFE","RHINOCEROS","FOX","WOLF","GORILLA","KANGAROO")

        when(view.id){
            R.id.img1->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                view.setBackgroundResource(imageList[randInt])
                txt1.text=animalsName[randInt]
            }
            R.id.img2->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt2.text=animalsName[randInt]
            }
            R.id.img3->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt3.text=animalsName[randInt]
            }
            R.id.img4->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt4.text=animalsName[randInt]
            }
            R.id.img5->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt5.text=animalsName[randInt]
            }
            R.id.img6->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt6.text=animalsName[randInt]
            }
            R.id.img7->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt7.text=animalsName[randInt]
            }
            R.id.img8->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt8.text=animalsName[randInt]
            }
            R.id.img9->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt9.text=animalsName[randInt]
            }
            R.id.img10->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt10.text=animalsName[randInt]
            }
            R.id.img11->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt11.text=animalsName[randInt]
            }
            R.id.img12->{
                mediaPlayer= MediaPlayer.create(this,animalSound[randInt]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }}
                view.setBackgroundResource(imageList[randInt])
                txt12.text=animalsName[randInt]
            }
        }

        if (txt1.text==txt2.text&&txt1.text==txt3.text&&txt1.text==txt4.text&&txt1.text==txt5.text&&txt1.text==txt6.text&&txt1.text==txt7.text&&
            txt1.text==txt8.text&&txt1.text==txt9.text&&txt1.text==txt10.text&&txt1.text==txt11.text&&txt1.text==txt12.text&&txt1.text==txtMainText.text)
        {
            Handler().postDelayed({
                val intent= Intent(this,CongratulationActivity::class.java)
                startActivity(intent)
                finish()
            },1000)
        }

    }

    private fun setImageListener(){

        val idList= listOf<View>(img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12)
        for (item in idList) {
            item.setOnClickListener { changeImage(it) }
        }
    }

}
