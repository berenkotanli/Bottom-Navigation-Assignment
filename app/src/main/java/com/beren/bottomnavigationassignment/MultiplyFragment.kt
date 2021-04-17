package com.beren.bottomnavigationassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_multiply.view.*

class MultiplyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tasarim = inflater.inflate(R.layout.fragment_multiply, container, false)
        tasarim.buttonMultiply.setOnClickListener {

            var firstNumber2 = tasarim.editTextFirstNumber2.text.toString()
            var secondNumber2 = tasarim.editTextSecondNumber2.text.toString()
            if(firstNumber2.isEmpty()){
                tasarim.textInputLayoutMultOne.error="Please enter a number"
            }
            if(secondNumber2.isEmpty()){
                tasarim.textInputLayoutMultTwo.error="Please enter a number"
            }
            else{
                var firstNumber2 = tasarim.editTextFirstNumber2.text.toString().toInt()
                var secondNumber2 = tasarim.editTextSecondNumber2.text.toString().toInt()
                var result2 = (firstNumber2*secondNumber2).toString()
                tasarim.editTextFirstNumber2.setText("")
                tasarim.editTextSecondNumber2.setText("")
                val transition = MultiplyFragmentDirections.multiplyResultFragmentGecis(result2)
                Navigation.findNavController(it).navigate(transition)
            }

        }

        return tasarim

    }


    }
