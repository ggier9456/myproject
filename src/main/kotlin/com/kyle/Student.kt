package com.kyle

import sun.nio.cs.ext.IBM037
import java.util.*

fun main (args:Array<String>){
    Student.pass=50
    Student.test()
//    printer()
    val stu=Student("curry",60,50)
    val stu2 =GtaduteStudent("wall",50,80,60)
    stu2.print()
    stu.print()
    println("highest score: ${stu.highest()}")
}
class GtaduteStudent(name: String?,math: Int, english: Int,var thesis:Int) :Student(name,math,english){
    companion object{
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${gradint()}")
    }

    override fun passOrFailed()=if(getAverage()>= pass) "PASS" else "FAILED"


    override fun getAverage() = (math+english+thesis)/3

}
open class Student(var name:String?,var math:Int,var english:Int){
    companion object{
        @JvmStatic
        var pass =60
        fun test(){
            println("testing")
        }

    }
    open fun print(){
       println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${gradint()}")
    }
    fun highest()= if(english>math){english}
    else {
        math
    }
    open fun passOrFailed() = if(getAverage()>= pass) "PASS" else "FAILED"

    fun gradint()=when(getAverage()){
        in 90..100->'A'
        in 80..89->'B'
        in 70..79->'C'
        in 60..69->'D'
        else ->'F'
    }
        open fun getAverage()=(math+english)/2
}



        private fun printer() {
    var sca = Scanner(System.`in`)
//    print("plz enter your name:")
    var name = null
    print("plz enter your math score:")
    var math = sca.nextInt()
    print("plz enter your english score:")
    var english = sca.nextInt()
    val stu = Student(name, math, english)
    stu.print()
}


