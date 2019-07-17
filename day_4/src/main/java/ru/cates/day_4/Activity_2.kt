package ru.cates.day_4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Activity_2 : AppCompatActivity() {

    companion object {
        val THIEF = "THIEF"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_2)
    }

    fun onRadioClick(view: View) {
        var answerIntent = Intent()

        when (view.id) {
            R.id.radioDog -> answerIntent.putExtra(THIEF, "Пёсик")
            R.id.radioCrow -> answerIntent.putExtra(THIEF, "Ворона")
            R.id.radioCat -> answerIntent.putExtra(THIEF, "Лошадь Пржевальского");
        }

        setResult(Activity.RESULT_OK, answerIntent)
        finish()
    }
}