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
        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun populateProducts()
    {

        val product1 = Book(
            R.drawable.product_50ml_kefir,
            "Blakes Culture Blend Organic Whole Bean Coffee Catering Pack 1Kg", // 3rd line (author)
            "Blakes Culture Blend Organic Whole Bean Coffee Catering Pack 1Kg",  // 2nd line (Title)
            "Blakes Culture Blend Organic Whole Bean Coffee Catering Pack 1Kg", // longer description (the Detail activity)
            "P1"
        )
        productList.add(product1)

        val product2 = Book(
            R.drawable.product_coffee_packs_side_by_side,
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g",
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g",
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g\n",
            "P2"
        )
        productList.add(product2)

        val product3 = Book(
            R.drawable.product_purely_arabica_back,
            "Purely Arabica Blend Organic Whole Bean Coffee Catering Pack 1Kg",
            "Purely Arabica Blend Organic Whole Bean Coffee Catering Pack 1Kg",
            "Purely Arabica Blend Organic Whole Bean Coffee Catering Pack 1Kg",
            "P3"
        )
        productList.add(product3)

        val product4 = Book(
            R.drawable.product_culture_catering_pack_1kg,
            "Purely Arabica: Organic Whole Bean Coffee 250g",
            "Purely Arabica: Organic Whole Bean Coffee 250g",
            "'Purely Arabica: Organic Whole Bean Coffee 250g\n" + "\n" + "Purely Arabica: Organic Whole Bean Coffee 250g\n" + "\n" + "Purely Arabica: Organic Whole Bean Coffee 250g\n",
            "P4"
        )
        productList.add(product4)

        val product5 = Book(
            R.drawable.product_culture_catering_pack_1kg,
            "750 ml Blakes Organic Milk Kefir -Natural",
            "750 ml Blakes Organic Milk Kefir -Natural",
            "750 ml Blakes Organic Milk Kefir -Natural",
            "P5"
        )
        productList.add(product5)

        val product6 = Book(
            R.drawable.product_culture_catering_pack_1kg,
            "250 ml Blakes Organic Milk Kefir -Natural flavour- Six bottle pack",
            "250 ml Blakes Organic Milk Kefir -Natural flavour- Six bottle pack",
            "250 ml Blakes Organic Milk Kefir -Natural flavour- Six bottle pack",
            "P6"
        )
        productList.add(product6)

        val product7 = Book(
            R.drawable.product_culture_catering_pack_1kg,
            "250 ml Blakes Organic Milk Kefir -Natural",
            "250 ml Blakes Organic Milk Kefir -Natural",
            "250 ml Blakes Organic Milk Kefir -Natural\n",
            "P7"
        )
        productList.add(product7)
    }
}