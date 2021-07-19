package com.project.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.assignment.adapter.ImageListAdapter
import com.project.assignment.data.DataSource

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Initializing data
        val myImageSet = DataSource().loadImages()


        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)



        recyclerView.adapter = ImageListAdapter(this, myImageSet)
        recyclerView.setHasFixedSize(true)


    }


}