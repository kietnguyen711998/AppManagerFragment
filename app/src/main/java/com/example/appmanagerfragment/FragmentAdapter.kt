package com.example.appmanagerfragment


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.appmanagerfragment.fragments.FragmentA
import com.example.appmanagerfragment.fragments.FragmentB
import com.example.appmanagerfragment.fragments.FragmentC
import com.example.appmanagerfragment.fragments.FragmentD
import org.jetbrains.annotations.Nullable


class FragmentAdapter(fm: FragmentManager?) :
    FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentA()
            }
            1 -> FragmentB()
            2-> FragmentC()
            else -> {
                return FragmentD()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    @Nullable
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            2 -> "Third Tab"
            else -> {
                return "Four Tab"
            }
        }
    }
}