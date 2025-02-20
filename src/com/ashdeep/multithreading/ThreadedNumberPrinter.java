package com.ashdeep.multithreading;

public class ThreadedNumberPrinter {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("All threads have finished.");

    }
}
