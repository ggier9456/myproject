package com.kyle.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arraytest();
//        list();
//        set();
        HashMap<String,String> stocks=new HashMap<>();
        stocks.put("0050","元大台灣");
        stocks.put("0056","元大高股息");
        System.out.println(stocks);
//        System.out.println(stocks.get("0050"));
        for (String key :stocks.keySet()){
            System.out.println(stocks.get(key));
        }
    }

    private static void set() {
        HashSet<Integer> set =new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(5);
        System.out.println(set);
        for(int n : set){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(50);
        System.out.println(list);
        List<Integer> score = Arrays.asList(20,53,45,55,78,87);
        for(int s:score){
            System.out.println(s);
        }
    }

    private static void arraytest() {
        int[] number =new int[6];
        number[0]=5;
        number[3]=4;
        for(int i=0;i<6;i++){
            System.out.println(number[i]);
        }
        int[] numbers={20,53,45,55,78,87};
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
        for(int n:numbers){
            System.out.println(n);
        }
    }
}
