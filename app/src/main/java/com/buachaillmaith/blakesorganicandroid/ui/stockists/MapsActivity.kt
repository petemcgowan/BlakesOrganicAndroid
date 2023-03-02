package com.buachaillmaith.blakesorganicandroid.ui.stockists

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.buachaillmaith.blakesorganicandroid.R
import com.buachaillmaith.blakesorganicandroid.databinding.ActivityMapsBinding
import com.buachaillmaith.blakesorganicandroid.ui.ITEM_ID_EXTRA
import com.buachaillmaith.blakesorganicandroid.ui.Item
import com.buachaillmaith.blakesorganicandroid.ui.stockistsList
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private lateinit var localStockist: Item;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Pete's item retrieval Code
        val stockistID = intent.getStringExtra(ITEM_ID_EXTRA)

        Log.d("Stockists", stockistID.toString())
        val stockist = stockistID?.let { stockistFromID(it) }
        Log.d("Stockists", stockist.toString())
        if (stockist != null) {
            localStockist = stockist
        };
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    private fun stockistFromID(productID: String): Item?
    {
        for(stockist in stockistsList)
        {
            if(stockist.id == productID)
                return stockist
        }
        return null
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap


        // Add stockist location markers...

        // Rua Cafe and Delicatessen
        val ruaCafe = LatLng(53.854600123239756, -9.296694191984217)
        mMap.addMarker(MarkerOptions().position(ruaCafe).title("Rua Cafe and Delicatessen"))

        // McCambridges, Galway
        val mcCambridgesGalway = LatLng(53.2732505412702, -9.05247730628975)
        mMap.addMarker(MarkerOptions().position(mcCambridgesGalway).title("McCambridges, Galway"))

        // Fresh, Carrick On Shannon
        val freshCarrick = LatLng(53.96451231067534, -8.103642109125982)
        mMap.addMarker(MarkerOptions().position(freshCarrick).title("Fresh, Carrick On Shannon"))

        // Shannon Fruit, Tullyvarraga
        val shannonTullyvarraga = LatLng(52.762242561973466, -8.890905442532103)
        mMap.addMarker(MarkerOptions().position(shannonTullyvarraga).title("Shannon Fruit, Tullyvarraga"))

        // Cosgrove & Son, Abbeyquarter North
        val cosgroveAbbeyquarter = LatLng(54.3115881661309, -8.48392233856201)
        mMap.addMarker(MarkerOptions().position(cosgroveAbbeyquarter).title("Cosgrove & Son, Abbeyquarter North"))

        // Osta, Sligo
        val ostaSligo = LatLng(54.308048664833024, -8.475682584134434)
        mMap.addMarker(MarkerOptions().position(ostaSligo).title("Osta, Sligo"))

        // Nature Health, Navan
        val natureNavan = LatLng(53.740982819774814, -6.684484786058696)
        mMap.addMarker(MarkerOptions().position(natureNavan).title("Nature Health, Navan"))

        // Natures Gold, Dunboyne
        val natureDunboyne = LatLng( 53.51819675385799, -6.50351556413804)
        mMap.addMarker(MarkerOptions().position(natureDunboyne).title("Nature's Gold, Dunboyne"))

        // Nature’s Gold, Rathcoole
        val natureRathcoole = LatLng(53.35865936381066, -6.470818426724693)
        mMap.addMarker(MarkerOptions().position(natureRathcoole).title("Nature’s Gold, Rathcoole"))

        // Fresh, Rathfarnham
        val freshRathfarnham = LatLng(53.37832487715894, -6.3209811838714245)
        mMap.addMarker(MarkerOptions().position(freshRathfarnham).title("Fresh, Rathfarnham"))

        // Boyne Valley Seafoods, Drogheda
        val boyneDrogheda = LatLng(53.750632310076284, -6.316059084892225)
        mMap.addMarker(MarkerOptions().position(boyneDrogheda).title("Boyne Valley Seafoods, Drogheda"))

        // The Hopsack, Rathmines
        val hopsackRathmines = LatLng(53.41108056215478, -6.299161419926029)
        mMap.addMarker(MarkerOptions().position(hopsackRathmines).title("The Hopsack, Rathmines"))

        // Fresh, IFSC Dublin
        val freshIfsc = LatLng(53.44836580465253, -6.288247353275163)
        mMap.addMarker(MarkerOptions().position(freshIfsc).title("Fresh, IFSC Dublin"))

        // Donnybrook Fair, Dublin 4
        val donnybrookFairDublin = LatLng(53.42417577807169, -6.259117650199059)
        mMap.addMarker(MarkerOptions().position(donnybrookFairDublin).title("Donnybrook Fair, Dublin 4"))

        // Georges Fish Store, Stepaside
        val georgeFishStore = LatLng(53.338984771408164, -6.243972400199067)
        mMap.addMarker(MarkerOptions().position(georgeFishStore).title("Georges Fish Store, Stepaside"))

        // Donnybrook Fair, Stillorgan
        val donnybrookStillorgan = LatLng(53.36521554361809, -6.213881644417493)
        mMap.addMarker(MarkerOptions().position(donnybrookStillorgan).title("Donnybrook Fair, Stillorgan"))

        // Select Store, Dalkey
        val selectDalkey = LatLng(53.355380895617344, -6.0752566573458004)
        mMap.addMarker(MarkerOptions().position(selectDalkey).title("Select Store, Dalkey"))

        // Nash 19 Restaurant, Cork
        val nashCork = LatLng(51.99171950558138, -8.45278680100184)
        mMap.addMarker(MarkerOptions().position(nashCork).title("Nash 19 Restaurant, Cork"))

        // Manna Organic Store, Island of Geese, Kerry
        val mannaOrganic = LatLng(52.269798115324036, -9.71046353172283)
        mMap.addMarker(MarkerOptions().position(mannaOrganic).title("Manna Organic Store, Island of Geese, Kerry"))

        // Simple Simons, Donegal
        val simpleSimons = LatLng(54.65393311182183, -8.107479944173482)
        mMap.addMarker(MarkerOptions().position(simpleSimons).title("Simple Simons, Donegal"))

        // Between The Bridges, Enniskillen
        val betweenTheBridges = LatLng(54.344555675048454, -7.638029229826629)
        mMap.addMarker(MarkerOptions().position(betweenTheBridges).title("Between The Bridges, Enniskillen"))

        // Fresh, Smithfield, Dublin
        val freshSmithfield = LatLng(53.34946379011656, -6.278325172177447)
        mMap.addMarker(MarkerOptions().position(freshSmithfield).title("Fresh, Smithfield, Dublin"))

        // Morton's, Ranelagh, Dublin
        val mortonsRanelagh = LatLng(53.32118879912855, -6.2561448351287225)
        mMap.addMarker(MarkerOptions().position(mortonsRanelagh).title("Morton's, Ranelagh, Dublin"))

        val zoomLevel = 14.0f //This goes up to 21
        Log.d ("localStockist:", localStockist.toString())
        mMap.uiSettings.isZoomControlsEnabled = true
        // Move the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(localStockist.latLng, zoomLevel))
//        mMap.moveCamera(CameraUpdateFactory.zoomTo(5f))
    }
}