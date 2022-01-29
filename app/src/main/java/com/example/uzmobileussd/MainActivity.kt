package com.example.uzmobileussd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val navigationMenu = findViewById<BottomNavigationView>(R.id.navigation_menu)
        val navController = findNavController(R.id.fragment)
        navigationMenu.setupWithNavController(navController)

        navigationMenu.selectedItemId = R.id.thirdFragment
    }
}