package com.kyle

import java.time.LocalDateTime

fun main(args:Array<String>) {
//    list()

    var enter =LocalDateTime.of(2021,7,16,0,0, 0)
   val parkingLot=HashMap<String,Car?>()
    var car:Car?=Car("AAA-0001",enter)
    parkingLot.put(car!!.id,car)
    car= Car("BBB-0002",enter.plusMinutes(15))
    parkingLot.put(car.id,car)
//    car 1 leaving
    var leave =LocalDateTime.of(2021,7,16,5,0,0)
    car=parkingLot.get("AAA-0001")
    car?.leave=leave
    println("${car?.id} Duration: ${car?.getduration()}")
    println("your parking price: ${car?.getduration()!!/60*50}") //    show car 1 parking price
    parkingLot.remove(car?.id)
    println(parkingLot.size)

//    car 2 leaving
    car=parkingLot.get("BBB-0002")
    car?.leave=leave.plusHours(2)
    println("${car?.id} Duration: ${car?.getduration()}" )
    println("your parking price: ${car?.getduration()!!/60*50}")//    show car 2 parking price
    parkingLot.remove(car?.id)
    println(parkingLot.size)
}

private fun list() {
    val scores = listOf(55, 65, 21, 54)
    for (score in scores) {
        println(score)
    }
    var mutablelist = mutableListOf(56, 54, 58, 51)
    mutablelist.add(12)
    println(mutablelist)
}