package com.rmf.belajardagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rmf.belajardagger2.car.Car
import com.rmf.belajardagger2.dagger.CarComponent
import javax.inject.Inject

//Part6 PROVIDING INTERFACES WITH @BINDS
/**
 * we will learn how and why we should use @Binds instead of @Provides
 * to provide implementations for interfaces from our modules.
 * Binds methods are more concise because they are declared as abstract methods without a body,
 * and they are more efficient because Dagger doesn’t have to invoke them or even instantiate
 * their containing module.
 */

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.create()
        carComponent.inject(this)
    }
}