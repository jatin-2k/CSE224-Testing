package com.example.complete_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.complete_menu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //getting nav controller straight from nav fragment
        navController = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).findNavController()

        //connecting nav graph with drawer
        AppBarConfiguration(navController.graph, binding.drawerLayout)

        //linking menu items to controller
        NavigationUI.setupWithNavController(binding.navView, navController)
        
        //shows menu in app
        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawerLayout)


    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, binding.drawerLayout)
    }
}