package com.kyle;

import com.kyle.classroom.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void averageTest(){
        Student student= new Student("curry",80,70);
        Assertions.assertEquals((80+70)/2,student.getAverage());
    }

    @Test
    public void highestTest(){
        Student student= new Student("curry",80,70);
        Assertions.assertEquals(80,student.hignest());
    }
}
