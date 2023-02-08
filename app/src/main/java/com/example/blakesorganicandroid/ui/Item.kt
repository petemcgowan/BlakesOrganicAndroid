package com.example.blakesorganicandroid.ui

var productList = mutableListOf<Item>()
var benefitsList = mutableListOf<Item>()
var stockistsList = mutableListOf<Item>()
var historyList = mutableListOf<Item>()
var faqList = mutableListOf<Item>()

val ITEM_ID_EXTRA = "bookExtra"

class Item(
    var cover: Int,
    var longDescription: String,
    var title: String,
    var description: String,
    val id: String
)