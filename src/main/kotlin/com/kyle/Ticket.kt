package com.kyle

import java.util.*


data class Ticket(var destination:Int,var price:Int,var man:Int)

fun main(args:Array<String>) {
    val i:String ="asdfgd"
    println(i.validate())
    println((1..10).random())
}
fun String.validate():Boolean{
   return this.length>=5
}
fun IntRange.random():Int{           //IntRange 是 (1..10) 這樣一個整數區間
    val r = Random().nextInt(endInclusive-start)+start  //endInclusive是代表區間的最後一個 , start代表第一個
    return r
}