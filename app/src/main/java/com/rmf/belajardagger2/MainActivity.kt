package com.rmf.belajardagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rmf.belajardagger2.car.Car
import com.rmf.belajardagger2.dagger.ActivityComponent
import com.rmf.belajardagger2.dagger.DieselEngineModule
import javax.inject.Inject
/**
 * In part 14 component Factory
 */

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1: Car
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent: ActivityComponent =
            (application as ExampleApp)
                .getAppComponent()
                .getActivityComponentFactory()
                .create(160,1700)


        activityComponent.inject(this)

        car1.drive()
        car2.drive()
    }
}