package ru.cates.day_4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity_1 : AppCompatActivity() {
    private companion object {
        val CHOOSE_THIEF = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_1)
    }

    fun onClickActivity_1(view: View) {
        val intent = Intent(this, Activity_2::class.java)
        startActivityForResult(intent, CHOOSE_THIEF)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val info = findViewById<TextView>(R.id.textViewInfo)

        if (requestCode == CHOOSE_THIEF) {
            if (resultCode == Activity.RESULT_OK) {
                val thiefName = data?.getStringExtra(Activity_2.THIEF)
                info.text = thiefName
            } else {
                info.text = ""
            }
        }
    }
}