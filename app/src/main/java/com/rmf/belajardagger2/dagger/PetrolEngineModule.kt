package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.car.Engine
import com.rmf.belajardagger2.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindEngine(engine: PetrolEngine) : Engine
}