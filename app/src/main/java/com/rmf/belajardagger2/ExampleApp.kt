package com.rmf.belajardagger2

import android.app.Application
import com.rmf.belajardagger2.dagger.AppComponent
import com.rmf.belajardagger2.dagger.DaggerAppComponent

class ExampleApp: Application() {
    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent{
        return component
    }
}