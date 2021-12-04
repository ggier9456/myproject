package com.kyle

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args:Array<String>) {
    var counters = 1
  /*  var msi = measureTimeMillis {
        for (i in 1..100) {
            thread {
                counters++
                println(counters)
            }
        }
    }
    println(msi)*/
    var ms = measureTimeMillis {
        for (i in 1..10000){
            GlobalScope.launch {
                counters++
                println("1")

            }
        }
    }
    println("second: $ms")
}

