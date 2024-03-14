package com.example.doglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doglist.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View):RecyclerView.ViewHolder(view) {
    private val binding = ItemDogBinding.bind(view)
    fun bind(image: String) {
        Picasso.get().load(image).into(binding.ivDog)
    }
}
class DogAdapter(private val images: List<String>) : RecyclerView.Adapter<DogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog, parent, false))
    }

    override fun getItemCount(): Int = images.size
    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }
 }

