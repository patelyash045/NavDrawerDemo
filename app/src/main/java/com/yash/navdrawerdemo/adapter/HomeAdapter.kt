package com.yash.navdrawerdemo.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.yash.navdrawerdemo.R
import com.yash.navdrawerdemo.data.Song

class HomeAdapter(val songs: List<Song>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = inflater.inflate(R.layout.item_view,parent,false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {



        holder.txtTitle.text = songs[position].title
        holder.txtDescription.text = songs[position].description
        var color = "#CCCCCC"
        if (position % 2 == 0){
            color = "#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var txtDescription = itemView.findViewById<TextView>(R.id.txtDescription)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
    }
}