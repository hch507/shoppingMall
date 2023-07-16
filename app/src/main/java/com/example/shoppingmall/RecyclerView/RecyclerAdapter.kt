package com.example.shoppingmall.RecyclerView

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingmall.databinding.ActivityItemViewBinding
import com.example.shoppingmall.productInfo

class RecyclerAdapter() : RecyclerView.Adapter<RecyclerViewholder>() {

    private var productList = ArrayList<productInfo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewholder {
        Log.d("hch", "Adapter-onCreateViewHolder() called")
        val itemhodler= RecyclerViewholder(ActivityItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        return itemhodler
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: RecyclerViewholder, position: Int) {
        holder.bind(this.productList[position])
    }
    fun summit(productList : ArrayList<productInfo>){
        this.productList = productList
    }
}