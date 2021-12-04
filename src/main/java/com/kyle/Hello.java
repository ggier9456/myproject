package com.kyle;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("hello world");
        Person p = new Person("curry",66.5f, 1.64f);
        p.hello();
       p.weight=66.5f;
       p.height=1.64f;
        System.out.println(p.bmi());
    }
}
