package com.kyle

import java.util.*

fun main(args:Array<String>) {
    val scr =Random().nextInt(10)+1
    println(scr)
    var sca =Scanner(System.`in`)
    for (i in 1..4) {
        println("plz enter the number (${i}/4): ")
        var num = sca.nextInt()
        if (num > scr) {
            println("lower")
        } else if (num < scr) {
            println("higher")
        } else{
        println("That;s right the number is $scr")
        break
        }
    }

}