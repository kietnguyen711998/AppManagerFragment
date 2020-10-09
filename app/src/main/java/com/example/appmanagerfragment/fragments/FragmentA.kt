package com.example.appmanagerfragment.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appmanagerfragment.R
import com.example.appmanagerfragment.fragments.childFragmentA.DetailFragment
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_detail.textView


class FragmentA : Fragment() {
    private val TAG = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onResume() {
        super.onResume()
        fragmentManager?.fragments?.forEach {
            Log.e(TAG, "Fragment exists is ${it.javaClass.simpleName}")
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        buttonA.setOnClickListener {
            val fragmentDetail = DetailFragment()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            val tag = DetailFragment::class.java.name
            fragmentTransaction?.add(R.id.contentFragment, fragmentDetail, tag)
            fragmentTransaction?.addToBackStack("2")
            fragmentTransaction?.commit()
        }
        textView.setOnClickListener {
            Log.e(TAG, "Fragment exists is ${fragmentManager?.fragments?.size}")
            fragmentManager?.fragments?.forEach {
                Log.e(TAG, "Fragment exists is ${it.javaClass.simpleName}")
            }
        }
    }

}
