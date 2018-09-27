package com.example.ttl1.mvvmbasic.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.ttl1.mvvmbasic.data.Qoute
import com.example.ttl1.mvvmbasic.data.QuoteRepository

class QuotesViewModel (private val quoteRepository: QuoteRepository): ViewModel(){

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(qoute: Qoute) = quoteRepository.addQuote(qoute)
}