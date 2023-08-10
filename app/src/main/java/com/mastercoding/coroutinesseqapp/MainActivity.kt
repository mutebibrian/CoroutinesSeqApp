package com.mastercoding.coroutinesseqapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("TAGY", "The App started")
        //Lunch because these suspended functions cannot be called -
        //Directly Without a coroutine, we can't call.
        //Do something here.
        CoroutineScope(Dispatchers.IO).launch {
            val one = doSomethinhUseful1()
            val two = doSomethinhUseful2()

            val result = one + two
            Log.v("TAGY","The result is: $result")

        }



    }

    suspend fun doSomethinhUseful1(): Int {
        delay(5000)
        return 11
        Log.v("TAGY","Fun1 is done")



    }
    //Suspend function number two, I will create suspend function.
    //Number two, I'm delaying it for 7 seconds we are pretending we are doing something
    //with in those seconds

    suspend fun doSomethinhUseful2(): Int {
        delay(7000)
        return 8
        Log.v("TAGY","Fun2 is done")



    }
}