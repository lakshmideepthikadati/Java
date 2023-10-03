package org.example.telusko.javabasics.unit2;

public class RunnableEx {
    public static void main(String[] args) {
        ARunnable obj1=new ARunnable();
        BRunnable obj2= new BRunnable();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

    }
}
