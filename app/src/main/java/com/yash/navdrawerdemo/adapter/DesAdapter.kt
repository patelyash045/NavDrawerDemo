package com.yash.navdrawerdemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yash.navdrawerdemo.R
import com.yash.navdrawerdemo.data.Lyrics

class DesAdapter(val lyrics: List<Lyrics>) : RecyclerView.Adapter<DesAdapter.DesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DesViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_des,parent,false)
        return DesViewHolder(view)
    }

    override fun onBindViewHolder(holder: DesViewHolder, position: Int) {
        holder.txtTitle.text = lyrics[position].title
        holder.txtDescription.text = lyrics[position].description
        holder.txtLyrics.text = lyrics[position].lyrics
    }

    override fun getItemCount(): Int {
        return lyrics.size
    }


    class DesViewHolder(item_des: View) : RecyclerView.ViewHolder(item_des){

        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var txtDescription = itemView.findViewById<TextView>(R.id.txtDescription)
        var txtLyrics = item_des.findViewById<TextView>(R.id.txtLyrics)
        //var container = itemView.findViewById<LinearLayout>(R.id.container)
    }
}