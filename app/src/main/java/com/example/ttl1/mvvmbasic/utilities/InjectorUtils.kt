package com.example.ttl1.mvvmbasic.utilities

import com.example.ttl1.mvvmbasic.data.FakeDatabase
import com.example.ttl1.mvvmbasic.data.QuoteRepository
import com.example.ttl1.mvvmbasic.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().qouteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}