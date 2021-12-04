package com.kyle.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        int number=0;

        while (number!=secret){
            System.out.print("plz enter the number: ");
            number = sca.nextInt();
            if(number>secret){
                System.out.println("lower");
            }
            else if(number<secret){
                System.out.println("higher");
            }
            else{
                System.out.println("that's right the number is\t"+secret);
            }
        }
    }
}
