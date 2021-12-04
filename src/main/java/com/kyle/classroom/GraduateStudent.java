package com.kyle.classroom;

public class GraduateStudent extends Student {
    int thesis;
    static int pass =70;
    public GraduateStudent(String name , int math,int english,int thesis) {
        super(name,math,english);
        this.thesis=thesis;
    }

    @Override
    public void print() {
        int average = getAverage();
        char gredint = 'F';
        System.out.print(name + '\t' + math + "\t" + english +"\t" + thesis+"\t" + getAverage()+"\t"+(getAverage()>=pass?"PASS":"FAILED"));
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

    @Override
    public int getAverage() {
        return (math+english+thesis)/3;
    }
}
