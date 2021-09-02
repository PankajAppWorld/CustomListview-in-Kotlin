package com.pankaj.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var clistview:ListView? = null
    private var listnames = arrayOf("Android","Java","Kotlion","Dart","Php")
    private var listimg = intArrayOf(R.drawable.ic_android,
        R.drawable.ic_java,
        R.drawable.ic_kotlin,
        R.drawable.ic_flutter,
        R.drawable.ic_launcher_background)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clistview = findViewById(R.id.custom_listview)
        var customAdapter = CustomAdapter(this,listnames,listimg)
        clistview!!.adapter = customAdapter
        clistview!!.onItemClickListener = AdapterView.OnItemClickListener {
                adapterView, view, position, l ->

            Toast.makeText(applicationContext,"clicked : "+listnames[+position],Toast.LENGTH_SHORT).show()
        }
    }
}