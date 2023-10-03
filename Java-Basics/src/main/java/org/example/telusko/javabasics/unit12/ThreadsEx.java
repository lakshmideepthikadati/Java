package org.example.telusko.javabasics.unit12;

public class ThreadsEx {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2= new B();
        //obj.show();
       // obj1.show();

        obj1.setPriority(1);
        obj2.setPriority(10);
        System.out.println("priority-->"+ obj1.getPriority());
        System.out.println("priority-->"+ obj2.getPriority());
        obj1.start();
        obj2.start();

    }
}

