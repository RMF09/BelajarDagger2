package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.car.DieselEngine
import com.rmf.belajardagger2.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private var horsePower: Int) {
    @Provides
    fun provideEngine() : Engine{
        return DieselEngine(horsePower)
    }
}