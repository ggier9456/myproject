package com.kyle

import java.io.File
import java.util.function.Consumer
import java.util.stream.Stream

fun main(args:Array<String>) {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
    }



//    writeTest()





private fun writeTest() {
    //    File("output.txt").writeText("abcddf")
    File("output.txt").bufferedWriter().use {
        it.write("乎哈乎哈\n")
        it.write("啥米壓\n")
    }
}