package com.oreilly.courses.masteringkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import somepackage.SomeClass

class MainActivity : AppCompatActivity() {

    var someClass: SomeClass? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
