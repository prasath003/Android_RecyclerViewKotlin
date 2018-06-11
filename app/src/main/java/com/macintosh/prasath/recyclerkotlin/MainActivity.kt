package com.macintosh.prasath.recyclerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ShowFragment()

    }

    fun ShowFragment(){
        val transcation = manager.beginTransaction()
        val fragment = FragmentOne()
        transcation.replace(R.id.fragmentHolder,fragment);
        transcation.addToBackStack(null)
        transcation.commit();
    }
}
