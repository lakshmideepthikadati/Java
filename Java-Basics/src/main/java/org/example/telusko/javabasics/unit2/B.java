package org.example.telusko.javabasics.unit2;

public class B extends  Thread{
    public  void run(){
        for (int i=0;i<100;i++){
            System.out.println("Hello from B class");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
