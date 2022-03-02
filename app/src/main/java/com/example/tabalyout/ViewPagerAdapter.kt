package com.example.tabalyout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabalyout.fragments.BirdFragment
import com.example.tabalyout.fragments.CatFragment
import com.example.tabalyout.fragments.DogFragment
import com.example.tabalyout.fragments.MushukFragment


class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return MushukFragment.newInstance(position + 1)
    }
}