package com.pankaj.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(
    private var context: Context,
    private var names: Array<String>,
    private var img: IntArray
    ) : BaseAdapter() {

    private var layoutInflater : LayoutInflater? = null
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun getCount(): Int {
        return names.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {
        var convertView = convertview
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.custom_list_item, null)
        }
        imageView = convertView!!.findViewById(R.id.cimage)
        textView = convertView.findViewById(R.id.txt_name)
        imageView.setImageResource(img[position])
        textView.text = names[position]
        return convertView
    }
}