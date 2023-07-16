package com.example.shoppingmall.RecyclerView

import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingmall.databinding.ActivityItemViewBinding
import com.example.shoppingmall.databinding.ActivityMainBinding
import com.example.shoppingmall.productInfo

class RecyclerViewholder (val mbinding : ActivityItemViewBinding) : RecyclerView.ViewHolder(mbinding.root){

    fun bind(product :productInfo){
        mbinding.title.text = product.title
    }
}