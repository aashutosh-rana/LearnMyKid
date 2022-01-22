package com.bcebhagalpur.learnmykid.fragment

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.bcebhagalpur.learnmykid.R

class AlphabateFragment : Fragment() {
    private lateinit var txtHeader:TextView
    private lateinit var txtA:TextView
    private lateinit var txtB:TextView
    private lateinit var txtC:TextView
    private lateinit var txtD:TextView
    private lateinit var txtE:TextView
    private lateinit var txtF:TextView
    private lateinit var txtG:TextView
    private lateinit var txtH:TextView
    private lateinit var txtI:TextView
    private lateinit var txtJ:TextView
    private lateinit var txtK:TextView
    private lateinit var txtL:TextView
    private lateinit var txtM:TextView
    private lateinit var txtN:TextView
    private lateinit var txtO:TextView
    private lateinit var txtP:TextView
    private lateinit var txtQ:TextView
    private lateinit var txtR:TextView
    private lateinit var txtS:TextView
    private lateinit var txtT:TextView
    private lateinit var txtU:TextView
    private lateinit var txtV:TextView
    private lateinit var txtW:TextView
    private lateinit var txtX:TextView
    private lateinit var txtY:TextView
    private lateinit var txtZ:TextView
    private lateinit var mediaPlayer: MediaPlayer


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val  view=inflater.inflate(R.layout.activity_level1, container, false)

        txtHeader=view.findViewById(R.id.txtHeader)
         txtA=view.findViewById(R.id.txtA)
         txtB=view.findViewById(R.id.txtB)
         txtC=view.findViewById(R.id.txtC)
         txtD=view.findViewById(R.id.txtD)
         txtE=view.findViewById(R.id.txtE)
         txtF=view.findViewById(R.id.txtF)
         txtG=view.findViewById(R.id.txtG)
         txtH=view.findViewById(R.id.txtH)
         txtI=view.findViewById(R.id.txtI)
         txtJ=view.findViewById(R.id.txtJ)
         txtK=view.findViewById(R.id.txtK)
         txtL=view.findViewById(R.id.txtL)
         txtM=view.findViewById(R.id.txtM)
         txtN=view.findViewById(R.id.txtN)
         txtO=view.findViewById(R.id.txtO)
         txtP=view.findViewById(R.id.txtP)
         txtQ=view.findViewById(R.id.txtQ)
         txtR=view.findViewById(R.id.txtR)
         txtS=view.findViewById(R.id.txtS)
         txtT=view.findViewById(R.id.txtT)
         txtU=view.findViewById(R.id.txtU)
         txtV=view.findViewById(R.id.txtV)
         txtW=view.findViewById(R.id.txtW)
         txtX=view.findViewById(R.id.txtX)
         txtY=view.findViewById(R.id.txtY)
         txtZ=view.findViewById(R.id.txtZ)

        txtHeader.text=getString(R.string.alphabates)

        txtA.text="A"
        txtB.text="B"
        txtC.text="C"
        txtD.text="D"
        txtE.text="E"
        txtF.text="F"
        txtG.text="G"
        txtH.text="H"
        txtI.text="I"
        txtJ.text="J"
        txtK.text="K"
        txtL.text="L"
        txtM.text="M"
        txtN.text="N"
        txtO.text="O"
        txtP.text="P"
        txtQ.text="Q"
        txtR.text="R"
        txtS.text="S"
        txtT.text="T"
        txtU.text="U"
        txtV.text="V"
        txtW.text="W"
        txtX.text="X"
        txtY.text="Y"
        txtZ.text="Z"
        alphabetListener()

        return view
    }

    private fun changeABCD(view: View){

        val soundList= arrayOf(R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i
            ,R.raw.j,R.raw.k,R.raw.l,R.raw.m,R.raw.n,R.raw.o,R.raw.p,R.raw.q,R.raw.r,R.raw.s,R.raw.t,R.raw.u
            ,R.raw.v,R.raw.w,R.raw.x,R.raw.y,R.raw.z)
        val idList1= arrayOf(R.id.txtA,R.id.txtB,R.id.txtC,R.id.txtD,R.id.txtE,R.id.txtF,R.id.txtG,R.id.txtH,R.id.txtI,R.id.txtJ,
            R.id.txtK,R.id.txtL,R.id.txtM,R.id.txtN,R.id.txtO,R.id.txtP,R.id.txtQ,R.id.txtR,R.id.txtS,R.id.txtT,
            R.id.txtU,R.id.txtV,R.id.txtW,R.id.txtX,R.id.txtY,R.id.txtZ)
        for (i in 0..25){
            when(view.id) {
                idList1[i]->{mediaPlayer= MediaPlayer.create(activity as Context,soundList[i]).apply {
                    setOnPreparedListener { start() }
                    setOnCompletionListener { reset() }
                }
                }

            }
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
