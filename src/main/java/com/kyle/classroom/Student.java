package com.kyle.classroom;

public class Student {
    String id;
    String name;
    int math;
    int english;
    static int pass=60;

    public Student(String name,int math, int english){
        this.name=name;
        this.math=math;
        this.english=english;
    }
    public int hignest(){
        int max=(english>math) ? english: math;

        return max;
    }
    public void print() {
        int average = getAverage();
        char gredint = 'F';
        System.out.print(name + '\t' + math + "\t" + english + "\t" + getAverage()+"\t"+(getAverage()>=pass?"PASS":"FAILED"));
        switch (average / 10) {
            case (10):
                gredint = 'A';
                break;
            case (9):
                gredint = 'B';
                break;
            case(8):
                gredint='C';
                break;
            case (7):
                gredint='D';
                break;
            case(6):
                gredint='E';
                break;
            default:
                gredint='F';
                break;
        }
        System.out.println("\t"+gredint);
    }
    public int getAverage(){
        return (math+english)/2;
    }

}
