package com.ashdeep.ThreadState;

public class ABC implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(100);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadState.t1.getState());

        try{
            Thread.sleep(200);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }


}
