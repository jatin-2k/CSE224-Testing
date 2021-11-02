package com.example.complete_menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class A : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q21)

        findViewById<Button>(R.id.send_button_id).setOnClickListener {
            val name = findViewById<TextView>(R.id.name_id).text.toString()
            val surname = findViewById<TextView>(R.id.surname_id).text.toString()
            val mob = findViewById<TextView>(R.id.mobile_id).text.toString()
            var s = student(name, surname)
            var m = mobile(mob)

            val i = Intent(this,B::class.java)
            i.putExtra("student", s)
            i.putExtra("mobile", m)
            startActivity(i)
        }
    }
}