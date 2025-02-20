package com.ashdeep.CreateThread;

public class CreateThread3 {

    public static void main(String argvs[]){
        // creating an object of the Thread class using the constructor Thread(String name)
        Thread t= new Thread("My first thread");
        // getting the thread name by invoking the getName() method
        String str = t.getName();
        System.out.println(str);
        System.out.println(t.getState());
        // the start() method moves the thread to the active state
        t.start();
        System.out.println(t.getState());

    }
}
