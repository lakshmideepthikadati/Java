package org.example.javabasics.unit3;

public class MethodReferenceExample {

    public static void main(String[] args) {
        // method reference example
        //Rule 1: ()->printMessage()
        Thread t= new Thread(MethodReferenceExample::printMessage); //this is same as ()->printMessage()
        t.start();


    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
