package com
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.siara.mycontacts.R
import com.siara.mycontacts.databinding.ContactlistitemBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contactlist: List<Contact>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactlistitemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var CurrentContact = contactlist.get(position)
        holder.binding.tvName.text = CurrentContact.name
        holder.binding.tvPhone.text = CurrentContact.phoneNumber
        holder.binding.tvEmail.text = CurrentContact.email
        holder.binding.tvAddress.text =CurrentContact.address
        Picasso.get().load(CurrentContact.image).resize(300,300).centerCrop().
        placeholder(R.drawable.ic_baseline_person_24).into(holder.binding.imageView)

        val context=holder.itemView.context
        holder.binding.imageView.setOnClickListener {
            Toast.makeText(context,"You have clicked the image", Toast.LENGTH_SHORT).show()
        }
        holder.binding.cdContact.setOnClickListener {
            val intent = Intent(context,contactDisplay::class.java)
            intent.putExtra("NAME",CurrentContact.name)
            intent.putExtra("ADDRESS",CurrentContact.address)
            intent.putExtra("IMAGE",CurrentContact.image)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}
class ContactViewHolder(val binding: ContactlistitemBinding):
    RecyclerView.ViewHolder(binding.root)