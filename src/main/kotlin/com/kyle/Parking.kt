package com.kyle

import java.time.Duration
import java.time.LocalDateTime

fun main(args:Array<String>) {
val enter=LocalDateTime.of(2021,7,15,17,54,10)
    val leave =LocalDateTime.of(2021,7,15,19,56,12)
    var car=Car("AA-0001",enter)
    car.leave=leave
    var hour =Math.ceil(car.getduration()/60.0).toLong()
    println(hour)
}

class Car(val id :String,var enter:LocalDateTime){
    var leave :LocalDateTime? =null
    set(value) {
        if(enter.isBefore(value)){
            field =value
        }
    }


    fun getduration() =Duration.between(enter,leave).toMinutes()


}

