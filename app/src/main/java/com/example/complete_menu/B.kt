package com.example.complete_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class B : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q22)

        val i = this.intent
        val s = i.getSerializableExtra("student") as student
        val m = i.getSerializableExtra("mobile") as mobile

        findViewById<TextView>(R.id.student_text_id).text = s.name + " " + s.surname
        findViewById<TextView>(R.id.mobile_number_text_id).text = m.num
    }
}