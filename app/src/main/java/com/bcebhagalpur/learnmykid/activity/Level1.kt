package com.bcebhagalpur.learnmykid.activity

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.bcebhagalpur.learnmykid.R
import com.bcebhagalpur.learnmykid.databinding.ActivityLevel1Binding
import kotlinx.android.synthetic.main.activity_level1.*

class Level1 : AppCompatActivity() {

    private lateinit var binding:ActivityLevel1Binding
    private lateinit var array: Array<Button>
    lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding= DataBindingUtil.setContentView(this,R.layout.activity_level1)
        supportActionBar?.title ="Level 1"

        array=(arrayOf(binding.txtA,binding.txtB,binding.txtC,binding.txtD,binding.txtE,binding.txtF,binding.txtG,binding.txtH,binding.txtI,binding.txtJ,
            binding.txtK,binding.txtL,binding.txtM,binding.txtN,binding.txtO,binding.txtP,binding.txtQ,binding.txtR,binding.txtS,binding.txtT,
            binding.txtU,binding.txtV,binding.txtW,binding.txtX,binding.txtY,binding.txtZ))
        alphabetListener()
    }

    private fun changeABCD(view: View){

        val soundList= arrayOf(R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i
            ,R.raw.j,R.raw.k,R.raw.l,R.raw.m,R.raw.n,R.raw.o,R.raw.p,R.raw.q,R.raw.r,R.raw.s,R.raw.t,R.raw.u
            ,R.raw.v,R.raw.w,R.raw.x,R.raw.y,R.raw.z)
        val randInt=(0..25).random()
        val listAlphabet= arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
        val idList1= arrayOf(R.id.txtA,R.id.txtB,R.id.txtC,R.id.txtD,R.id.txtE,R.id.txtF,R.id.txtG,R.id.txtH,R.id.txtI,R.id.txtJ,
            R.id.txtK,R.id.txtL,R.id.txtM,R.id.txtN,R.id.txtO,R.id.txtP,R.id.txtQ,R.id.txtR,R.id.txtS,R.id.txtT,
            R.id.txtU,R.id.txtV,R.id.txtW,R.id.txtX,R.id.txtY,R.id.txtZ)
        for (i in 0..25){
            when(view.id) {
                idList1[i]->{array[i].text=listAlphabet[randInt]
                    mediaPlayer = MediaPlayer.create(this, soundList[randInt]).apply {
                        setOnPreparedListener { start() }
                        setOnCompletionListener { reset() }
                    }
                }

            }
        }

        val listBtn= arrayOf(txtA.text,txtB.text,txtC.text,txtD.text,txtE.text,txtF.text,txtG.text,txtH.text,txtI.text,txtJ.text,
            txtK.text,txtL.text,txtM.text,txtN.text,txtO.text,txtP.text,txtQ.text,txtR.text,txtS.text,txtT.text,
            txtU.text,txtV.text,txtW.text,txtX.text,txtY.text,txtZ.text)
        if (listBtn.contentEquals(listAlphabet)){
            Handler().postDelayed({
                val intent= Intent(this,CongratulationActivity::class.java)
                startActivity(intent)
                finish()
            },1000)
        }
    }

    private fun alphabetListener(){
        val idList= listOf<View>(txtA,txtB,txtC,txtD,txtE,txtF,txtG,txtH,txtI,txtJ,txtK,txtL,txtM,txtN,txtO,txtP,txtQ,txtR,txtS,txtT,
            txtU,txtV,txtW,txtX,txtY,txtZ)
        for (item in idList){
            item.setOnClickListener { changeABCD(it) }
        }
    }
}
