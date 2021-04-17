package com.beren.bottomnavigationassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_sum_result.view.*

class sumResultFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_sum_result, container, false)
        val bundle:sumResultFragmentArgs by navArgs()
        val result = bundle.sumresult
        tasarim.textViewSumResult.text=result
        return tasarim
    }


  }