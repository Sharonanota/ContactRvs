package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import com.siara.mycontacts.R
import com.siara.mycontacts.databinding.ActivityContactDisplayBinding
import com.squareup.picasso.Picasso
import java.nio.channels.Pipe

class contactDisplay : AppCompatActivity() {
    lateinit var binding:ActivityContactDisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityContactDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }

    fun getExtras() {
        var name = intent.extras?.getString("NAME")
        var number = intent.extras?.getString("NUMBER")
        var image = binding.ivAnota

        Toast.makeText(this, name, Toast.LENGTH_LONG).show()

        binding.tvNames.text = name
        binding.tvNumber.text = number



        Picasso.get().load(intent.getStringExtra("IMAGE")).resize(200, 200).centerCrop()
            .into(binding.ivAnota)
    }
}