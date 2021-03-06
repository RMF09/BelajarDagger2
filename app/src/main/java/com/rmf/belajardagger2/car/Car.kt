package com.rmf.belajardagger2.car

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {

    companion object{
        const val TAG ="Car"
    }

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    @Inject
    fun drive(){
        engine.start()
        Log.d(TAG, "drive...")
    }




}