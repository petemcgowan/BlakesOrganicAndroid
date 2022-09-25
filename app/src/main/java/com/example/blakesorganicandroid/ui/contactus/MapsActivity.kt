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

        // Move the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(navenny))
        mMap.moveCamera(CameraUpdateFactory.zoomTo(5f))
    }
}