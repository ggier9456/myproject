package com.kyle

import java.util.*


fun main(args:Array<String>) {
    val random= Random().nextInt(10)+1
    var secret =random
    println(secret)
    var number :Int =0
    while (number!=secret){
        println("plz enter the number:\t")
        number= readLine()!!.toInt()
        if(number>secret){
            println("lower")
        }
        else if(number<secret){
            println("higher")
        }
        else{
            println("That's right the number is\t$secret")
        }
    }

}