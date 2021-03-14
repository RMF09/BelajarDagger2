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
 * In part 10 of the Dagger 2, we will learn how to use the @Singleton scope annotation
 * to tell dagger to only create a single instance of an object and reuse it within the
 * same component. Internally, Dagger wraps the objects Factory into a DoubleCheck Provider,
 * which caches the instance and uses double checked locking to return it in a thread safe and
 * efficient way.
 */

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1: Car
    @Inject lateinit var car2: Car

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