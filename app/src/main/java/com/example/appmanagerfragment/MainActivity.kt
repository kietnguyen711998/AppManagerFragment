package com.example.appmanagerfragment

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentPagerAdapter
import com.example.appmanagerfragment.fragments.FragmentA
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title = " "
        setSupportActionBar(toolbar)

        val adapter: FragmentPagerAdapter = FragmentAdapter(supportFragmentManager)

        viewpager.adapter = adapter
        tabLayout.setupWithViewPager(viewpager)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragmentA = FragmentA()

        fragmentTransaction.add(R.id.contentFragment, fragmentA, FragmentA::class.simpleName)
        fragmentTransaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu)
    }

}