package com.rmf.belajardagger2

import dagger.Component

//The Injector
@Component
interface CarComponent {

    fun getCar(): Car
}