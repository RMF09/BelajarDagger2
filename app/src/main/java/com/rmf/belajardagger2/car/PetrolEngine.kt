package com.rmf.belajardagger2.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine
@Inject constructor(@Named("horse power") private var horsePower: Int,
                    @Named("engine capacity") private var engineCapacity: Int) : Engine {

    override fun start() {
        Log.d(Car.TAG, "start: Petrol Engine" +
                "\nHorsePower: $horsePower" +
                "\nEngine Capacity: $engineCapacity")
    }
}