package ru.samsung.itschool.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class BlankFragment6 : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_blank6, container, false)
        var btn: Button = view.findViewById(R.id.ButtonBack)
        btn.setOnClickListener { view -> view.findNavController().popBackStack() }
        findNavController().previousBackStackEntry?.savedStateHandle?.set("result_from_activity", "ответные данные")
        // Inflate the layout for this fragment
        return view
    }
}