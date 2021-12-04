package com.kyle.classroom;

import java.util.Scanner;

public class Classroomrunner {
    public static void main(String[] args) {

        Student.pass=50;
//        Student stu = getStudent();
       Student stu2 =new Student("curry",50,50);
       GraduateStudent gdst =new GraduateStudent("wall",50,60,70);
        gdst.print();
       stu2.print();
       System.out.println("hignest score:"+stu2.hignest());
    }

    private static Student getStudent() {
        System.out.print("please enter student's name:");
        Scanner sca = new Scanner(System.in);
        String name = sca.next();
        System.out.print("please enter student's math score:");
        int math = sca.nextInt();
        System.out.print("please enter student's english score:");
        int english =sca.nextInt();
        Student stu = new Student(name,math,english);
        return stu;
    }
}
