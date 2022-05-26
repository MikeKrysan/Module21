package com.appbymikekrysan.module21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment

class FirstFragment: Fragment() {

    override fun onCreateView(
        inflatter: LayoutInflater, container: ViewGroup?,
        savedInstanceState:Bundle?
    ): View? {
        //Inflate the layout for this fragment
        return inflatter.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
}