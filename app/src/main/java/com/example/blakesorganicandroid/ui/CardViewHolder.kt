package com.example.blakesorganicandroid.ui

import androidx.recyclerview.widget.RecyclerView

import com.example.blakesorganicandroid.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: ItemClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(book: Item)
    {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.title.text = book.title
        cardCellBinding.longDescription.text = book.longDescription

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }
    }
}