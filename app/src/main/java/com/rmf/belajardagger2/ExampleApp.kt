package com.rmf.belajardagger2

import android.app.Application
import com.rmf.belajardagger2.dagger.CarComponent
import com.rmf.belajardagger2.dagger.DaggerCarComponent

class ExampleApp: Application() {
    private lateinit var component: CarComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerCarComponent.builder()
                .engineCapacity(1000)
                .horsePower(500)
                .build()
    }

    fun getAppComponent(): CarComponent{
        return component
    }
}