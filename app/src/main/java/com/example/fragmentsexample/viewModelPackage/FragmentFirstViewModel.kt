package com.example.fragmentsexample.viewModelPackage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fragmentsexample.R

class FragmentFirstViewModel: Fragment() {

    private lateinit var button: Button
    private lateinit var textEdit: EditText
    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Attaches the layout to the view
        val view = inflater.inflate(R.layout.viewmodel_first, container, false)

        // Gets the two elements from the view
        button = view.findViewById(R.id.sendButton)
        textEdit = view.findViewById(R.id.editText)

        button.setOnClickListener {
            // Assign the viewModel variable "response" to the value entered in the editText
            viewModel.response.postValue(textEdit.text.toString())

            // Switches the presented fragment from "FirstFragment" to "SecondFragment"
            activity?.supportFragmentManager?.beginTransaction()?.replace(
                R.id.container,
                FragmentSecondViewModel(), null)?.commit()
        }

        return view
    }
}