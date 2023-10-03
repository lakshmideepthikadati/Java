package org.example.telusko.javabasics.unit12;

public class RunnableByLambda {

    public static void main(String[] args) {

        Runnable obj1= ()->{
            {
                for (int i=0;i<5;i++){
                    System.out.println("HI from Lambda");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable obj2= ()->{
            {
                for (int i=0;i<5;i++){
                    System.out.println("Hello from Lambda1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}
