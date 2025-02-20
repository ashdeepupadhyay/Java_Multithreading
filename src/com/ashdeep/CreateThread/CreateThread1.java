package com.ashdeep.CreateThread;

public class CreateThread1 extends Thread{

    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        CreateThread1 t1=new CreateThread1();
        t1.start();
    }
}
