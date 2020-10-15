package com.example.fragmentsexample.bundlePackage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentsexample.R

class FragmentSecondBundle: Fragment() {

    private lateinit var textView: TextView
    private var customRecievedObject: CustomObject? = null

    companion object {
        fun newInstance(customObject: CustomObject) = FragmentSecondBundle().apply {
            arguments = Bundle().apply {
                this.putParcelable("CustomObject", customObject)
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        customRecievedObject = arguments!!.getParcelable("CustomObject")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.bundle_second, container, false)

        textView = view.findViewById(R.id.textViewBundle)
        if (customRecievedObject != null) {
            textView.text = "Name: ${customRecievedObject!!.name} Number: ${customRecievedObject!!.number}"
        }

        return view
    }
}