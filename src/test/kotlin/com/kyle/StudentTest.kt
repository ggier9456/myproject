package com.kyle.kotlin

import com.kyle.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestScoreTest(){
        val student = Student("curry",80,60)
        Assertions.assertEquals(80,student.highest())
    }
    @Test
    fun gradintTest(){
        val student = Student("curry",80,60)
        Assertions.assertEquals('C',student.gradint())
    }
    @Test
    fun passOrFail(){
        val student = Student("curry",80,60)
        Assertions.assertEquals("PASS",student.passOrFailed())
    }

}