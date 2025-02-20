package com.ashdeep.multithreading;

public class MyThread extends Thread {

    private String threadName;

    MyThread(String name){
        threadName = name;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(threadName + " - Count "+ i);

            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}
