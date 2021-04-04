package com.rmf.belajardagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rmf.belajardagger2.car.Car
import com.rmf.belajardagger2.dagger.ActivityComponent
import com.rmf.belajardagger2.dagger.DaggerActivityComponent
import com.rmf.belajardagger2.dagger.DaggerAppComponent
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

        val activityComponent: ActivityComponent =
            DaggerActivityComponent
                .builder()
                .horsePower(120)
                .engineCapacity(1000)
                .appComponent((application as ExampleApp).getAppComponent())
                .build()

        activityComponent.inject(this)

        car1.drive()
        car2.drive()
    }
}