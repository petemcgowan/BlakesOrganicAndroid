package com.example.blakesorganicandroid.ui.benefits

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
import com.example.blakesorganicandroid.databinding.FragmentBenefitsBinding
import com.example.blakesorganicandroid.ui.*

class BenefitsFragment : Fragment(), BookClickListener {

    private var _binding: FragmentBenefitsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBenefitsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        if (benefitsList.size == 0)
            populateBenefits()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 1)
        binding.recyclerview.adapter = CardAdapter(benefitsList, this)
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

    private fun populateBenefits()
    {
        val benefit1 = Book(
            R.drawable.benefit_4_healthy_bones_skeleton,
            "Kefir is a fantastic source of many nutrients",
            "Our customers take kefir for a wide range of ailments. Basically, anything to do with the gut, such as:" +
                    "• IBS," +
                    " • Anxiety,\n" +
                    " • Heartburn,\n" +
                    " • Constipation\n" +
                    "• Relief when taking antibiotics\n",
            "Our customers take kefir for a wide range of ailments. Basically, anything to do with the gut, such as:" +
                    "• IBS," +
                    " • Anxiety,\n" +
                    " • Heartburn,\n" +
                    " • Constipation\n" +
                    "• Relief when taking antibiotics\n",
            "B1"
        )
        benefitsList.add(benefit1)

        val benefit2 = Book(
            R.drawable.benefit_4_healthy_bones_skeleton,
            "Kefir has potent antibacterial properties",
            "title",
            "Certain probiotics in kefir are believed to protect against infections." +
                    "This includes the probiotic Lactobacillus kefiri, which is unique to kefir." +
                    "Studies demonstrate that this probiotic can inhibit the growth of various harmful bacteria, including Salmonella, Helicobacter pylori, and E. coli" +
                    "Kefiran, a type of carbohydrate present in kefir, also has antibacterial properties\n" +
            "tl;dr:"
                    + "Kefir contains the probiotic Lactobacillus kefiri and the carbohydrate kefiran, both of which protect against harmful bacteria.\n",
            "B2"
        )
        benefitsList.add(benefit2)

        val benefit3 = Book(
            R.drawable.benefit_4_healthy_bones_skeleton,
            "Many internet research suggest that Kefir can help with fighting cancer." +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n",
            "Many internet research suggest that Kefir can help with fighting cancer." +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n",
            "Many internet research suggest that Kefir can help with fighting cancer." +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n",
            "B3"
        )
        benefitsList.add(benefit3)

        val benefit4 = Book(
            R.drawable.benefit_4_healthy_bones_skeleton,
            "author",
            "Kefir can improve bone health and lower the risk of osteoporosis",
            "Osteoporosis is characterized by deterioration of bone tissue and is a major concern in Western countries. It is especially common among older women and dramatically raises the risk of fractures.\n" +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n" +
            "Ensuring an adequate calcium intake is one of the most effective ways to improve bone health and slow the progression of osteoporosis (11Trusted Source)." +
                    "Full fat kefir is not only a great source of calcium but also vitamin K2 — which plays a central role in calcium metabolism. Supplementing with K2 has been shown to reduce your risk of fractures by as much as 81%" +
            "Recent animal studies associate kefir with increased calcium absorption in bone cells. This leads to improved bone density, which should help prevent fractures\n" +
                    "SUMMARY\n" + "Kefir made from dairy is an excellent source of calcium, and full-fat dairy kefir also contains vitamin K2. These nutrients have major benefits for bone health.",
            "B3"
        )
        benefitsList.add(benefit4)
    }
}
