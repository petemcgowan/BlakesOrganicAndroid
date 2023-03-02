package com.buachaillmaith.blakesorganicandroid.ui

import androidx.recyclerview.widget.RecyclerView

import com.buachaillmaith.blakesorganicandroid.databinding.MiniCardCellBinding

class MiniCardViewHolder(
    private val miniCardCellBinding: MiniCardCellBinding,
    private val clickListener: ItemClickListener
) : RecyclerView.ViewHolder(miniCardCellBinding.root)
{
    fun bindBook(item: Item)
    {
        miniCardCellBinding.cover.setImageResource(item.cover)
        miniCardCellBinding.title.text = item.title
        miniCardCellBinding.description.text = item.description

        miniCardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(item)
        }
    }
}