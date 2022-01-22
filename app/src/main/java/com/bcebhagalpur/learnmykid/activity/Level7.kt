package com.bcebhagalpur.learnmykid.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import com.bcebhagalpur.learnmykid.R
import kotlinx.android.synthetic.main.activity_level7.*

class Level7 : AppCompatActivity() {
    private lateinit var txtComingSoon:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level7)
        txtComingSoon = findViewById(R.id.txtComingSoon)
        supportActionBar?.title ="Level 7"
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
        txtComingSoon.startAnimation(animation)
    }
}
