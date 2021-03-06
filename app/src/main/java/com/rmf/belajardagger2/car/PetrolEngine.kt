package com.rmf.belajardagger2.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d(Car.TAG, "start: Petrol Engine")
    }
}