package com.kyle

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args:Array<String>) {
  /* thread {
        for (i in 1..122) {
            println("thread : ${i}")
            Thread.sleep(50)
        }
    }*/

        for(n in 1..1000) {
        GlobalScope.launch {
                println("coroutines:${n}")
                 delay(50L)//因為是long值所以要加 L
            }
        }

    }
