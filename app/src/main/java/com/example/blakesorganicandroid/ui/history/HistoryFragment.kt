package com.example.blakesorganicandroid.ui.history


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.style.ClickableSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.blakesorganicandroid.R
import com.example.blakesorganicandroid.databinding.FragmentHistoryBinding
import com.example.blakesorganicandroid.ui.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_history.*


class HistoryFragment : Fragment(), ItemClickListener {

    private var _binding: FragmentHistoryBinding? = null
//    lateinit var fbView : View
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

        if (historyList.size == 0)
          populateHistory()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 1)
        binding.recyclerview.adapter = CardAdapter(historyList, this)
//        val fbView: View = binding.fbView
//        Log.d("HistoryFragment fbView", fbView.toString())
        binding.fbView.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://www.facebook.com/BlakesOrganic/") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent);
        }
        binding.igView.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://www.instagram.com/blakesalwaysorganic/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent);
        }
        binding.wbView.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://blakesalwaysorganic.ie/online-shop-3/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent);
        }

        return root    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(book: Item)
    {
//        val intent = Intent( activity, DetailActivity::class.java)
//        intent.putExtra(ITEM_ID_EXTRA, book.id)
//        startActivity(intent)
    }

    private fun populateHistory()
    {
        val book1 = Item(
//            R.drawable.benefit3_bacteria_allv1,
            R.drawable.history_organic_coffee_beans,
            "The company is focused only on certified Organic produce.",
            "Blake’s Always Organic is based in The Food Hub, Drumshanbo, Co. Leitrim since 2012",
            "Desc",
            "H1",
            LatLng(53.34946379011656, -6.278325172177447)
        )
        historyList.add(book1)

        val book2 = Item(
//            R.drawable.benefit3_bacteria_allv1,
            R.drawable.history_lough_leitrim_boardwalk,
            "Our current products are Organic Kefir, (a probiotic health drink for gut revitalisation made with whole organic milk.) and Whole-bean Artisan Organic coffees.\n",
            "Sean McGloin became aware of the health benefits of the fermented milk kefir and was making kefir for his family before developing the product on a small commercial scale.",
            "desc",
            "H2",
            LatLng(53.34946379011656, -6.278325172177447)
        )
        historyList.add(book2)

        val book3 = Item(
//            R.drawable.benefit3_bacteria_allv1,
            R.drawable.history_lough_leitrim_small,
            "Kefir originates in the Caucasus mountains.",
            "Hundreds of years ago kefir was found high in the Caucasus mountains villages of nomadic shepherds who had abnormally good health.",
            "Desc",
            "H3",
            LatLng(53.34946379011656, -6.278325172177447)
        )
        historyList.add(book3)

        val book4 = Item(
//            R.drawable.benefit3_bacteria_allv1,
            R.drawable.history_glencar_waterfall,
            "While half the world was dying of malnutrition and disease, these shepherds and their families lived long healthy lives with little or no disease.",
            "On further research, they discovered that part of the diet was a milk product that was stored in bags or containers made from calf stomachs.",
            "Desc",
            "H4",
            LatLng(53.34946379011656, -6.278325172177447)
        )
        historyList.add(book4)

        val book5 = Item(
//            R.drawable.benefit3_bacteria_allv1,
            R.drawable.history_sheep_shepard,
            "As temperatures rose the natural bacteria in the wall of the calf’s stomach bag impregnated the milk causing fermentation resulting in billions of good bacteria that was regular drank by the shepherds to achieve good health.",
            "In 2016, Blakes Always Organic commenced selling “Feel Good” Organic Kefir.",
            "Desc",
            "H5",
            LatLng(53.34946379011656, -6.278325172177447)
        )
        historyList.add(book5)

        val book6 = Item(
//            R.drawable.benefit3_bacteria_allv1,
            R.drawable.history_wooden_850_vat,
            "Starting off, we made batches of kefir in a small 20 litre Bain Marie, which we bottled and labelled by hand.",
            "We had to move to a 200 litre vat within 3 months and in 2018 we had to purchase a 850 litre vat.",
            "Desc",
            "H6",
            LatLng(53.34946379011656, -6.278325172177447)
        )
        historyList.add(book6)

        val book7 = Item(
//            R.drawable.benefit3_bacteria_allv1,
            R.drawable.kefir_in_fridge_blakes_organic,
            "We currently produce around 1600 litres per week. The product proved to be very popular with our health conscious customers.\n",
            "Three years later, and our production scale has grown continuously to cater for the increasing demand as the undisputed health benefits of milk kefir is the main driver of sales.",
            "Desc",
            "H7",
            LatLng(53.34946379011656, -6.278325172177447)
        )
        historyList.add(book7)
    }

}