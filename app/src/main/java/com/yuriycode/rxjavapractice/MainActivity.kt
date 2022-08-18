package com.yuriycode.rxjavapractice

import android.content.ContentValues.TAG
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val observable = Observable.just(1, 2, 3, 4, 5)

        val dispose =  observable.subscribe {
            Timber.d(TAG, "new data $it")
        }

        val single = Single.just(1)

        val flowable = Flowable.just(1, 2, 3)

    }

}