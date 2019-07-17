package ru.cates.day_4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class DayFourActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_four)
    }

    fun onClick(view: View) {

        val to = findViewById<EditText>(R.id.to)
        val gift = findViewById<EditText>(R.id.description)
        val username = findViewById<EditText>(R.id.user_name)

        val intent = Intent(this, AboutActivity::class.java)
        intent.putExtra("to", to.text.toString())
        intent.putExtra("gift", gift.text.toString())
        intent.putExtra("username", username.text.toString())

        startActivity(intent)
    }
}
