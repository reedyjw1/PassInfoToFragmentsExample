package com.example.fragmentsexample.interfacePackage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentsexample.R

class FragmentInterfaceExample: Fragment(){
    private lateinit var button: Button
    private lateinit var mListener: OnInterfaceExample

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Attaches the layout to this fragment
        val view = inflater.inflate(R.layout.fragment_example, container, false)

        // Gets the text view element from the view
        button = view.findViewById(R.id.button)

        button.setOnClickListener {
            mListener.increaseValue()
        }

        return view
    }

    fun setOnInterfaceExampleListener(listener: OnInterfaceExample){
        mListener = listener
    }

}