package com.bcebhagalpur.learnmykid.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.FragmentTransaction
import com.bcebhagalpur.learnmykid.R
import com.bcebhagalpur.learnmykid.fragment.DrawFragment
import com.bcebhagalpur.learnmykid.fragment.HomeFragment
import com.bcebhagalpur.learnmykid.fragment.LearnFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var homeFragment: HomeFragment
    private lateinit var learnFragment: LearnFragment
    private lateinit var drawFragment:DrawFragment
    private var previousMenuItem: MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView=findViewById(R.id.bottomNavigationView)
        myHomeFragment()
        bottom()
    }

    private fun bottom(){
        bottomNavigationView.setOnNavigationItemSelectedListener {

            if (previousMenuItem != null){
                previousMenuItem?.isChecked = false
            }

            it.isCheckable = true
            it.isChecked = true
            previousMenuItem = it

            when(it.itemId){
                R.id.home->{
                    myHomeFragment()
                }
                R.id.learn->{
                    learnFragment= LearnFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout,learnFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                    supportActionBar?.hide()
                }
                R.id.draw->{
                    drawFragment= DrawFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout,drawFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                    supportActionBar?.hide()
                }
            }
            true
        }
    }
    @SuppressLint("ResourceAsColor")
    private fun myHomeFragment(){
        homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
        supportActionBar?.title ="Play"
        supportActionBar?.show()
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        val id = item.itemId
//
//        if (id == android.R.id.home){
//
//        }
//
//        return super.onOptionsItemSelected(item)
//    }

    override fun onBackPressed() {
        when(supportFragmentManager.findFragmentById(R.id.frameLayout)){
            !is HomeFragment-> {
                myHomeFragment()
            }
            else->super.onBackPressed()
        }
    }


}
