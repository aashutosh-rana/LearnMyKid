package com.bcebhagalpur.learnmykid.fragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.Toast
import com.bcebhagalpur.learnmykid.BuildConfig
import com.bcebhagalpur.learnmykid.R
import com.bcebhagalpur.learnmykid.R.*
import com.bcebhagalpur.learnmykid.activity.StartActivity

class HomeFragment : Fragment() {
    private lateinit var btnPlayNow:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(layout.fragment_home, container, false)
        btnPlayNow=view.findViewById(R.id.btnPlayNow)

        btnPlayNow.setOnClickListener {
            val intent= Intent(context, StartActivity::class.java)
            startActivity(intent)

        }
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
    inflater.inflate(R.menu.option_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.developer->{
                fragmentManager!!.beginTransaction().replace(R.id.frameLayout, DeveloperFragment())
                    .commit()
            }
            R.id.share->{
                share()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun share() {
        try {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Learn My Kid")
            var shareMessage = "\nLet me recommend you this application\n\n"
            shareMessage =
                """
                    ${shareMessage}https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}

                    """.trimIndent()
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
            startActivity(Intent.createChooser(shareIntent, "choose one"))
        } catch (e: Exception) {
            Toast.makeText(context, "some error occurred", Toast.LENGTH_SHORT).show()
        }
    }

}
