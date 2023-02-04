package com.muratipek.k11_superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.muratipek.k11_superkahramankitabi.databinding.RecyclerRowBinding

class RecyclerAdapter(val kahramanIsmi : ArrayList<String>, val kahramanGorselleri : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuperKahramanVH(binding)
    }

    override fun getItemCount(): Int {
        return kahramanIsmi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.binding.recyclerViewTextView.text = kahramanIsmi.get(position)
        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi", kahramanIsmi.get(position))
            intent.putExtra("superKahramanGorseli", kahramanGorselleri.get(position))
            /*
            val singleton = SingletonClass.SecilenKahraman
            singleton.gorsel = kahramanResmi.get(position)
             */
            holder.itemView.context.startActivity(intent)
        }
    }

}