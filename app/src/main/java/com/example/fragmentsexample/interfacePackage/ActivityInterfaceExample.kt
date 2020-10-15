package com.example.fragmentsexample.interfacePackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.replace
import com.example.fragmentsexample.R
import kotlinx.android.synthetic.main.activity_interface_example.*

class ActivityInterfaceExample : AppCompatActivity(), OnInterfaceExample {

    private lateinit var textView: TextView
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interface_example)

        val fragment = FragmentInterfaceExample()
        fragment.setOnInterfaceExampleListener(this)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment, "interface_tag").commit()

        textView = findViewById(R.id.textView2)
    }

    override fun increaseValue() {
        counter++
        textView.text = counter.toString()
    }
}