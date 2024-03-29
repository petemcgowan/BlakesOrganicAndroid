package com.buachaillmaith.blakesorganicandroid.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buachaillmaith.blakesorganicandroid.databinding.CardCellBinding

class CardAdapter(
    private val books: List<Item>,
    private val clickListener: ItemClickListener
    )
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder
    {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int)
    {
        holder.bindBook(books[position])
    }

    override fun getItemCount(): Int = books.size
}