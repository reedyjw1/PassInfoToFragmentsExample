package com.example.fragmentsexample.bundlePackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsexample.R

class ActivityBundleExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle_example)

        supportFragmentManager.beginTransaction().replace(R.id.bundle_container, FragmentFirstBundle()).commit()
    }
}