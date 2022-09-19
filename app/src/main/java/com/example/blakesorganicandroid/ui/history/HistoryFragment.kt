package com.example.blakesorganicandroid.ui.history

import CustomAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blakesorganicandroid.R
import com.example.blakesorganicandroid.databinding.FragmentHistoryBinding
import com.example.blakesorganicandroid.ui.*

class HistoryFragment : Fragment(), BookClickListener {

    private var _binding: FragmentHistoryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val historyViewModel =
//            ViewModelProvider(this).get(HistoryViewModel::class.java)

        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        populateHistory()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 2)
        binding.recyclerview.adapter = CardAdapter(historyList, this)


        return root    }

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

    private fun populateHistory()
    {
        val book1 = Book(
            R.drawable._50ml_kefir_550x825,
            "Victoria Devine",
            "The company is focused only on certified Organic produce.",
            "Blake’s Always Organic is based in The Food Hub, Drumshanbo, Co. Leitrim since 2012"
        )
        historyList.add(book1)

        val book2 = Book(
            R.drawable.__coffee_packs_side_by_side,
            "Amanda Lohrey",
            "Sean McGloin became aware of the health benefits of the fermented milk kefir and was making kefir for his family before developing the product on a small commercial scale.",
            "Our current products are Organic Kefir, (a probiotic health drink for gut revitalisation made with whole organic milk.) and Whole-bean Artisan Organic coffees.\n"
        )
        historyList.add(book2)

        val book3 = Book(
            R.drawable.back_of_coffee_high_res_blakes_organic,
            "M. Scott Peck",
            "Hundreds of years ago kefir was found high in the Caucasus mountains villages of nomadic shepherds who had abnormally good health.",
            "Kefir originates in the Caucasus mountains."
        )
        historyList.add(book3)

        val book4 = Book(
            R.drawable.blakes_culture_blend_organic_whole_bean_coffee_catering_pack_1kg,
            "Colleen Hoover",
            "On further research, they discovered that part of the diet was a milk product that was stored in bags or containers made from calf stomachs.",
            "While half the world was dying of malnutrition and disease, these shepherds and their families lived long healthy lives with little or no disease.",
        )
        historyList.add(book4)

        val book5 = Book(
            R.drawable.blakes_culture_blend_organic_whole_bean_coffee_catering_pack_1kg,
            "Ross Coulthart",
            "In 2016, Blakes Always Organic commenced selling “Feel Good” Organic Kefir.",
            "As temperatures rose the natural bacteria in the wall of the calf’s stomach bag impregnated the milk causing fermentation resulting in billions of good bacteria that was regular drank by the shepherds to achieve good health."
        )
        historyList.add(book5)

        val book6 = Book(
            R.drawable.blakes_culture_blend_organic_whole_bean_coffee_catering_pack_1kg,
            "Richard Osman",
            "We had to move to a 200 litre vat within 3 months and in 2018 we had to purchase a 850 litre vat.",
            "Starting off, we made batches of kefir in a small 20 litre Bain Marie, which we bottled and labelled by hand.",
        )
        historyList.add(book6)

        val book7 = Book(
            R.drawable.blakes_culture_blend_organic_whole_bean_coffee_catering_pack_1kg,
            "Michael Robotham",
            "Three years later, and our production scale has grown continuously to cater for the increasing demand as the undisputed health benefits of milk kefir is the main driver of sales.",
            "We currently produce around 1600 litres per week. The product proved to be very popular with our health conscious customers.\n"
        )
        historyList.add(book7)


        historyList.add(book1)
        historyList.add(book2)
        historyList.add(book3)
        historyList.add(book4)
        historyList.add(book5)
        historyList.add(book6)
        historyList.add(book7)
    }

}