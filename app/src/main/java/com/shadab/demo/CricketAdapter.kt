package com.shadab.demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CricketAdapter (val list_of_players : ArrayList<Cricketer> , val context : Context) : RecyclerView.Adapter<CricketAdapter.ViewHolder>() {
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val player_image : ImageView
        val player_name : TextView
        init {
            player_image = view.findViewById(R.id.player_image)
            player_name =  view.findViewById(R.id.player_name)
        }
    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.layout_items,parent,false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.player_name.text = list_of_players[position].player_name
        holder.player_image.setImageResource(list_of_players[position].player_image)
        holder.itemView.setOnClickListener{
            Toast.makeText(context, "Welcome To SHADAB'S WORLD...", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return list_of_players.size
    }

}