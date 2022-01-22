package com.bcebhagalpur.learnmykid.fragment

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.bcebhagalpur.learnmykid.R


class AnimalFragment : Fragment() {

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
    private lateinit var mediaPlayer:MediaPlayer


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {val view= inflater.inflate(R.layout.fragment_animal, container, false)
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
        setImageListener()
        return view
    }

    private fun changeImage(view: View){
        val animalSound= arrayOf(R.raw.bear,R.raw.elephant,R.raw.tiger,R.raw.leopard
            ,R.raw.lion,R.raw.jiraff,R.raw.wolf,R.raw.fox,R.raw.rhinoceros,R.raw.kangaroo,R.raw.zebra,R.raw.gorilla)

        when(view.id){
            R.id.img1->{mediaPlayer= MediaPlayer.create(activity as Context,animalSound[0]).apply {
                setOnPreparedListener { start() }
                setOnCompletionListener { reset() }
            }
            }
            R.id.img2->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[1]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img3->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[2]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img4->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[3]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img5->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[4]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img6->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[5]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img7->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[6]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img8->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[7]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img9->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[8]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img10->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[9]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img11->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[10]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
            R.id.img12->{
                mediaPlayer= MediaPlayer.create(activity as Context,animalSound[11]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
            }
        }

    }

    private fun setImageListener(){

        val idList= listOf<View>(img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12)
        for (item in idList) {
            item.setOnClickListener { changeImage(it) }
        }
    }

}
