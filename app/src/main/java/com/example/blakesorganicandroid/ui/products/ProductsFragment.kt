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
            "Culture Blend is a blend of three Organic coffee beans designed to give our coffee a nice body, with low acidity, and a hint of sweetness. The main bean variety we use is an Arabica bean from Indonesia: Sumatra Mandheling Raja Gayo : The King of the Gayo Mountain. This gives our blend a nice smooth body. To this we add some Peruvian Arabica: HB Grade One, which gives our blend its sweetness and a hint of fruitiness. Then we add a small amount of a quality Asian Robusta for that extra kick of caffeine.\n" +
                    "\n" +
                    "After some experimental roasting and tastings to look at possible blending options, we are confident that this blend is something special. Finally, the first full roasting has been complete, the coffee pouched up and ready for sale, and the smell of freshly roasted coffee fills the air.\n" +
                    "\n" +
                    "We hope that you enjoy our Culture Blend coffee as much as we do…",
            "Culture Blend",
            "Blakes Culture Blend: Organic Whole Bean Coffee 250g\n",
            "P2"
        )
        productList.add(product2)

        val product3 = Book(
            R.drawable.organic_pure_decaf_high_res_blakes_organic,
            "Our Peru CO2 Decaf is made from only Peruvian 100% Organic Arabica coffee beans, using the CO2 decaffeination process. This process uses carbon dioxide to extract almost all of the caffeine from the beans without extracting the rich flavours that are found within the Peruvian Arabica coffee, (rather than being soaked out and then put back in as they do in both the indirect solvent or Swiss Water decaffeination processes).\n" +
                    "\n" +
                    "We then roast our coffee beans in small batches in Co. Leitrim. The resulting coffee is a medium-bodied, well balanced nutty-flavoured coffee with mild acidity and a hint of citrus zest. The coffee performs well as either an espresso coffee or with milk added.",
            "Peru CO2 Decaf",
            "desc",
            "P3"
        )
        productList.add(product3)

        val product4 = Book(
            R.drawable.product_purely_arabica_back,
            "Feedback we received from coffee lovers indicated a demand for a blend with a milder caffeine boost. We investigated mixing decaffeinated beans with arabica beans to give a refreshing taste with less kick, but the composition of the decaffeinated coffee beans proved unworkable. We then experimented with South American beans, using the fruity, well-balanced Peruvian Arabica hard beans, blended with a rich flavoured Colombian Excelso Arabica. By not adding any Robusta to the blend, we reduced the caffeine kick.  The result is a mild, yet full-flavoured blend: A perfect after-dinner coffee.",
            "Purely Arabica",
            "'Purely Arabica: Organic Whole Bean Coffee 250g\n",
            "P4"
        )
        productList.add(product4)

        val product5 = Book(
            R.drawable.faq_how_do_you_drink_your_kefir,
            "Kefir is a yoghurt style drink, exceptionally rich in nutrients and probiotics, aiding digestion and providing excellent gut health.\n" +
                    "\n" +
                    "It is high in protein, calcium and vitamin D and tastes amazing too!",
            "Organic Milk Kefir",
            "750 ml and 250 ml Blakes Organic Milk Kefir -Natural",
            "P5"
        )
        productList.add(product5)

        val product6 = Book(
            R.drawable.kefir_in_a_fridge_looking_cool,
            "A 1 cup serving of low fat kefir contains:\n" +
                    "\n" +
                    "Protein: 9 grams\n" +
                    "Calcium: 24% of the daily value (DV)\n" +
                    "Phosphorus: 20% of the DV\n" +
                    "Vitamin B12: 29% of the DV\n" +
                    "Riboflavin (B2): 25% of the DV\n" +
                    "Magnesium: 7% of the DV\n" +
                    "Vitamin D: 12% of the DV\n" +
                    "In addition, kefir has about 104 calories, 11.6 grams of carbs, and 2–3 grams of fat, depending on the type of milk used.\n" +
                    "\n" +
                    "Kefir also contains a wide variety of bioactive compounds, including organic acids and peptides that contribute to its health benefits.\n" +
                    "\n" +
                    "Dairy-free versions of kefir can be made with coconut water, coconut milk, or other sweet liquids. These will not have the same nutrient profile as dairy-based kefir.",
            "Kefir 6-Pack",
            "desc",
            "P6"
        )
        productList.add(product6)
    }
}