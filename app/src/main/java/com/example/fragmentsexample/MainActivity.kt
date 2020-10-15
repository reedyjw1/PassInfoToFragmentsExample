package com.example.fragmentsexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.fragmentsexample.bundlePackage.ActivityBundleExample
import com.example.fragmentsexample.interfacePackage.ActivityInterfaceExample
import com.example.fragmentsexample.viewModelPackage.ViewModelActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundleButton = findViewById<Button>(R.id.buttonBundle)
        val interfaceButton = findViewById<Button>(R.id.buttonInterface)
        val viewModelButton = findViewById<Button>(R.id.buttonViewModel)

        bundleButton.setOnClickListener(this)
        interfaceButton.setOnClickListener(this)
        viewModelButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        v?.let {
            val intent = when (v.id){
                R.id.buttonBundle -> {
                    Intent(this, ActivityBundleExample::class.java)
                }

                R.id.buttonInterface -> {
                    Intent(this, ActivityInterfaceExample::class.java)
                }

                R.id.buttonViewModel -> {
                    Intent(this, ViewModelActivity::class.java)
                }
                else -> {
                    null
                }
            }

            if(intent != null) {
                startActivity(intent)
            }
        }
    }
}