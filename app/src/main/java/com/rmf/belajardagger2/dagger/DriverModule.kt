package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule constructor(var driverName: String) {

    @Provides
    @Singleton
    fun provideDriver(): Driver = Driver(driverName)
}