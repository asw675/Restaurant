package com.bignerdranch.android.restaurant.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bignerdranch.android.restaurant.Model.Comment
import com.bignerdranch.android.restaurant.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_comment.view.*

class CommentAdapter(val Comments:List<Comment>) : RecyclerView.Adapter<CommentAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.item_comment,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int =Comments.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(Comments[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(Comments: Comment)
        {
            itemView.userid.text=Comments.username
            itemView.comment.text=Comments.comment
            itemView.time.text=Comments.time
            Glide.with(itemView.context).load(R.mipmap.code002).asBitmap().into(itemView.imageView)
        }
    }
}