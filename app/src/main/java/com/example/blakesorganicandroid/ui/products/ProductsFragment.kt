package com.example.blakesorganicandroid.ui.products

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.blakesorganicandroid.R
import com.example.blakesorganicandroid.databinding.FragmentProductsBinding
import com.example.blakesorganicandroid.ui.*

class ProductsFragment : Fragment(), BookClickListener {

    private var _binding: FragmentProductsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        if (productList.size == 0)
          populateProducts()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 2)
        binding.recyclerview.adapter = CardAdapter(productList, this)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(book: Book)
    {
        val intent = Intent(activity, ProductDetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun populateProducts()
    {
        val product1 = Book(
            R.drawable.product_sheebeg_cheese,
            "Our Sheebeg Organic Raw Milk Irish made cheese is a strong cheddar type cheese, matured for 24-36 months here in The Food Hub, before being cut into 140g wedges for our customers\n",
            "Sheebeg Cheese", // longer description (the Detail activity)
            "desc",
            "P1"
        )
        productList.add(product1)

        val product2 = Book(
            R.drawable.product_coffee_packs_side_by_side,
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g",
            "Culture Blend",
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g\n",
            "P2"
        )
        productList.add(product2)

        val product3 = Book(
            R.drawable.product_culture_catering_pack_1kg,
            "Purely Arabica Blend Organic Whole Bean Coffee Catering Pack 1Kg",
            "Catering 1kg",
            "Purely Arabica Blend Organic Whole Bean Coffee Catering Pack 1Kg",
            "P3"
        )
        productList.add(product3)

        val product4 = Book(
            R.drawable.product_purely_arabica_back,
            "Purely Arabica: Organic Whole Bean Coffee 250g",
            "Purely Arabica",
            "'Purely Arabica: Organic Whole Bean Coffee 250g\n" + "\n" + "Purely Arabica: Organic Whole Bean Coffee 250g\n" + "\n" + "Purely Arabica: Organic Whole Bean Coffee 250g\n",
            "P4"
        )
        productList.add(product4)

        val product5 = Book(
            R.drawable.product_new_kefir_750ml,
            "Kefir is a yoghurt style drink, exceptionally rich in nutrients and probiotics, aiding digestion and providing excellent gut health.\n" +
                    "\n" +
                    "It is high in protein, calcium and vitamin D and tastes amazing too!",
            "750ml Kefir",
            "750 ml Blakes Organic Milk Kefir -Natural",
            "P5"
        )
        productList.add(product5)

        val product6 = Book(
            R.drawable.kefir_in_a_fridge_looking_cool,
            "250 ml Blakes Organic Milk Kefir -Natural flavour- Six bottle pack",
            "Kefir 6-Pack",
            "250 ml Blakes Organic Milk Kefir -Natural flavour- Six bottle pack",
            "P6"
        )
        productList.add(product6)

        val product7 = Book(
            R.drawable.faq_how_do_you_drink_your_kefir,
            "250 ml Blakes Organic Milk Kefir -Natural",
            "250ml Kefir",
            "250 ml Blakes Organic Milk Kefir -Natural\n",
            "P7"
        )
        productList.add(product7)
    }
}