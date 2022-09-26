package com.example.blakesorganicandroid.ui.benefits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.blakesorganicandroid.databinding.ActivityDetailBinding
import com.example.blakesorganicandroid.ui.BOOK_ID_EXTRA
import com.example.blakesorganicandroid.ui.Book
import com.example.blakesorganicandroid.ui.benefitsList


class BenefitDetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val benefitID = intent.getStringExtra(BOOK_ID_EXTRA)
        val benefit = benefitID?.let { benefitFromID(it) }
        if(benefit != null)
        {
            binding.cover.setImageResource(benefit.cover)
            binding.title.text = benefit.title
            binding.detailLongDescription.text = benefit.longDescription
        }
    }

    private fun benefitFromID(benefitID: String): Book?
    {
        for(benefit in benefitsList)
        {
            if(benefit.id == benefitID)
                return benefit
        }
        return null
    }
}
