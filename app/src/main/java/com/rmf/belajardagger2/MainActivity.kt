package com.rmf.belajardagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rmf.belajardagger2.car.Car
import com.rmf.belajardagger2.dagger.CarComponent
import com.rmf.belajardagger2.dagger.DaggerCarComponent
import com.rmf.belajardagger2.dagger.DieselEngineModule
import javax.inject.Inject

//Part8 Component Builder, BindInstance
/**
 * In part 8 of the Dagger 2 tutorial, we will learn how to use @BindsInstance to bind
 * variables to our dependency graph at runtime as an alternative to providing them from
 * a stateful module. For this, we have to declare our own @Component.Builder.
To distinguish between multiple bindings from the same type, we will use the @Named qualifier.
 */

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent =
                DaggerCarComponent.builder()
                        .horsePower(150)
                        .engineCapacity(1000)
                        .build()

        carComponent.inject(this)
    }
}