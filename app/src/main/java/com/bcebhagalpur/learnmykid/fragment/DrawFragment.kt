package com.bcebhagalpur.learnmykid.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.bcebhagalpur.learnmykid.R
import com.bcebhagalpur.learnmykid.supportingclass.CanvasView

class DrawFragment : Fragment() {

private lateinit var canvasView: CanvasView
    private lateinit var btnCanvas:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view= inflater.inflate(R.layout.fragment_draw, container, false)

        btnCanvas=view.findViewById(R.id.btnCanvas)
        canvasView=view.findViewById(R.id.canvas)
        btnCanvas.setOnClickListener { clearCanvas() }

        return view
    }

    private fun clearCanvas(){
        canvasView.clearCanvas()
    }

}
