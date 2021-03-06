package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.car.DieselEngine
import com.rmf.belajardagger2.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindEngine(engine: DieselEngine) : Engine
}