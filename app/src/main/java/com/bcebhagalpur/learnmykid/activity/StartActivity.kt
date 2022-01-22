package com.bcebhagalpur.learnmykid.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.bcebhagalpur.learnmykid.R
import com.bcebhagalpur.learnmykid.fragment.DeveloperFragment
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    private lateinit var btnLevel1: Button
    private lateinit var btnLevel2: Button
    private lateinit var btnLevel3: Button
    private lateinit var btnLevel4: Button
    private lateinit var btnLevel5: Button
    private lateinit var btnLevel6: Button
    private lateinit var btnLevel7: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        btnLevel1 = findViewById(R.id.btnLevel1)
        btnLevel2 = findViewById(R.id.btnLevel2)
        btnLevel3 = findViewById(R.id.btnLevel3)
        btnLevel4 = findViewById(R.id.btnLevel4)
        btnLevel5 = findViewById(R.id.btnLevel5)
        btnLevel6 = findViewById(R.id.btnLevel6)
        btnLevel7 = findViewById(R.id.btnLevel7)

        val array =
            arrayOf(btnLevel1, btnLevel2, btnLevel3, btnLevel4, btnLevel5, btnLevel6, btnLevel7)
        val activityList =
            arrayOf(Level1(), Level2(), Level3(), Level4(), Level5(), Level6(), Level7())

        for (i in 0..6) {
            array[i].setOnClickListener {
                val intent = Intent(this, activityList[i]::class.java)
                startActivity(intent)
            }
        }
    }

}
