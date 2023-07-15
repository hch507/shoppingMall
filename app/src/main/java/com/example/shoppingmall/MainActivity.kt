package com.example.shoppingmall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.shoppingmall.ViewModel.MainViewModel
import com.example.shoppingmall.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mbinding : ActivityMainBinding
    lateinit var mainViewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mbinding.root)
        mbinding.topAppBar.setNavigationOnClickListener {
            mbinding.drawerLayout.open()
        }
        mbinding.navigationView.setNavigationItemSelectedListener { menuItem ->
            // Handle menu item selected
            menuItem.isChecked = true
            mbinding.drawerLayout.close()
            true
        }
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }
}