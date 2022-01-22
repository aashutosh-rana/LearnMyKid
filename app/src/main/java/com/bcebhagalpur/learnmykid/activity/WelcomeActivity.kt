package com.bcebhagalpur.learnmykid.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.bcebhagalpur.learnmykid.R

class WelcomeActivity : AppCompatActivity() {
    private lateinit var txtAppName:ImageView
    private lateinit var txtAppName1:TextView
    private lateinit var txtDeveloperName:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        Handler().postDelayed({
            val intent= Intent(this@WelcomeActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)

        txtAppName=findViewById(R.id.txtAppName)
        txtAppName1=findViewById(R.id.txtAppName1)
        txtDeveloperName=findViewById(R.id.txtDeveloperName)
        val animation=AnimationUtils.loadAnimation(this,R.anim.bounce)
        val animation2=AnimationUtils.loadAnimation(this,R.anim.bounce)
        val animation1=AnimationUtils.loadAnimation(this,R.anim.zoom_in)
        txtDeveloperName.startAnimation(animation)
        txtAppName.startAnimation(animation1)
        txtAppName1.startAnimation(animation2)
        supportActionBar?.hide()
    }
}
