
package com.company;

public class Main {

    public static void main(String[] args) {

                /*Threads - extends Thread Class or implement Runnable Interface

                start(); -> run(); -> stops when completed
                sleep(); will pause the thread
                -wait(); will pause until notified to wake up
                -notify(); will inform threads that are waiting
                -notifyall(); wakes all threads up
                -join(); waits on other thread
                -synchronize methods acts like a gate keeper (one thread at a time)
         */

        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable runnable = new MyRunnable();
        MyRunnable runnable = new Thread(runnable);
        Thread.start();

        try {
            Thread.wait(6000);
        }catch(Exception e){
            System.out.println("Exception happened");

        }




    }
}
