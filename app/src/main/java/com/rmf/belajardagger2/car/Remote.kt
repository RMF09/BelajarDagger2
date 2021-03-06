package com.rmf.belajardagger2.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){

    fun setListener(car: Car){
        Log.d(Car.TAG, "Remote Connected")
    }
}