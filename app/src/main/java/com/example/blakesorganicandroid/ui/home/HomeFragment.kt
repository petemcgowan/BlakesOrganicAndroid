package com.example.blakesorganicandroid.ui.home

import CustomAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.blakesorganicandroid.R
import com.example.blakesorganicandroid.databinding.FragmentHomeBinding
import com.example.blakesorganicandroid.ui.ItemsViewModel
import kotlinx.android.synthetic.main.fragment_home.*;

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // getting the recyclerview by its id
//        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
//        val recyclerview = findViewById<RecyclerView>(R.id.ForwardBox)
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)


        // this creates a vertical layout Manager
        binding.recyclerview.layoutManager = LinearLayoutManager(activity)
        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.ic_dashboard_black_24dp, "Item " + i))
        }
        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        binding.recyclerview.adapter = adapter

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}