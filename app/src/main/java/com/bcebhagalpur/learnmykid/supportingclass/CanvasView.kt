package com.bcebhagalpur.learnmykid.supportingclass

import android.content.Context
import android.graphics.*
import android.graphics.Color.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import kotlin.math.abs

class CanvasView(context: Context,attrs:AttributeSet):View(context,attrs) {

    private val colorList= arrayOf(RED,BLUE, GREEN, BLACK, YELLOW, GRAY, CYAN)
    private val randInt=(0..6).random()
    private lateinit var mbitmap:Bitmap
    private var mCanvas:Canvas?=null
    private val mPath:Path= Path()
    private val mPaint:Paint= Paint()
    private var mX:Float=0.toFloat()
    private var mY:Float=0.toFloat()
    init {
        mPaint.isAntiAlias=true
        mPaint.color=colorList[randInt]
        mPaint.style=Paint.Style.STROKE
        mPaint.strokeJoin=Paint.Join.ROUND
        mPaint.strokeWidth=4f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas!!.drawPath(mPath,mPaint)
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        mbitmap= Bitmap.createBitmap(w,h,Bitmap.Config.ARGB_8888)
        mCanvas= Canvas(mbitmap)
    }
    private fun onStartTouchEvent(x: Float, y: Float)
    {
        mPath.moveTo(x,y)
        mX= x
        mY= y
    }
    private fun onMoveTouchEvent(x:Float,y:Float)
    {
        val dx= abs(x-mX)
        val dy= abs(y-mY)

        if (dx>= TOLERANCE ||dy>= TOLERANCE)
        {
            mPath.quadTo(mX,mY,(x+mX)/2,(y+mY)/2)
            mX=x
            mY=y
        }
    }
    private fun upTouchEvent(){
        mPath.lineTo(mX,mY)
    }
    fun clearCanvas()
    {
        mPath.reset()
        invalidate()
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x= event.x
        val y= event.y
        when(event.action){
            MotionEvent.ACTION_DOWN->
            {
                onStartTouchEvent(x,y)
                invalidate()
            }
            MotionEvent.ACTION_MOVE->
            {
                onMoveTouchEvent(x,y)
                    invalidate()
            }
            MotionEvent.ACTION_UP->
            {
                upTouchEvent()
                invalidate()
            }
        }
        return true
    }
    companion object{
        private const val TOLERANCE=5f
    }
}

