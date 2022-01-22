package com.bcebhagalpur.learnmykid.fragment

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.bcebhagalpur.learnmykid.R

class ShapeFragment : Fragment() {

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
    private lateinit var txt13: TextView
    private lateinit var txt14: TextView
    private lateinit var txtMain: TextView

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view= inflater.inflate(R.layout.activity_level5, container, false)

        txt1=view.findViewById(R.id.txt1)
        txt2=view.findViewById(R.id.txt2)
        txt3=view.findViewById(R.id.txt3)
        txt4=view.findViewById(R.id.txt4)
        txt5=view.findViewById(R.id.txt5)
        txt6=view.findViewById(R.id.txt6)
        txt7=view.findViewById(R.id.txt7)
        txt8=view.findViewById(R.id.txt8)
        txt9=view.findViewById(R.id.txt9)
        txt10=view.findViewById(R.id.txt10)
        txt11=view.findViewById(R.id.txt11)
        txt12=view.findViewById(R.id.txt12)
        txt13=view.findViewById(R.id.txt13)
        txt14=view.findViewById(R.id.txt14)

        txtMain=view.findViewById(R.id.txtMain)

        img1=view.findViewById(R.id.img1)
        img2=view.findViewById(R.id.img2)
        img3=view.findViewById(R.id.img3)
        img4=view.findViewById(R.id.img4)
        img5=view.findViewById(R.id.img5)
        img6=view.findViewById(R.id.img6)
        img7=view.findViewById(R.id.img7)
        img8=view.findViewById(R.id.img8)
        img9=view.findViewById(R.id.img9)
        img10=view.findViewById(R.id.img10)
        img11=view.findViewById(R.id.img11)
        img12=view.findViewById(R.id.img12)
        img13=view.findViewById(R.id.img13)
        img14=view.findViewById(R.id.img14)

        txtMain.text=getString(R.string.shape_touch_me)
        txt1.text=getString(R.string.triangle)
        txt2.text=getString(R.string.trapaze)
        txt3.text=getString(R.string.polygon)
        txt4.text=getString(R.string.hexagon)
        txt5.text=getString(R.string.pentagon)
        txt6.text=getString(R.string.ring)
        txt7.text=getString(R.string.right_triangle)
        txt8.text=getString(R.string.cross)
        txt9.text=getString(R.string.rectangle)
        txt10.text=getString(R.string.square)
        txt11.text=getString(R.string.arrow)
        txt12.text=getString(R.string.elipse)
        txt13.text=getString(R.string.star)
        txt14.text=getString(R.string.circle)
        setImageListener()
    return view
    }

    private fun changeImage(view: View){
        val shapeSound= arrayOf(R.raw.triangle,R.raw.trapezem,R.raw.polygon,R.raw.hexagon,R.raw.pentagon,R.raw.ring
            ,R.raw.righttriangle,R.raw.cross,R.raw.rectangle,R.raw.square,R.raw.arrow,R.raw.ellipse,R.raw.star,R.raw.circle)
        when(view.id){
            R.id.img1->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[0]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img2->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[1]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img3->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[2]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img4->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[3]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img5->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[4]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img6->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[5]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img7->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[6]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img8->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[7]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img9->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[8]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img10->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[9]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img11->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[10]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img12->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[11]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img13->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[12]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img14->{
                mediaPlayer= MediaPlayer.create(activity as Context,shapeSound[13]).apply {
                    setOnPreparedListener{start()}
                    setOnCompletionListener { reset() }
                }
            }
        }

    }

    private fun setImageListener(){

        val idList= listOf<View>(img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14)
        for (item in idList) {
            item.setOnClickListener { changeImage(it) }
        }
    }
}

