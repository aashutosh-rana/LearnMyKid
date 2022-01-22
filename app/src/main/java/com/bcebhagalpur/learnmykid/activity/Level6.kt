package com.bcebhagalpur.learnmykid.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.bcebhagalpur.learnmykid.R
import com.bcebhagalpur.learnmykid.databinding.ActivityLevel6Binding
import kotlinx.android.synthetic.main.activity_level6.*

class Level6 : AppCompatActivity() {

    private lateinit var binding: ActivityLevel6Binding
    private lateinit var array1: Array<TextView>
    private lateinit var array2: Array<TextView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_level6)

        supportActionBar?.title ="Level 6"

        array1= arrayOf(binding.txt1,binding.txt2,binding.txt3,binding.txt4)
        array2= arrayOf(binding.txt5,binding.txt6,binding.txt7,binding.txt8,binding.txt9)

        lineListener()
    }

    private fun changeText1(view: View){
        val randInt1=(0..3).random()
        val lineList1= arrayOf("Twinkle, twinkle, little star","How I wonder what you are","Up above the world so high",
            "Like a diamond in the sky")
        val idList1= arrayOf(R.id.txt1,R.id.txt2,R.id.txt3,R.id.txt4)
        for (i in 0..3){
            when(view.id){
                idList1[i]->array1[i].text=lineList1[randInt1]
            }
        }

        val randInt2=(0..4).random()
        val lineList2= arrayOf("Twinkle, twinkle, little star","How I wonder what you are","When the blazing sun is gone",
            "When he nothing shines upon","Then you show…")
        val idList2= arrayOf(R.id.txt5,R.id.txt6,R.id.txt7,R.id.txt8,R.id.txt9)
        for (j in 0..4){
            when(view.id){
                idList2[j]->array2[j].text=lineList2[randInt2]
            }
        }
        val lisText1= arrayOf(txt1.text,txt2.text,txt3.text,txt4.text)
        val listText2= arrayOf(txt5.text,txt6.text,txt7.text,txt8.text,txt9.text)

        if (lisText1.contentEquals(lineList1) && listText2.contentEquals(lineList2)){
            Handler().postDelayed({
                val intent= Intent(this,CongratulationActivity::class.java)
                startActivity(intent)
                finish()
            },1000)
        }
    }


    private fun lineListener(){
        val idList3= arrayOf(txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9)
        for (item in idList3){
            item.setOnClickListener { changeText1(it) }
        }
    }

}
