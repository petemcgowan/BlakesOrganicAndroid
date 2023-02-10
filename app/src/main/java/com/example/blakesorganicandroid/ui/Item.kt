package com.example.blakesorganicandroid.ui

import com.google.android.gms.maps.model.LatLng

var productList = mutableListOf<Item>()
var benefitsList = mutableListOf<Item>()
var historyList = mutableListOf<Item>()
var faqList = mutableListOf<Item>()
var stockistsList = mutableListOf<Item>()

val ITEM_ID_EXTRA = "itemExtra"

class Item(
    var cover: Int,
    var longDescription: String,
    var title: String,
    var description: String,
    val id: String,
    val latLng: LatLng
)