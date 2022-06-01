package com.cinarci.kotlin101homework_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun makeInput(view : View) {
        val name = inputName.text.toString()
        val age = inputAge.text.toString()
        val job = inputJob.text.toString()

        var makeInput = "Your name is $name, you are $age years old and your job is $job. \n \n Alternative Use \n \n Your name : $name \n Your age : $age \n Your job : $job "
        textView.text = makeInput

    }
}