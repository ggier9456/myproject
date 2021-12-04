package com.kyle.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int scr = new Random().nextInt(10)+1; //bound的數字代表0~9，()外+1 代表0~9變成1~10
        Scanner sca =new Scanner(System.in);
        System.out.println(scr);
        for(int i=1;i<=4;i++){
            System.out.println("plz enter the number("+i+"/4):");
            int num =sca.nextInt();
            if(num>scr){
                System.out.println("lower");
            }else if(num<scr){
                System.out.println("higher");
            }else{
                System.out.println("that's right! the number is "+scr);
            break;
            }
        }

    }
}
