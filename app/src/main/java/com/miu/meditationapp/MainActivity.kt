package com.miu.meditationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miu.meditationapp.ui.main.AboutFragment
import com.miu.meditationapp.ui.main.HomeFragment
import com.miu.meditationapp.ui.main.LearnFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(LearnFragment(), "Learn")
        adapter.addFragment(AboutFragment(), "About")

        viewPager.adapter = adapter

        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.learn)
        tabs.getTabAt(1)!!.setIcon(R.drawable.home)
        tabs.getTabAt(2)!!.setIcon(R.drawable.about)
    }
}