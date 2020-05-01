package com.example.dialog

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder (itemView :View): RecyclerView.ViewHolder(itemView ){

    val tvTitle :TextView =itemView.tvTitle
    val tvDescription :TextView=itemView.tvDescription

    fun populateModel(user:User,activity: MainActivity,size:Int,position:Int){

        tvTitle.text=user.title
        tvDescription.text=user.description

itemView.setOnClickListener {

    activity.onItemClicked(size,position)

}

    }


}