package com.example.blakesorganicandroid.ui.contactus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.blakesorganicandroid.R
import com.example.blakesorganicandroid.databinding.ActivityMapsBinding

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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

        // Add stockist location marker
        val navenny = LatLng(54.800091165954456, -7.782440186615055)
        mMap.addMarker(MarkerOptions().position(navenny).title("Navenny Shopping Centre"))

        val shopStGalway = LatLng(53.324722735026704, -9.068437264395666)
        mMap.addMarker(MarkerOptions().position(shopStGalway).title("Shop St Galway"))

//        Rua Cafe and Delicatessen
//        53.854600123239756, -9.296694191984217
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))





        // McCambridges, Galway
        53.2732505412702, -9.05247730628975
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Fresh, Carrick On Shannon
        53.96451231067534, -8.103642109125982
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Shannon Fruit, Tullyvarraga
        52.762242561973466, -8.890905442532103
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Cosgrove & Son, Abbeyquarter North
        54.3115881661309, -8.48392233856201
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Osta, Sligo
        54.308048664833024, -8.475682584134434
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Nature Health, Navan
        53.740982819774814, -6.684484786058696
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Natures Gold, Dunboyne
        53.51819675385799, -6.50351556413804
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Nature’s Gold, Rathcoole
        53.35865936381066, -6.470818426724693
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Fresh, Rathfarnham
        53.37832487715894, -6.3209811838714245
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Boyne Valley Seafoods, Drogheda
        53.750632310076284, -6.316059084892225
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // The Hopsack, Rathmines
        53.41108056215478, -6.299161419926029
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Fresh, IFSC Dublin
        53.44836580465253, -6.288247353275163
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Donnybrook Fair, Dublin 4
        53.42417577807169, -6.259117650199059
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Georges Fish Store, Stepaside
        53.338984771408164, -6.243972400199067
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Donnybrook Fair, Stillorgan
        53.36521554361809, -6.213881644417493
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Select Store, Dalkey
        53.355380895617344, -6.0752566573458004
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Nash 19 Restaurant, Cork
        51.99171950558138, -8.45278680100184
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Manna Organic Store, Island of Geese, Kerry
        52.269798115324036, -9.71046353172283
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Simple Simons, Donegal
        54.65393311182183, -8.107479944173482
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Between The Bridges, Enniskillen
        54.344555675048454, -7.638029229826629
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Fresh, Smithfield, Dublin
        53.34946379011656, -6.278325172177447
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))

        // Morton's, Ranelagh, Dublin
        53.32118879912855, -6.2561448351287225
        val nameOfLocation = LatLng(0.0, 0.0)
        mMap.addMarker(MarkerOptions().position(nameOfLocation).title("TITLE"))


        // Move the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(navenny))
        mMap.moveCamera(CameraUpdateFactory.zoomTo(5f))
    }
}