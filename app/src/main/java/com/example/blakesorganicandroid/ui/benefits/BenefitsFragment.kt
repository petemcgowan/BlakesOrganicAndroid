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

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 4)
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
            R.drawable.abtm,
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
            R.drawable.tmom,
            "Other areas where our customers are claiming it has benefitted them are:\n" +
                    "• Alopecia\n" +
                    "• Lyme’s Disease\n" +
                    "• Increased immunity\n",
            "Other areas where our customers are claiming it has benefitted them are:\n" +
                    "• Alopecia\n" +
                    "• Lyme’s Disease\n" +
                    "• Increased immunity\n",
            "Other areas where our customers are claiming it has benefitted them are:\n" +
                    "• Alopecia\n" +
                    "• Lyme’s Disease\n" +
                    "• Increased immunity\n",
            "B2"
        )
        benefitsList.add(benefit2)

        val benefit3 = Book(
            R.drawable.tmom,
            "Many internet research suggest that Kefir can help with fighting cancer." +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n",
            "Many internet research suggest that Kefir can help with fighting cancer." +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n",
            "Many internet research suggest that Kefir can help with fighting cancer." +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n",
            "B3"
        )
        benefitsList.add(benefit3)
    }
}
