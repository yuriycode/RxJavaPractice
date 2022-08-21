package com.yuriycode.rxjavapractice.data

import retrofit2.http.GET
import java.util.*

interface GetData {

    @GET("prices?key=d09d9daa94308f0057a457f917bf8be83a6d80e8")
    fun getData():Observable<List<RetroCrypto>>

}