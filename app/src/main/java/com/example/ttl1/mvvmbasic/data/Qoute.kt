package com.example.ttl1.mvvmbasic.data

data class Qoute(val qouteText: String,
                 val author: String){

    override fun toString(): String {
        return "$qouteText - $author"
    }

}
