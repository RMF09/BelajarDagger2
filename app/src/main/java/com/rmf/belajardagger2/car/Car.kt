package com.rmf.belajardagger2.car

import android.util.Log
import com.rmf.belajardagger2.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(private var driver: Driver,private var engine: Engine, private var wheels: Wheels) {

    companion object{
        const val TAG ="Car"
    }

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive(){
        engine.start()
        Log.d(TAG, "$driver drives $this")
    }




}