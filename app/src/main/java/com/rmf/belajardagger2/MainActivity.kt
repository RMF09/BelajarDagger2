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
 * In part 11 Custom Scope and Custom Depedencies
 */

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1: Car
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent =
                (application as ExampleApp).getAppComponent()

        carComponent.inject(this)
    }
}