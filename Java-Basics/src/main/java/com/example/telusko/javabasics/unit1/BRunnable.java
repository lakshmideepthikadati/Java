package com.example.telusko.javabasics.unit1;

public class BRunnable implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello from B class");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
