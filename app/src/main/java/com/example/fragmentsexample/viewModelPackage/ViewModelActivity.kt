package com.example.fragmentsexample.viewModelPackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsexample.R

class ViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        // Starts the fragment
        supportFragmentManager.beginTransaction().replace(R.id.container,
            FragmentFirstViewModel(), null).commit()
    }
}