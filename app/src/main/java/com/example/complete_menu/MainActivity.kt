package com.example.complete_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.example.complete_menu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.pBarCircular.visibility = View.INVISIBLE
        binding.btnShow.setOnClickListener{

            binding.pBarCircular.visibility = View.VISIBLE
            var i = binding.pBar.progress
            Thread {
                while (i < 100) {
                    i += 1
                    // Update the progress bar and display the current value in text view
                    Handler(Looper.getMainLooper()).post({
                        // Your Code
                        binding.pBar.progress = i
                        binding.tView.text = i.toString() + "/" + binding.pBar.max
                        if (i == 100) {
                            binding.pBarCircular.visibility = View.INVISIBLE
                        }
                    })


                    try {
                        // Sleep for 100 milliseconds to show the progress slowly.
                        Thread.sleep(100)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
            }.start()

        }
        binding.btnReset.setOnClickListener {

            binding.pBar.progress = 0
            binding.tView.text = 0.toString() + "/" + binding.pBar.max

        }
        setContentView(binding.root)
    }
}