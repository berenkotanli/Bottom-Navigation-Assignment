package com.beren.bottomnavigationassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_multiply_result.view.*


class multiplyResultFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_multiply_result, container, false)
        val bundle:multiplyResultFragmentArgs by navArgs()
        val result2 = bundle.multiplyResult
        tasarim.textViewMultiiplyResult.text=result2
        return tasarim
    }



    }
