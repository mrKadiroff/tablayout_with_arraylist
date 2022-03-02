package com.example.tabalyout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tabalyout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

val animalsArray = arrayOf(
    "Cat",
    "Dog",
    "Bird"
)

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = animalsArray[position]
        }.attach()
    }
}