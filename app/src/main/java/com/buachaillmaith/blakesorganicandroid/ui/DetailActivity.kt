package com.buachaillmaith.blakesorganicandroid.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.buachaillmaith.blakesorganicandroid.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productID = intent.getStringExtra(ITEM_ID_EXTRA)
        val book = productID?.let { bookFromID(it) }
        if(book != null)
        {
            binding.cover.setImageResource(book.cover)
            binding.title.text = book.title
            binding.detailLongDescription.text = book.longDescription
        }
    }

    private fun bookFromID(productID: String): Item?
    {
        for(book in productList)
        {
            if(book.id == productID)
                return book
        }
        return null
    }
}