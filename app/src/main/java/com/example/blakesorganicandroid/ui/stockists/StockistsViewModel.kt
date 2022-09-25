package com.example.blakesorganicandroid.ui.stockists

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StockistsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Stockists Fragment"
    }
    val text: LiveData<String> = _text
}