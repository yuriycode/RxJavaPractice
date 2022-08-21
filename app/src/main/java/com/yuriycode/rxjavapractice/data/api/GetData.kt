package com.yuriycode.rxjavapractice.data.api

import com.yuriycode.rxjavapractice.model.RetroCrypto
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET


interface GetData {

    @GET("prices?key=d09d9daa94308f0057a457f917bf8be83a6d80e8")
    fun getData():Observable<List<RetroCrypto>>

}