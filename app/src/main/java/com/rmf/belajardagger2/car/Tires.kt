package com.rmf.belajardagger2.car

import android.util.Log

//we don't own this class so we can't annotate it with @Inject
class Tires {
    companion object{
        private const val TAG = "Tires"
    }
    fun inflate(){
        Log.d(TAG, "inflated")
    }
}