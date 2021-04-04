package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory{
        fun create(driverModule: DriverModule): AppComponent
    }
}