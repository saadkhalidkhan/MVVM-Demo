package com.example.ttl1.mvvmbasic.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQouteDao {
    private val qouteList = mutableListOf<Qoute>()
    private val qoutes = MutableLiveData<List<Qoute>>()

    init {
        qoutes.value = qouteList
    }

    fun addQoutes(qoute: Qoute){
        qouteList.add(qoute)
        qoutes.value = qouteList
    }

    fun getQoutes() = qoutes as LiveData<List<Qoute>>
}