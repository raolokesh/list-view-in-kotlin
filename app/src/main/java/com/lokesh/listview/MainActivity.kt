package com.lokesh.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.lokesh.listview.adapter.ContactAdapter
import com.lokesh.listview.model.ContactModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contactList = listOf(
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image2,"Deepak"),
            ContactModel(R.drawable.image3,"King"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image3,"Karan"),
            ContactModel(R.drawable.image2,"David"),
            ContactModel(R.drawable.image1,"Hemraj"),
        )

        Log.d("data print",contactList[5].Name)
        val listview:ListView = findViewById(R.id.list_view)

        listview.adapter = ContactAdapter(this, contactList)


    }
}
















//
//val contactName = contactList.map { it.Name }
//val listView:ListView  = findViewById(R.id.list_view)
//val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,contactName)
//listView.adapter = adapter
//data class contactModel(val Image: Int, val Name: String)