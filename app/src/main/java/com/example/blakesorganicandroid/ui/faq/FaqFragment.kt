package com.example.blakesorganicandroid.ui.faq

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.blakesorganicandroid.R
import com.example.blakesorganicandroid.databinding.FragmentFaqBinding
import com.example.blakesorganicandroid.ui.*

class FaqFragment : Fragment(), BookClickListener {

    private var _binding: FragmentFaqBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFaqBinding.inflate(inflater, container, false)
        val root: View = binding.root

        if (faqList.size == 0)
          populateFaq()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 1)
        binding.recyclerview.adapter = CardAdapter(faqList, this)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(book: Book)
    {
        val intent = Intent( activity, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun populateFaq()
    {
        val faq1 = Book(
            R.drawable.faq_kefir_in_a_fridge_looking_cool,
            "Generally, we have found that the recommended daily amount is around 100 grams per day, so half of one of our 250g bottles of Blakes ‘Feel Good’ Kefir should be fine, but you might find it beneficial to start on a third of the bottle to allow your gut to acclimatize to the kefir for the first few days.",
            "How much Kefir should I take?",
            "Generally, we have found that the recommended daily amount is around 100 grams per day, so half of one of our 250g bottles of Blakes ‘Feel Good’ Kefir should be fine, but you might find it beneficial to start on a third of the bottle to allow your gut to acclimatize to the kefir for the first few days.",
            "F1"
        )
        faqList.add(faq1)

        val faq2 = Book(
            R.drawable.faq_sexy_kefir,
            "Yes. The Kefir bottles are made from P.E.T. plastic and fully recyclable, as is the lid. Our coffee pouches are also recyclable, and we hope to introduce compostable/biodegradable coffee pouches in the near future.",
            "Are your wrappers/labels and bottles recyclable?",
            "Yes. The Kefir bottles are made from P.E.T. plastic and fully recyclable, as is the lid. Our coffee pouches are also recyclable, and we hope to introduce compostable/biodegradable coffee pouches in the near future.",
            "F2"
        )
        faqList.add(faq2)

        val faq3 = Book(
            R.drawable.faq_how_do_you_drink_your_kefir,
            "The kefir can be consumed straight from the bottle. Some people may find the taste a bit sharp for their pallet, and if that is the case, you can make a smoothie or add a little fruit juice to sweeten up the kefir. We would recommend that you do this shortly before consumption, however, as the kefir may begin to ferment again from the natural sugars in the fruit. (This is referred to as Double Fermentation and is perfectly natural, but it may affect the flavour and consistency, if left out of a chilled environment for even a short period of time).\n" +
                    "        Alternatively, why not soak some porridge oats overnight in kefir for a healthy creamy breakfast?",
            "How do you drink your Kefir?",
            "The kefir can be consumed straight from the bottle. Some people may find the taste a bit sharp for their pallet, and if that is the case, you can make a smoothie or add a little fruit juice to sweeten up the kefir. We would recommend that you do this shortly before consumption, however, as the kefir may begin to ferment again from the natural sugars in the fruit. (This is referred to as Double Fermentation and is perfectly natural, but it may affect the flavour and consistency, if left out of a chilled environment for even a short period of time).\n" +
                    "        Alternatively, why not soak some porridge oats overnight in kefir for a healthy creamy breakfast?",
            "F3"
        )
        faqList.add(faq3)

        val faq4 = Book(
            R.drawable.faq_kefir_fermentation,
            "Our Kefir is a live product, and will continue to ferment, especially if the temperature of the product goes over 5 degrees Centigrade. It can, therefore, be prone to separation into ‘curds’ and ‘whey’. The pH level will also be slightly sharper if this happens.\n" +
                    "\n" +
                    "We aim for a rich creamy texture and a low pH for a consistent product, but some people prefer a sharper taste. If that is the case, then simple leave the kefir at room temperature for a few hours and it will become more acidic tasting.\n" +
                    "\n" +
                    "If you find that it has separated slightly, simply shake the bottle before consumption.\n" +
                    "\n" +
                    "*Alternatively , you can allow the kefir to separate fully into curds and whey, and drain off the watery whey into a cloth covered sieve using some muslin (or a clean tea towel will do). The curds you have left will make a delicious cream cheese (try adding some wild garlic, green onions, or chives to make it even tastier.)",
            "I bought some kefir recently, but i found that it had a watery liquid on top of the bottle when i took it out of the fridge the next day. Is that normal?",
            "Our Kefir is a live product, and will continue to ferment, especially if the temperature of the product goes over 5 degrees Centigrade. It can, therefore, be prone to separation into ‘curds’ and ‘whey’. The pH level will also be slightly sharper if this happens.\n" +
                    "\n" +
                    "We aim for a rich creamy texture and a low pH for a consistent product, but some people prefer a sharper taste. If that is the case, then simple leave the kefir at room temperature for a few hours and it will become more acidic tasting.\n" +
                    "\n" +
                    "If you find that it has separated slightly, simply shake the bottle before consumption.\n" +
                    "\n" +
                    "*Alternatively , you can allow the kefir to seperate fully into curds and whey, and drain off the watery whey into a cloth covered sieve using some muslin (or a clean tea towel will do). The curds you have left will make a delicious cream cheese (try adding some wild garlic, green onions, or chives to make it even tastier.)",
            "F4"
        )
        faqList.add(faq4)
    }
}
