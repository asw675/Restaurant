package com.bignerdranch.android.restaurant.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.bignerdranch.android.restaurant.Model.show
import com.bignerdranch.android.restaurant.R
import kotlinx.android.synthetic.main.item_show.view.*

class ShowAdapter(val items : List<show>) : RecyclerView.Adapter<ShowAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.item_show,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int =items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
        if (items[position].dishes_amount==0)
        {
            holder.setVisibility(false)
        }
        else
        {
            holder.setVisibility(true)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(menu: show){
            var str="¥"+menu.dishes_price
            itemView.dish_price.text=str
            itemView.dish_name.text=menu.dishes_name
            itemView.amount.text=menu.dishes_amount.toString()
            itemView.jia.setOnClickListener { menu.dishes_amount.inc() }
            itemView.jian.setOnClickListener { menu.dishes_amount.dec() }
        }
        fun setVisibility(isVisible:Boolean){
            var param  = itemView.getLayoutParams()
            if (isVisible){
                param.height = LinearLayout.LayoutParams.WRAP_CONTENT
                param.width = LinearLayout.LayoutParams.MATCH_PARENT
                itemView.setVisibility(View.VISIBLE)
            }else{
                itemView.setVisibility(View.GONE)
                param.height = 0
                param.width = 0
            }
            itemView.setLayoutParams(param)
        }
    }
}