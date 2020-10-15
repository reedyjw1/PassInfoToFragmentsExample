package com.example.fragmentsexample.viewModelPackage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.fragmentsexample.R

class FragmentSecondViewModel: Fragment() {
    private lateinit var textView: TextView
    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Attaches the layout to this fragment
        val view = inflater.inflate(R.layout.viewmodel_second, container, false)

        // Gets the text view element from the view
        textView = view.findViewById(R.id.textViewViewModel)

        // Gets the value stored in the viewModel
        viewModel.response.observe(viewLifecycleOwner, Observer<String> {
            textView.text = it
        })

        return view
    }
}