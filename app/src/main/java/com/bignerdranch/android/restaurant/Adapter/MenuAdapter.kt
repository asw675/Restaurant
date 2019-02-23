package com.bignerdranch.android.restaurant.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.restaurant.Model.Menu
import com.bignerdranch.android.restaurant.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_menu.view.*


class MenuAdapter(val items : List<Menu.ResultsBean>) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.item_menu,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int =items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position],position)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(menu: Menu.ResultsBean,position: Int){
            var str="¥"+menu.dishes_price
            itemView.cost.text=str
            itemView.name.text=menu.dishes_name
            Glide.with(itemView.context).load(menu.dishes_img).asBitmap().into(itemView.dishes_img)
        }
    }
}