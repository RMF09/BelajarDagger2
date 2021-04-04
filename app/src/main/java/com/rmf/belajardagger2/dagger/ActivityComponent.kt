package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.MainActivity
import com.rmf.belajardagger2.car.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

//The Injector
@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    fun getCar(): Car
    fun inject(mainActivity: MainActivity)


    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horse power") horsePower: Int,
            @BindsInstance @Named("engine capacity") engineCapacity: Int
        ): ActivityComponent
    }
}