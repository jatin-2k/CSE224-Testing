package com.example.complete_menu

import android.app.Application
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.complete_menu.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDate
import java.time.LocalDate.of
import java.time.Month
import java.util.*
import android.app.Activity
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity() {

    private val actual_bday = 13
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tryButtonId.setOnClickListener {
            bday( binding.guessId.text.toString().toInt() );

        }
    }

    fun bday(guess: Int){
        if(guess < actual_bday){
            Toast.makeText(this, "UP", Toast.LENGTH_SHORT).show()
        }
        else if(guess > actual_bday){
            Toast.makeText(this, "Down", Toast.LENGTH_SHORT).show()
        }
        else if(guess == actual_bday){
            Toast.makeText(this, "YOU GOT IT", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "Something's Wrong", Toast.LENGTH_SHORT).show()
        }
        val imm = this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.root.windowToken,0)
    }
}