package org.example.telusko.javabasics.unit12;

public class ARunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("HI from A class");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
