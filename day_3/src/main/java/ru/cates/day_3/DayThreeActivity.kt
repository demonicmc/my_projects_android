package ru.cates.day_3

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import ru.cates.day_3.R.string.*

class DayThreeActivity : AppCompatActivity() {

    private var mConstraintLayout: ConstraintLayout? = null
    private var mInfoTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_three)

        mConstraintLayout = findViewById(R.id.commoLayout)
        mInfoTextView = findViewById(R.id.textViewInfo)
    }


    fun onColorButton(textId: Int, colorId: Int) {
        mInfoTextView?.setText(textId)
        mConstraintLayout?.setBackgroundColor(ContextCompat.getColor(this, colorId))
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.buttonRed -> onColorButton(red, R.color.colorRed)
            R.id.buttonYellow -> onColorButton(yellow, R.color.colorYellow)
            R.id.buttonGreen -> onColorButton(green, R.color.colorGreen)
        }
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(applicationContext, "ПОра кормить кота", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}
