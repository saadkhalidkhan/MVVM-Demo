package com.example.ttl1.mvvmbasic.data


class QuoteRepository private constructor(private val qouteDao: FakeQouteDao){

    fun addQuote(quote :Qoute){
        qouteDao.addQoutes(quote)
    }

    fun getQuotes() = qouteDao.getQoutes()

    companion object {
        @Volatile private var instance: QuoteRepository? = null

        fun getInstance(qouteDao: FakeQouteDao) =
                instance ?: synchronized(this){
                    instance ?: QuoteRepository(qouteDao).also { instance = it }
                }
    }
}