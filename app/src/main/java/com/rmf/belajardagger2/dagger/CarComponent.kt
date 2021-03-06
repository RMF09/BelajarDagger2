package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.MainActivity
import com.rmf.belajardagger2.car.Car
import dagger.Component

//The Injector
@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}