package com.example.fragmentsexample.bundlePackage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.fragmentsexample.R

class FragmentFirstBundle: Fragment() {

    private lateinit var editText: EditText
    private lateinit var editNumber: EditText
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.bundle_first, container, false)

        editText = view.findViewById(R.id.editTextName)
        editNumber = view.findViewById(R.id.editTextNumber)
        button = view.findViewById(R.id.sendCustom)

        button.setOnClickListener{
            val customObject = CustomObject(editText.text.toString(), editNumber.text.toString().toInt())

            val frag = FragmentSecondBundle.newInstance(customObject)
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.bundle_container, frag).commit()
        }

        return view
    }

}