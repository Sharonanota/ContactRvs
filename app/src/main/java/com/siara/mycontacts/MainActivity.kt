package com.siara.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.Contact
import com.ContactRvAdapter
import com.siara.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = Contact("Siara","matakwamatakwa@gmail.com","07229xxxx","Riruta", "https://images.pexels.com/photos/326268/pexels-photo-326268.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
        var contact7 = Contact("Anota","mtakwa@gmail.com","00987654567","Waithaka","https://images.pexels.com/photos/8443635/pexels-photo-8443635.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
        var contact2 = Contact("Anota","matakwa@gmail.com","07226xxx","Riruta"," https://images.pexels.com/photos/2403391/pexels-photo-2403391.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
        var contact3 = Contact("Anota","matakwa@gmail.com","07226xxx","Riruta","https://images.pexels.com/photos/185402/vegetables-fresh-tomatoes-fresh-vegetables-185402.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1 ")
        var contact4 = Contact("Anota","matakwa@gmail.com","07226xxx","Riruta","https://images.pexels.com/photos/4051647/pexels-photo-4051647.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1 ")
        var contact5 = Contact("Anota","matakwa@gmail.com","07226xxx","Riruta","https://images.pexels.com/photos/4869356/pexels-photo-4869356.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1 ")
        var contact6 = Contact("Siara","lubem@gmail.com","078393","Riruta","https://images.pexels.com/photos/8443649/pexels-photo-8443649.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
        var contactList = listOf(contact1,contact7,contact2,contact3,contact4,contact5,contact6)

        var contactAdapter = ContactRvAdapter(contactList)
        binding.RvContact.layoutManager = LinearLayoutManager(this)
        binding.RvContact.adapter = contactAdapter
    }
}