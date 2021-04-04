package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    companion object{
        @Provides
        @Singleton
        fun provideDriver(): Driver {
            return Driver()
        }
    }
}