package ru.cates.day_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var mCountCat = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View):Unit {
        val helloText = findViewById<TextView>(R.id.text2)
        helloText.text = "Hello Kitty"
    }

    fun countCat(view: View) {
        val countCat = findViewById<TextView>(R.id.text2)
        mCountCat++
        countCat.text = "Кол-во котов  $mCountCat"
    }

}
