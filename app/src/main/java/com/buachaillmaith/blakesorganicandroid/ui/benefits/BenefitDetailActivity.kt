package com.buachaillmaith.blakesorganicandroid.ui.benefits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.buachaillmaith.blakesorganicandroid.databinding.ActivityDetailBinding
import com.buachaillmaith.blakesorganicandroid.ui.ITEM_ID_EXTRA
import com.buachaillmaith.blakesorganicandroid.ui.DetailActivity
import com.buachaillmaith.blakesorganicandroid.ui.Item
import com.buachaillmaith.blakesorganicandroid.ui.benefitsList


class BenefitDetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val benefitID = intent.getStringExtra(ITEM_ID_EXTRA)
        val benefit = benefitID?.let { benefitFromID(it) }
        if(benefit != null)
        {
            binding.cover.setImageResource(benefit.cover)
            binding.title.text = benefit.title
            binding.detailLongDescription.text = benefit.longDescription
        }
    }

    private fun benefitFromID(benefitID: String): Item?
    {
        for(benefit in benefitsList)
        {
            if(benefit.id == benefitID)
                return benefit
        }
        return null
    }
}
