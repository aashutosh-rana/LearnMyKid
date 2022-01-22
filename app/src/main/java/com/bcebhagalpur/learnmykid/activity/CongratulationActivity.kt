package com.bcebhagalpur.learnmykid.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bcebhagalpur.learnmykid.R

class CongratulationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congratulation)
        supportActionBar?.hide()
    }
}
