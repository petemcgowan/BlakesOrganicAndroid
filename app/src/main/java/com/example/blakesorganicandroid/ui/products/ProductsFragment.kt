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
//        val productsViewModel =
//            ViewModelProvider(this).get(ProductsViewModel::class.java)

        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        populateBooks()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 3)

        binding.recyclerview.adapter = CardAdapter(bookList, this)


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

    private fun populateBooks()
    {

        val book1 = Book(
            R.drawable._50ml_kefir_550x825,
            "Blakes Culture Blend Organic Whole Bean Coffee Catering Pack 1Kg", // 3rd line (author)
            "Blakes Culture Blend Organic Whole Bean Coffee Catering Pack 1Kg",  // 2nd line (Title)
            "Blakes Culture Blend Organic Whole Bean Coffee Catering Pack 1Kg" // longer description (the Detail activity)
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.__coffee_packs_side_by_side,
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g",
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g",
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g\n"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.back_of_coffee_high_res_blakes_organic,
            "Purely Arabica Blend Organic Whole Bean Coffee Catering Pack 1Kg",
            "Purely Arabica Blend Organic Whole Bean Coffee Catering Pack 1Kg",
            "Purely Arabica Blend Organic Whole Bean Coffee Catering Pack 1Kg"
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.blakes_culture_blend_organic_whole_bean_coffee_catering_pack_1kg,
            "Purely Arabica: Organic Whole Bean Coffee 250g",
            "Purely Arabica: Organic Whole Bean Coffee 250g",
            "'Purely Arabica: Organic Whole Bean Coffee 250g\n" + "\n" + "Purely Arabica: Organic Whole Bean Coffee 250g\n" + "\n" + "Purely Arabica: Organic Whole Bean Coffee 250g\n",
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.blakes_culture_blend_organic_whole_bean_coffee_catering_pack_1kg,
            "750 ml Blakes Organic Milk Kefir -Natural",
            "750 ml Blakes Organic Milk Kefir -Natural",
            "750 ml Blakes Organic Milk Kefir -Natural"
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.blakes_culture_blend_organic_whole_bean_coffee_catering_pack_1kg,
            "250 ml Blakes Organic Milk Kefir -Natural flavour- Six bottle pack",
            "250 ml Blakes Organic Milk Kefir -Natural flavour- Six bottle pack",
            "250 ml Blakes Organic Milk Kefir -Natural flavour- Six bottle pack",
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.blakes_culture_blend_organic_whole_bean_coffee_catering_pack_1kg,
            "250 ml Blakes Organic Milk Kefir -Natural",
            "250 ml Blakes Organic Milk Kefir -Natural",
            "250 ml Blakes Organic Milk Kefir -Natural\n"
        )
        bookList.add(book7)

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
    }


}