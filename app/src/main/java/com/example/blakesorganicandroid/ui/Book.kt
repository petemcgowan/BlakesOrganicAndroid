package com.example.blakesorganicandroid.ui

var bookList = mutableListOf<Book>()
var contactUsList = mutableListOf<Book>()
var historyList = mutableListOf<Book>()
var faqList = mutableListOf<Book>()

val BOOK_ID_EXTRA = "bookExtra"

class Book(
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    val id: Int? = bookList.size
)