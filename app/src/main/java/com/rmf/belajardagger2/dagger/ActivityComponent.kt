package com.rmf.belajardagger2.dagger

import com.rmf.belajardagger2.MainActivity
import com.rmf.belajardagger2.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

//The Injector
@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder
        fun build(): ActivityComponent
    }
}