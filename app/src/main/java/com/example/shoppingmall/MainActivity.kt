package com.example.shoppingmall

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppingmall.RecyclerView.RecyclerAdapter
import com.example.shoppingmall.ViewModel.MainViewModel
import com.example.shoppingmall.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mbinding : ActivityMainBinding
    lateinit var mainViewModel : MainViewModel
    lateinit var adapter : RecyclerAdapter
    var productList = ArrayList<productInfo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mbinding.root)
        for (i in 1..10){
            val product = productInfo(title="제품 $i")
            productList.add(product)
        }
        Log.d("hch", "MainActivity - onCreate() - called")
        adapter = RecyclerAdapter()
        adapter.summit(productList)



        mbinding.recyclerView.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)

        mbinding.recyclerView.adapter=adapter







//
//        mbinding.topAppBar.setNavigationOnClickListener {
//            mbinding.drawerLayout.open()
//        }
//        mbinding.navigationView.setNavigationItemSelectedListener { menuItem ->
//            // Handle menu item selected
//            menuItem.isChecked = true
//            mbinding.drawerLayout.close()
//            true
//        }
//        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }
}