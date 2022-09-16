package com.example.blakesorganicandroid.ui

import androidx.recyclerview.widget.RecyclerView

import com.example.blakesorganicandroid.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(book: Book)
    {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.title.text = book.title
        cardCellBinding.author.text = book.author

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }
    }
}