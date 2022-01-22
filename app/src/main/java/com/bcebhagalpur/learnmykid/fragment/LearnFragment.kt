package com.bcebhagalpur.learnmykid.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

import com.bcebhagalpur.learnmykid.R
import com.google.android.material.tabs.TabLayout

@Suppress("DEPRECATION")
class LearnFragment : Fragment() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view= inflater.inflate(R.layout.fragment_learn, container, false)
        viewPager=view.findViewById(R.id.viewPager)
        tabs=view.findViewById(R.id.tabs)
        val adapter=MyViewPagerAdapter(childFragmentManager)
        adapter.addFragment(AlphabateFragment(),"ALPHABET'S")
        adapter.addFragment(WeekFragment(),"WEEK")
        adapter.addFragment(MonthFragment(),"MONTH")
        adapter.addFragment(AnimalFragment(),"ANIMALS")
        adapter.addFragment(PoetryFragment(),"POETRY")
        adapter.addFragment(ShapeFragment(),"SHAPES")
        viewPager.adapter=adapter
        tabs.setupWithViewPager(viewPager)

        return view
    }

    class MyViewPagerAdapter(manager: FragmentManager): FragmentPagerAdapter(manager){

        private val fragmentList:MutableList<Fragment> = ArrayList()
        private val titleList:MutableList<String> = ArrayList()
        override fun getItem(position: Int): Fragment {

            return fragmentList[position]
        }

        override fun getCount(): Int {

            return fragmentList.size
        }
        fun addFragment(fragment: Fragment,title:String){
            fragmentList.add(fragment)
            titleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }

    }

}
