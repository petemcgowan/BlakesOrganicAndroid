package com.buachaillmaith.blakesorganicandroid.ui.products

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.buachaillmaith.blakesorganicandroid.databinding.ActivityDetailBinding
import com.buachaillmaith.blakesorganicandroid.ui.ITEM_ID_EXTRA
import com.buachaillmaith.blakesorganicandroid.ui.Item
import com.buachaillmaith.blakesorganicandroid.ui.productList

class ProductDetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productID = intent.getStringExtra(ITEM_ID_EXTRA)
        val product = productID?.let { productFromID(it) }
        if(product != null)
        {
            binding.cover.setImageResource(product.cover)
            binding.title.text = product.title
            binding.detailLongDescription.text = product.longDescription
        }
    }

    private fun productFromID(productID: String): Item?
    {
        for(product in productList)
        {
            if(product.id == productID)
                return product
        }
        return null
    }
}