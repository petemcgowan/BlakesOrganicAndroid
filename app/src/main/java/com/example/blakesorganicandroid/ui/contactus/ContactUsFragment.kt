package com.example.blakesorganicandroid.ui.contactus

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
import com.example.blakesorganicandroid.databinding.FragmentContactUsBinding
import com.example.blakesorganicandroid.ui.*

class ContactUsFragment : Fragment(), BookClickListener {

    private var _binding: FragmentContactUsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val contactUsViewModel =
//            ViewModelProvider(this).get(BenefitsViewModel::class.java)

        _binding = FragmentContactUsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        if (contactUsList.size == 0)
            populateContactUs()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 4)
        binding.recyclerview.adapter = CardAdapter(contactUsList, this)
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

    private fun populateContactUs()
    {
        val book1 = Book(
            R.drawable.abtm,
            "Unit 3, The Food Hub\n",
            "Carricknabrack\n",
            "Description not needed?",
            "C1"
        )
        contactUsList.add(book1)

        val book2 = Book(
            R.drawable.tmom,
            "Blakes Always Organic Ltd.",
            "Drumshanbo\n",
            "",
            "C2"
        )
        contactUsList.add(book2)

        val book3 = Book(
            R.drawable.trlt,
            "Phone : (+353) 0719640537",
            "Drumshanbo\n" +
                    "Co. Leitrim\n" +
                    "N41 HY67\n" +
                    "Ireland",
            "",
            "C3"
        )
        contactUsList.add(book3)

        val book4 = Book(
            R.drawable.iewu,
            "Colleen Hoover",
            "IT ENDS WITH US",
            "",
            "C4"
        )
        contactUsList.add(book4)
    }
}
