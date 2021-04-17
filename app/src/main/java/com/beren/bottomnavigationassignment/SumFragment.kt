package com.beren.bottomnavigationassignment

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_multiply.view.*
import kotlinx.android.synthetic.main.fragment_sum.view.*


class SumFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tasarim = inflater.inflate(R.layout.fragment_sum, container, false)
        tasarim.buttonSum.setOnClickListener {

            var firstNumber = tasarim.editTextFirstNumber.text.toString()
            var secondNumber = tasarim.editTextSecondNumber.text.toString()
            if(firstNumber.isEmpty()){
                tasarim.textInputLayoutOne.error="Please enter a number"
            }
            if(secondNumber.isEmpty()){
                tasarim.textInputLayoutTwo.error="Please enter a number"
            }
            else{
                var firstNumber = tasarim.editTextFirstNumber.text.toString().toInt()
                var secondNumber = tasarim.editTextSecondNumber.text.toString().toInt()
                var result = (firstNumber+secondNumber).toString()
                tasarim.editTextFirstNumber.setText("")
                tasarim.editTextSecondNumber.setText("")
                val transition = SumFragmentDirections.sumSonucGecis(result)
                Navigation.findNavController(it).navigate(transition)
            }

        }

        return tasarim

    }

    }
