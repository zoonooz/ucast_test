package com.ucast.ucast_test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucast.ISimpleUcast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val testService = applicationContext.getSystemService("ucast") as ISimpleUcast
            val response = testService.helloGrab(1000, 234)
            textview.text = response.name + " : " + response.result
        } catch (e: Exception) {
            textview.text = e.message
        }
    }
}