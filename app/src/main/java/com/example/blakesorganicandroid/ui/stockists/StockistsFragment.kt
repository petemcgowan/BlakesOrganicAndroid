package com.example.blakesorganicandroid.ui.stockists

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.blakesorganicandroid.R
import com.example.blakesorganicandroid.databinding.FragmentStockistsBinding
import com.example.blakesorganicandroid.ui.*


class StockistsFragment : Fragment(), ItemClickListener {

    private var _binding: FragmentStockistsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStockistsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        if (stockistsList.size == 0)
            populateStockists()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 2)
        binding.recyclerview.adapter = CardAdapter(stockistsList, this)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(book: Item)
    {
        val intent = Intent(activity, MapsActivity::class.java)
        intent.putExtra(ITEM_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun populateStockists()
    {
        // Rua Cafe and Delicatessen
        val stockistCafeRua = Item(
            R.drawable.stockist_cafe_rua,
            "Spencer St, Gorteendrunagh, Castlebar, Co. Mayo",  // address
            "Cafe Rua",   // name of stockist
            "desc", //
            "S1"
        )
        stockistsList.add(stockistCafeRua)

        // Morton's, Ranelagh, Dublin
        val mortonsRanelagh = Item(
            R.drawable.stockist_mortons_ranelagh,
            "Ranelagh, Dublin",  // address
            "Morton's",   // name of stockist
            "desc", //
            "S23"
        )
        stockistsList.add(mortonsRanelagh)

        // Donnybrook Fair, Dublin 4
        val donnybrookFairDublin = Item(
            R.drawable.stockist_donnybrook_fair,
            "89 Morehampton Rd, Dublin 4",  // address
            "Donnybrook Fair, Dublin 4",   // name of stockist
            "desc", //
            "S4"
        )
        stockistsList.add(donnybrookFairDublin)

        // Shannon Fruit, Tullyvarraga
        val stockistCosgroveSligo = Item(
            R.drawable.stockist_shannon_fruit,
            "Skycourt Shopping Centre, Tullyvarraga, Shannon, Co. Clare",  // address
            "Shannon Fruit",   // name of stockist
            "desc", //
            "S4"
        )
        stockistsList.add(stockistCosgroveSligo)

        // Cosgrove & Son, Abbeyquarter North
        val cosgroveAbbeyquarter = Item(
            R.drawable.stockist_cosgrove_sligo,
            "32 Market St, Abbeyquarter North, Sligo",  // address
            "Cosgrove & Son, Abbeyquarter North",   // name of stockist
            "desc", //
            "S5"
        )
        stockistsList.add(cosgroveAbbeyquarter)

        // Osta, Sligo
        val ostaSligo = Item(
            R.drawable.stockist_osta_sligo,
            "Garavogue Weir, Stephen Street, Sligo",  // address
            "Osta, Sligo",   // name of stockist
            "desc", //
            "S6"
        )
        stockistsList.add(ostaSligo)

        // Nature Health, Navan
        val natureNavan = Item(
            R.drawable.stockist_nature_navan,
            "Navan Shoppping Cantre, 1 Kennedy Rd, Navan",  // address
            "Nature Health, Navan",   // name of stockist
            "desc", //
            "S7"
        )
        stockistsList.add(natureNavan)

        // Natures Gold, Dunboyne
        val natureDunboyne = Item(
            R.drawable.stockist_nature_dunboyne,
            "Avoca, Dunboyne",  // address
            "Nature's Gold, Dunboyne",   // name of stockist
            "desc", //
            "S8"
        )
        stockistsList.add(natureDunboyne)

        // Nature’s Gold, Rathcoole
        val natureRathcoole = Item(
            R.drawable.stockist_nature_rathcoole,
            "Avoca Stores & cafe, Naas Road, Rathcoole",  // address
            "Nature’s Gold, Rathcoole",   // name of stockist
            "desc", //
            "S9"
        )
        stockistsList.add(natureRathcoole)

        // Fresh, Rathfarnham
        val freshRathfarnham = Item(
            R.drawable.stockist_fresh_rathfarnham,
            "Rosemount Shopping Centre, Marian Road, Rathfarnham",  // address
            "Fresh, Rathfarnham",   // name of stockist
            "desc", //
            "S10"
        )
        stockistsList.add(freshRathfarnham)

        // Boyne Valley Seafoods, Drogheda
        val boyneDrogheda = Item(
            R.drawable.stockist_boyne_drogheda,
            "Southgate Shopping Centre, Drogheda",  // address
            "Boyne Valley Seafoods",   // name of stockist
            "desc", //
            "S11"
        )
        stockistsList.add(boyneDrogheda)

        // The Hopsack, Rathmines
        val hopsackRathmines = Item(
            R.drawable.stockist_hopsack_rathmines,
            "The Swan Shopping Centre, Rathmines Road Lower",  // address
            "The Hopsack",   // name of stockist
            "desc", //
            "S12"
        )
        stockistsList.add(hopsackRathmines)

        // Fresh, IFSC Dublin
        val freshIfsc = Item(
            R.drawable.stockist_fresh_ifsc,
            "Mayor Street Lower, Dublin",  // address
            "Fresh, IFSC Dublin",   // name of stockist
            "desc", //
            "S13"
        )
        stockistsList.add(freshIfsc)

        // Fresh, Carrick On Shannon
        val stockistFreshCarrick = Item(
            R.drawable.stockist_fresh_carrick,
            "7 Landmark Court, Carrick On Shannon",  // address
            "Fresh, Carrick",   // name of stockist
            "desc", //
            "S3"
        )
        stockistsList.add(stockistFreshCarrick)

        // Georges Fish Store, Stepaside
        val georgeFishStore = Item(
            R.drawable.stockist_georges_fish_store,
            "18 Enniskerry Road, Stepaside",  // address
            "George's Fish Store",   // name of stockist
            "desc", //
            "S15"
        )
        stockistsList.add(georgeFishStore)

        // Donnybrook Fair, Stillorgan
        val donnybrookFairStillorgan = Item(
            R.drawable.stockist_donnybrook_fair_stillorgan,
            "47 - 49 Lower Kilmacud Road, Stillorgan Shopping Centre",  // address
            "Donnybrook Fair, Stillorgan",   // name of stockist
            "desc", //
            "S16"
        )
        stockistsList.add(donnybrookFairStillorgan)

        // Select Store, Dalkey
        val selectDalkey = Item(
            R.drawable.stockist_select_dalkey,
            "1 Railway Rd, Dalkey",  // address
            "Select Store, Dalkey",   // name of stockist
            "desc", //
            "S17"
        )
        stockistsList.add(selectDalkey)

        // Nash 19 Restaurant, Cork
        val nashCork = Item(
            R.drawable.stockist_nash_cork,
            "19 Princes St, Cork City",  // address
            "Nash 19 Restaurant",   // name of stockist
            "desc", //
            "S18"
        )
        stockistsList.add(nashCork)

        // Manna Organic Store, Island of Geese, Kerry
        val mannaOrganic = Item(
            R.drawable.stockist_manna_organic,
            "Island of Geese, Kerry",  // address
            "Manna Organic Store",   // name of stockist
            "desc", //
            "S19"
        )
        stockistsList.add(mannaOrganic)

        // Simple Simons, Donegal
        val simpleSimons = Item(
            R.drawable.stockist_simple_simons,
            "Donegal",  // address
            "Simple Simons",   // name of stockist
            "desc", //
            "S20"
        )
        stockistsList.add(simpleSimons)

        // Between The Bridges, Enniskillen
        val betweenTheBridges = Item(
            R.drawable.stockist_between_the_bridges,
            "Enniskillen",  // address
            "Between The Bridges",   // name of stockist
            "desc", //
            "S21"
        )
        stockistsList.add(betweenTheBridges)

        // Fresh, Smithfield, Dublin
        val freshSmithfield = Item(
            R.drawable.stockist_fresh_smithfields,
            "Smithfield, Dublin",  // address
            "Fresh, Smithfield",   // name of stockist
            "desc", //
            "S22"
        )
        stockistsList.add(freshSmithfield)

        // McCambridges, Galway
        val stockistMcCambridges = Item(
            R.drawable.stockist_mc_cambridges_galway,
            "38/39 Shop Street, Galway",  // address
            "McCambridges, Galway",   // name of stockist
            "desc", //
            "S2"
        )
        stockistsList.add(stockistMcCambridges)


    }
}

