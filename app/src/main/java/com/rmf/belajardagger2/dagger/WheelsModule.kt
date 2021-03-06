package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.car.Rims
import com.rmf.belajardagger2.car.Tires
import com.rmf.belajardagger2.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    companion object{
        @Provides fun provideRims(): Rims { return Rims() }

        @Provides fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return Tires()
        }

        @Provides fun provideWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }
    }
}