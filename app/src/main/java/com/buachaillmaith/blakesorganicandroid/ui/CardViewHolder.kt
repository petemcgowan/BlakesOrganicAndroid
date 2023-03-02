package com.buachaillmaith.blakesorganicandroid.ui

import androidx.recyclerview.widget.RecyclerView

import com.buachaillmaith.blakesorganicandroid.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: ItemClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(item: Item)
    {
        cardCellBinding.cover.setImageResource(item.cover)
        cardCellBinding.title.text = item.title
        cardCellBinding.longDescription.text = item.description

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(item)
        }
    }
}