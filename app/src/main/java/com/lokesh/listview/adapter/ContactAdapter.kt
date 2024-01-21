package com.lokesh.listview.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.lokesh.listview.R
import com.lokesh.listview.model.ContactModel

class ContactAdapter(private val context:Activity, private val arrayList: List<ContactModel>):
    ArrayAdapter<ContactModel>(context,R.layout.contact_item,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val inflater:LayoutInflater = LayoutInflater.from(context)
//        val view:View = inflater.inflate(R.layout.contact_item,null)

        val view:View = convertView?:LayoutInflater.from(context).inflate(R.layout.contact_item,parent,false)
        val image:ImageView = view.findViewById(R.id.personimg)
        val name:TextView = view.findViewById(R.id.personname)

        image.setImageResource(arrayList[position].Profile)
        name.text = arrayList[position].Name

        return view
    }
}