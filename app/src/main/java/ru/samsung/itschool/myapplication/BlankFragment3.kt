package ru.samsung.itschool.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class BlankFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View=inflater.inflate(R.layout.fragment3, container, false)
        var btn4:Button=view.findViewById(R.id.button4)
        btn4.setOnClickListener(View.OnClickListener { view -> view.findNavController().navigate(R.id.action_blankFragment3_to_blankFragment6)})
        var btn4_back:Button=view.findViewById(R.id.button4_back)
        btn4_back.setOnClickListener(View.OnClickListener { view -> view.findNavController().popBackStack()})
        // отправка данных обратно вызывающему
        findNavController().previousBackStackEntry?.savedStateHandle?.set("result_from_activity", "ответные данные")
        return view
    }
}
