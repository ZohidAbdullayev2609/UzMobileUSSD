package com.example.uzmobileussd.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uzmobileussd.R
import com.example.uzmobileussd.model.InternetTariflari
import kotlinx.android.synthetic.main.item_internet.view.*

class MyRecycleAdapter(var list: ArrayList<InternetTariflari>) :
    RecyclerView.Adapter<MyRecycleAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(internetTariflari: InternetTariflari) {
            itemView.apply {
                tv_kod.setImageResource(internetTariflari.nomer)
                tv_word.text = internetTariflari.tarif
                tv_description.text = internetTariflari.batafsil

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_internet, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}