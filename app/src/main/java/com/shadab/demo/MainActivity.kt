package com.shadab.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
         val item = ArrayList<Cricketer>()
        item.add(Cricketer(R.drawable.shadab,"Shadab Murtaza"))
        item.add(Cricketer(R.drawable.shadab,"Shadab Murtaza"))
        item.add(Cricketer(R.drawable.shadab,"Shadab Murtaza"))
        item.add(Cricketer(R.drawable.shadab,"Shadab Murtaza"))
        item.add(Cricketer(R.drawable.shadab,"Shadab Murtaza"))
        item.add(Cricketer(R.drawable.shadab,"Shadab Murtaza"))
        item.add(Cricketer(R.drawable.shadab,"Shadab Murtaza"))
        item.add(Cricketer(R.drawable.shadab,"Shadab Murtaza"))
        val adapter = CricketAdapter(item, this)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.adapter = adapter
    }
}