package com.rmf.belajardagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rmf.belajardagger2.car.Car
import com.rmf.belajardagger2.dagger.CarComponent
import com.rmf.belajardagger2.dagger.DaggerCarComponent
import com.rmf.belajardagger2.dagger.DieselEngineModule
import javax.inject.Inject

//Part7 INJECT VARIABLES INTO OUR DEPEDENCY AT RUNTIME
/**
 * we will learn how to use stateful modules to inject variables
 * into our dependency graph at run-time. For this, we have to add a constructor
 * to our module and manually set it on the Component Builder with the required parameters.
 * DieselEngine Implementation
 */

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent =
                DaggerCarComponent.builder()
                        .dieselEngineModule(DieselEngineModule(100))
                        .build()

        carComponent.inject(this)
    }
}