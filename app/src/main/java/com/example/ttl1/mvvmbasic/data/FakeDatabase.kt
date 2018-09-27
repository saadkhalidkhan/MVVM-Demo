package com.example.ttl1.mvvmbasic.data

class FakeDatabase private constructor(){

    var qouteDao = FakeQouteDao()
    private set

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() =
                instance ?: synchronized(this){
                    instance ?: FakeDatabase().also { instance = it }
                }
    }

}