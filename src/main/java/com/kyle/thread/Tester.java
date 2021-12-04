package com.kyle.thread;

public class Tester {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("i="+i);
        }

        Thread thread=new Thread(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                System.out.println("thread:"+i);
                try{
                    sleep(50);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
     };
        thread.start();
//        Runnable
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("runnable thread:"+i);
                    try{
                        Thread.sleep(50);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
            }
        };
        Thread t=new Thread(runnable);
        t.start();
//        Mythread
        Mythread mt=new Mythread();
        mt.start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("runnable lambda thread:" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}).start();

        System.out.println("main end.");
    }
}

class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("mythread:"+i);
            try {
                sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}