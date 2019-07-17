package ru.cates.day_4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)

        val to = intent?.getStringExtra("to") ?: "ЖЫвотное"
        val gift = intent?.getStringExtra("gift") ?: "дырку от бублика"
        val username = intent?.getStringExtra("username")?: "Аноним"

        val infoTextView = findViewById<TextView>(R.id.textView_about_content)
        infoTextView.text = "$to ,вам передали $gift ота $username"
    }
}