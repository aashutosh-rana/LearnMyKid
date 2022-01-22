package com.bcebhagalpur.learnmykid.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.bcebhagalpur.learnmykid.R


class DeveloperFragment : Fragment() {

private lateinit var imgDeveloper:ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {val view= inflater.inflate(R.layout.fragment_developer, container, false)

        imgDeveloper=view.findViewById(R.id.imgDeveloper)
        val animation1= AnimationUtils.loadAnimation(activity as Context,R.anim.zoom_in)
        imgDeveloper.startAnimation(animation1)
        return view
    }

}
//    private lateinit var recipient: EditText
//    private lateinit var subject: EditText
//    private lateinit var message: EditText
//    private lateinit var send: Button


//       recipient=view.findViewById(R.id.recipientEt)
//        subject=view.findViewById(R.id.subjectEt)
//        message=view.findViewById(R.id.messageEt)
//        send=view.findViewById(R.id.btnSend)
//
//        val recipient1=recipient.text.toString().trim()
//        val subject1=subject.text.toString().trim()
//        val message1=message.text.toString().trim()
//        send.setOnClickListener { senEmail(recipient1,subject1,message1) }
//

//
//    private fun senEmail(recipient1: String, subject1: String, message1: String) {
//
//        val mIntent=Intent(Intent.ACTION_SEND)
//        mIntent.data= Uri.parse("mailto")
//        mIntent.type="text/plain"
//        mIntent.putExtra(Intent.EXTRA_EMAIL, recipient1)
//        mIntent.putExtra(Intent.EXTRA_SUBJECT,subject1)
//        mIntent.putExtra(Intent.EXTRA_TEXT,message1)
//        try {
//            startActivity(Intent.createChooser(mIntent,"choose email client"))
//
//        }catch (e:Exception){
//            Toast.makeText(activity as Context,e.message,Toast.LENGTH_SHORT).show()
//        }

