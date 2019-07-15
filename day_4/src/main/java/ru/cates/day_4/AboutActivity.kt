package ru.cates.day_4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)

        val user = intent?.extras?.getString("username") ?: "ЖЫвотное"
        val gift = intent?.extras?.getString("gift") ?: "дырку от бублика"

        val infoTextView = findViewById<TextView>(R.id.textView_about_content)
        infoTextView.text = "$user ,вам передали $gift"
    }
}