package com.buachaillmaith.blakesorganicandroid.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buachaillmaith.blakesorganicandroid.databinding.MiniCardCellBinding

class MiniCardAdapter(
    private val books: List<Item>,
    private val clickListener: ItemClickListener
    )
    : RecyclerView.Adapter<MiniCardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiniCardViewHolder
    {
        val from = LayoutInflater.from(parent.context)
        val binding = MiniCardCellBinding.inflate(from, parent, false)
        return MiniCardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: MiniCardViewHolder, position: Int)
    {
        holder.bindBook(books[position])
    }

    override fun getItemCount(): Int = books.size
}