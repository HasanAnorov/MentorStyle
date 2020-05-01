package com.example.dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    val adapter:ListAdapter= ListAdapter(this)
    var models :MutableList<User> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter=adapter

        recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        Data(0,1)
    }

    fun Data(size:Int,position: Int ){

        for(i in size until position) {
            var model = User()
            model.title = "${1}"
            model.description = "This is description"

            models.add(model)
        }
        adapter.setData(models)
    }

    fun onItemClicked(size :Int ,position:Int ){

        Data(size,position+1)
    }

}
