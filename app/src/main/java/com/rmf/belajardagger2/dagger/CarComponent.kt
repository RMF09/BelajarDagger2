package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.MainActivity
import com.rmf.belajardagger2.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

//The Injector
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int) : Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int) : Builder

        fun build() : CarComponent
    }
}